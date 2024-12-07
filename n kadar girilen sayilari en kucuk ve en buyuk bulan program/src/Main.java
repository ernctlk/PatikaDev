import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        int n = scanner.nextInt();

        // Eğer kullanıcı 0 veya negatif bir sayı girerse program sonlanır.
        if (n <= 0) {
            System.out.println("Geçerli bir sayı giriniz.");
            return;
        }

        // İlk sayıyı alıp başlangıç olarak min ve max değerlerine atıyoruz.
        System.out.print("1. sayıyı girin: ");
        int firstNumber = scanner.nextInt();
        int min = firstNumber;
        int max = firstNumber;

        // Geri kalan sayıları karşılaştırarak min ve max değerlerini güncelliyoruz.
        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int number = scanner.nextInt();

            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        // Sonuçları ekrana yazdırıyoruz.
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

        scanner.close();
    }
}