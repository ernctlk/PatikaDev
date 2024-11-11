import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        // Sayının basamaklarının toplamını hesaplamak için değişken
        int toplam = 0;

        // Sayının her bir basamağını al ve toplamda topla
        while (sayi != 0) {
            toplam += sayi % 10;  // Son basamağı al ve toplama ekle
            sayi /= 10;  // Son basamağı çıkar
        }

        // Sonucu ekrana yazdır
        System.out.println("Basamaklar toplamı: " + toplam);

        scanner.close();
    }
}