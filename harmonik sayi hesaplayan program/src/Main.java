import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan giriş al
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin (n): ");
        int n = scanner.nextInt();

        // Harmonik sayıyı hesapla
        double harmonik = 0.0;

        // n'e kadar olan sayıları toplama
        for (int i = 1; i <= n; i++) {
            harmonik += 1.0 / i;
        }

        // Sonucu ekrana yazdır
        System.out.println(n + ". Harmonik Sayısı: " + harmonik);

        scanner.close();
    }
}