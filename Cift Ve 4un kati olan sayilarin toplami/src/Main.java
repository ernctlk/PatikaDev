import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        while (true) {
            System.out.print("Bir sayı girin (tek sayı girene kadar devam edecek): ");
            int sayi = scanner.nextInt();


            if (sayi % 2 != 0) {
                break;
            }

            // Çift ve 4'ün katı kontrolü
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);
        scanner.close();
    }
}