import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        // Sayının pozitif bölenlerini bul ve toplamını hesapla
        for (int i = 1; i < sayi; i++) { // 'sayi' hariç bölenleri kontrol eder
            if (sayi % i == 0) { // Eğer tam bölünüyorsa
                toplam += i; // Toplama ekle
            }
        }

        // Mükemmel sayı kontrolü
        if (toplam == sayi) {
            System.out.println(sayi + " bir mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " bir mükemmel sayı değildir.");
        }

        scanner.close();
    }
}