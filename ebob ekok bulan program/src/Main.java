import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayı alalım
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        // EBOB Hesaplama (while döngüsü ile)
        int ebob = 1;  // EBOB başlangıç değeri, 1 çünkü tüm sayılar 1'e bölünebilir
        int i = 1;

        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;  // Eğer ortak bölen bulunursa, bu bölen en büyük EBOB olabilir
            }
            i++;
        }

        // EKOK Hesaplama
        // EKOK hesaplamak için: EKOK = (sayi1 * sayi2) / EBOB
        int ekok = (sayi1 * sayi2) / ebob;

        // Sonuçları ekrana yazdır
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        scanner.close();
    }
}
