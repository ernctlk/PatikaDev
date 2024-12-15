import java.util.Scanner;

public class Main {
    // Recursive üs alma metodu
    public static int power(int base, int exponent) {
        // Üs 0 ise, sonuç 1'dir (base case)
        if (exponent == 0) {
            return 1;
        }
        // Üs negatif ise, hatalı giriş
        if (exponent < 0) {
            System.out.println("Negatif üs desteklenmiyor!");
            return -1; // Hata kodu
        }
        // Recursive çağrı (base ^ exponent = base * base ^ (exponent - 1))
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini al
        System.out.print("Taban değerini girin: ");
        int base = scanner.nextInt();
        System.out.print("Üs değerini girin: ");
        int exponent = scanner.nextInt();

        // Recursive metodu çağır ve sonucu ekrana yazdır
        int result = power(base, exponent);
        if (result != -1) {
            System.out.println(base + " üzeri " + exponent + " = " + result);
        }

        scanner.close();
    }
}
