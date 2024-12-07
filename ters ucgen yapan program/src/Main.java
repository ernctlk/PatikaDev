import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ters üçgenin yüksekliği (satır sayısı): ");
        int satirSayisi = scanner.nextInt();

        // Ters üçgen çizimi
        for (int i = satirSayisi; i > 0; i--) {
            // Boşlukları yazdır
            for (int j = 0; j < satirSayisi - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Bir satırı tamamladıktan sonra alt satıra geç
            System.out.println();
        }

        scanner.close();
    }
}