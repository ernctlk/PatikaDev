import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Kullanıcıdan matrisin boyutlarını alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını girin: ");
        int satir = scanner.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        // Matrisin elemanlarını alıyoruz
        int[][] matris = new int[satir][sutun];
        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Eleman [" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu almak
        int[][] transpoz = new int[sutun][satir]; // Transpoz matrisinin boyutları tersine çevrilmiş

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j]; // Matrisin elemanlarını yer değiştirerek koyuyoruz
            }
        }

        // Transpoz matrisini ekrana yazdırma
        System.out.println("Matrisin transpozu:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
