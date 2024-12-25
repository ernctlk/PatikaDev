import java.util.Random;
import java.util.Scanner;

public class Main {

    private static char[][] board; // Gösterilecek oyun tahtası
    private static char[][] mineField; // Gerçek mayınların bulunduğu alan
    private static boolean[][] revealed; // Hangi kutucukların açıldığını tutan dizi
    private static int rows, cols; // Satır ve sütun sayıları
    private static int totalMines; // Toplam mayın sayısı
    private static int revealedCells; // Açılan hücre sayısı

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan satır ve sütun sayısını alıyoruz
        getBoardSize(scanner);
        createBoard();
        placeMines();

        // Oyun başlatılıyor
        while (true) {
            printBoard();
            int[] coords = getUserInput(scanner);
            int row = coords[0];
            int col = coords[1];

            // Kullanıcı mayına basarsa oyun biter
            if (mineField[row][col] == '*') {
                System.out.println("Game Over! Mayına bastınız!");
                break;
            }

            // Kullanıcı doğru noktayı açarsa etrafındaki mayın sayısını hesapla
            revealCell(row, col);

            // Oyun kazanıldığında
            if (revealedCells == (rows * cols - totalMines)) {
                printBoard();
                System.out.println("Tebrikler! Oyunu kazandınız!");
                break;
            }
        }

        scanner.close();
    }

    // Kullanıcının geçerli bir satır ve sütun girmesini sağla
    private static void getBoardSize(Scanner scanner) {
        while (true) {
            System.out.print("Satır sayısını girin (minimum 2): ");
            rows = scanner.nextInt();
            System.out.print("Sütun sayısını girin (minimum 2): ");
            cols = scanner.nextInt();
            if (rows >= 2 && cols >= 2) {
                break;
            } else {
                System.out.println("Geçersiz boyut! Lütfen 2x2'den büyük bir değer girin.");
            }
        }
    }

    // Oyun tahtası ve mayınları oluşturma
    private static void createBoard() {
        board = new char[rows][cols];
        mineField = new char[rows][cols];
        revealed = new boolean[rows][cols];
        totalMines = (rows * cols) / 4;  // Mayın sayısı
        revealedCells = 0;

        // Başlangıçta tüm kutucukları "-" ile doldur
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
                mineField[i][j] = '0';
            }
        }
    }

    // Mayınları rastgele yerleştirme
    private static void placeMines() {
        Random rand = new Random();
        int minesPlaced = 0;

        while (minesPlaced < totalMines) {
            int r = rand.nextInt(rows);
            int c = rand.nextInt(cols);

            if (mineField[r][c] != '*') {
                mineField[r][c] = '*';  // Mayın yerleştir
                minesPlaced++;
            }
        }

        // Mayın yerleştirildikten sonra, her hücrenin etrafındaki mayın sayısını hesapla
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineField[i][j] != '*') {
                    mineField[i][j] = countAdjacentMines(i, j);
                }
            }
        }
    }

    // Verilen hücrenin etrafındaki mayınları sayma
    private static char countAdjacentMines(int row, int col) {
        int mineCount = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;

                // Sınırları kontrol et
                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    if (mineField[newRow][newCol] == '*') {
                        mineCount++;
                    }
                }
            }
        }

        return (char) ('0' + mineCount); // Sayıyı char'a dönüştür
    }

    // Kullanıcının girdiği satır ve sütun değerlerini almak
    private static int[] getUserInput(Scanner scanner) {
        int[] coords = new int[2];
        while (true) {
            System.out.print("Satır ve sütun girin (örn. 1 2): ");
            coords[0] = scanner.nextInt() - 1; // Satır (1'den başlar, 0'dan başlamak için -1)
            coords[1] = scanner.nextInt() - 1; // Sütun (1'den başlar, 0'dan başlamak için -1)

            if (coords[0] >= 0 && coords[0] < rows && coords[1] >= 0 && coords[1] < cols) {
                if (revealed[coords[0]][coords[1]]) {
                    System.out.println("Bu koordinat zaten açıldı, başka bir koordinat girin.");
                } else {
                    break;
                }
            } else {
                System.out.println("Geçersiz koordinat! Lütfen geçerli bir satır ve sütun girin.");
            }
        }
        return coords;
    }

    // Kullanıcının seçtiği hücreyi açma
    private static void revealCell(int row, int col) {
        if (mineField[row][col] == '0') {
            revealSurroundingCells(row, col);
        } else {
            board[row][col] = mineField[row][col];
            revealed[row][col] = true;
            revealedCells++;
        }
    }

    // Etrafındaki hücreleri açma (eğer '0' ise)
    private static void revealSurroundingCells(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || revealed[row][col]) {
            return;
        }

        board[row][col] = mineField[row][col];
        revealed[row][col] = true;
        revealedCells++;

        // Eğer '0' ise, komşu hücreleri açmak için recursive olarak çağır
        if (mineField[row][col] == '0') {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 && j == 0) continue;
                    revealSurroundingCells(row + i, col + j);
                }
            }
        }
    }

    // Oyun tahtasını ekrana yazdırma
    private static void printBoard() {
        System.out.println("\nOyun Tahtası:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
