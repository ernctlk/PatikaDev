import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan terim sayısı al
        System.out.print("Kaç terim üretilecek? ");
        int terimSayisi = scanner.nextInt();

        // Fibonacci Serisi
        System.out.println("\nFibonacci Serisi:");
        fibonacciSerisi(terimSayisi);

        // Acci Serisi
        System.out.println("\nAcci Serisi:");
        acciSerisi(terimSayisi);

        scanner.close();
    }

    // Fibonacci Serisini Hesaplayan Metot
    public static void fibonacciSerisi(int terimSayisi) {
        int a = 0, b = 1;

        System.out.print(a + " " + b); // İlk iki terimi yazdır
        for (int i = 2; i < terimSayisi; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b; // a bir sonraki terime geçer
            b = c; // b bir sonraki terime geçer
        }
        System.out.println();
    }

    // Acci Serisini Hesaplayan Metot
    public static void acciSerisi(int terimSayisi) {
        int a = 1, b = 2;

        System.out.print(a + " " + b); // İlk iki terimi yazdır
        for (int i = 2; i < terimSayisi; i++) {
            int c = a + b + 1; // Acci serisinin farkı burada
            System.out.print(" " + c);
            a = b; // a bir sonraki terime geçer
            b = c; // b bir sonraki terime geçer
        }
        System.out.println();
    }
}