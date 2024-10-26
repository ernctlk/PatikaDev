import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("İki sayıyı sırayla giriniz:");
        int sayi1 = s.nextInt();
        int sayi2 = s.nextInt();
        System.out.print("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma\nİşlemlerinden birini seçiniz: ");
        int secim = s.nextInt();
        switch (secim) {
            case 1 -> System.out.println("Toplam: " + (sayi1 + sayi2));
            case 2 -> System.out.println("İki sayının farkı: " + (sayi1 - sayi2));
            case 3 -> System.out.println("Bölüm: " + sayi1 / sayi2);
            case 4 -> System.out.println("Çarpım: " + sayi1 * sayi2);
            default -> System.out.println("Girdiğiniz sayı 1,2,3 ve 4 sayılarından biri olmalıdır.");
        }

    }
}