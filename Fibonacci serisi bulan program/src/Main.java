import java.util.Scanner;

public class Main {
    // Fibonacci serisini hesaplayan metot
    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;

        System.out.print("Fibonacci Serisi: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // İlk sayıyı yazdır
            int next = first + second;    // Bir sonraki Fibonacci sayısını hesapla
            first = second;              // İkinci sayı, ilk sayı olur
            second = next;               // Yeni sayı, ikinci sayı olur
        }
        System.out.println(); // Yeni satıra geç
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan eleman sayısı iste
        System.out.print("Kaç elemanlı Fibonacci serisi istiyorsunuz? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen 1 veya daha büyük bir sayı girin.");
        } else {
            printFibonacciSeries(n); // Fibonacci serisini yazdır
        }

        scanner.close();
    }
}
