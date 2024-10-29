import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan verileri alma
        System.out.print("Mesafeyi (KM) girin: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini seçin (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Geçerlilik kontrolü
        if (mesafe <= 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        // Fiyat hesaplama
        double birimFiyat = 0.10; // km başına fiyat
        double toplamFiyat = mesafe * birimFiyat;

        // İndirim hesaplama
        if (yas < 12) {
            toplamFiyat *= 0.50; // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            toplamFiyat *= 0.90; // %10 indirim
        } else if (yas > 65) {
            toplamFiyat *= 0.70; // %30 indirim
        }

        if (yolculukTipi == 2) {
            toplamFiyat *= 0.80; // %20 indirim
        }

        // Sonuçları ekrana yazdırma
        System.out.printf("Toplam bilet fiyatınız: %.2f TL%n", toplamFiyat);
    }
}