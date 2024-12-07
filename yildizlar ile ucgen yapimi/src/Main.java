import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan giriş alın
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin yüksekliğini girin: ");
        int yukseklik = scanner.nextInt();

        // Yıldızlarla üçgeni yazdır
        for (int i = 1; i <= yukseklik; i++) {
            // Her satırda boşluk bırak
            for (int j = 1; j <= yukseklik - i; j++) {
                System.out.print(" ");  // Boşlukları yazdır
            }

            // Yıldızları yazdır
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");  // Yıldızları yazdır
            }

            // Satır sonunda yeni satıra geç
            System.out.println();
        }

        scanner.close();
    }
}