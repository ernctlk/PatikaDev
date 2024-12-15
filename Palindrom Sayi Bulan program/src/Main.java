import java.util.Scanner;

public class Main {
    // Palindrom kontrolü yapan metot
    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Sayının orijinal halini sakla
        int reversedNumber = 0;      // Ters çevrilmiş sayı
        int remainder;

        // Sayıyı ters çevir
        while (number != 0) {
            remainder = number % 10; // Son basamağı al
            reversedNumber = reversedNumber * 10 + remainder; // Sayıyı tersine çevir
            number /= 10; // Son basamağı çıkar
        }

        // Ters çevrilmiş sayı ile orijinal sayı eşitse, palindromdur
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı al
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        // Palindrom olup olmadığını kontrol et
        if (isPalindrome(number)) {
            System.out.println(number + " bir palindrom sayıdır.");
        } else {
            System.out.println(number + " bir palindrom sayı değildir.");
        }

        scanner.close();
    }
}
