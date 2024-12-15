import java.util.Scanner;

public class Main {
    // Recursive asal kontrol metodu
    public static boolean isPrime(int number, int divisor) {
        // 1 asal sayı değildir
        if (number <= 1) {
            return false;
        }
        // Bölünen değeri kendisine kadar kontrol ettiyse, asal
        if (divisor == 1) {
            return true;
        }
        // Eğer tam bölünürse asal değildir
        if (number % divisor == 0) {
            return false;
        }
        // Recursive çağrı (bir sonraki daha küçük böleni kontrol et)
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı girişi
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        // Recursive fonksiyonu çağır ve sonucu kontrol et
        boolean result = isPrime(number, number / 2);

        // Sonucu ekrana yazdır
        if (result) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }

        scanner.close();
    }
}
