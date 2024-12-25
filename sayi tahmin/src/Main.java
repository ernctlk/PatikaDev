import java.util.Scanner;  // Kullanıcı girişi için Scanner sınıfını ekliyoruz.
import java.util.Random;   // Rastgele sayı üretmek için Random sınıfını ekliyoruz.

public class Main {
    public static void main(String[] args) {
        // Rastgele bir sayı üretmek için Random nesnesi
        Random random = new Random();
        int rastgeleSayı = random.nextInt(101);  // 0 ile 100 arasında rastgele bir sayı seçiliyor.

        // Kullanıcıdan giriş almak için Scanner nesnesi
        Scanner scanner = new Scanner(System.in);

        int tahmin = -1;  // Başlangıçta geçersiz bir tahmin değeri
        int denemeSayısı = 0;  // Tahmin sayısını takip etmek için bir sayaç

        // Kullanıcı doğru tahmin yapana kadar döngü çalışacak
        System.out.println("0 ile 100 arasında bir sayı tahmin edin!");

        // Kullanıcının tahmin yapmaya devam etmesini sağlayan döngü
        while (tahmin != rastgeleSayı) {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();  // Kullanıcının tahminini alıyoruz.

            denemeSayısı++;  // Tahmin sayısını artırıyoruz.

            // Tahmin doğru mu kontrol ediyoruz
            if (tahmin < rastgeleSayı) {
                System.out.println("Daha yüksek bir sayı tahmin edin.");
            } else if (tahmin > rastgeleSayı) {
                System.out.println("Daha düşük bir sayı tahmin edin.");
            } else {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                System.out.println("Toplam deneme sayınız: " + denemeSayısı);
            }
        }

        scanner.close();  // Kaynakları serbest bırakmak için scanner'ı kapatıyoruz.
    }
}
