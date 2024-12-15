import java.util.Scanner;

public class Main {
    // Toplama işlemi
    public static void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double num1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();
        System.out.println("Sonuç: " + (num1 + num2));
    }

    // Çıkarma işlemi
    public static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double num1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();
        System.out.println("Sonuç: " + (num1 - num2));
    }

    // Çarpma işlemi
    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double num1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();
        System.out.println("Sonuç: " + (num1 * num2));
    }

    // Bölme işlemi
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double num1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Bir sayı sıfıra bölünemez!");
        } else {
            System.out.println("Sonuç: " + (num1 / num2));
        }
    }

    // Üslü sayı hesaplama
    public static void power() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tabanı girin: ");
        int base = scanner.nextInt();
        System.out.print("Üssü girin: ");
        int exponent = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç: " + result);
    }

    // Faktoriyel hesaplama
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    // Mod alma
    public static void mod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        int num1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin (mod değeri): ");
        int num2 = scanner.nextInt();
        System.out.println("Sonuç: " + (num1 % num2));
    }

    // Dikdörtgen alan ve çevre hesaplama
    public static void rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını girin: ");
        double length = scanner.nextDouble();
        System.out.print("Dikdörtgenin kısa kenarını girin: ");
        double width = scanner.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Dikdörtgenin alanı: " + area);
        System.out.println("Dikdörtgenin çevresi: " + perimeter);
    }

    // Ana metot
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menü
            System.out.println("\nGelişmiş Hesap Makinesi");
            System.out.println("1- Toplama İşlemi");
            System.out.println("2- Çıkarma İşlemi");
            System.out.println("3- Çarpma İşlemi");
            System.out.println("4- Bölme İşlemi");
            System.out.println("5- Üslü Sayı Hesaplama");
            System.out.println("6- Faktoriyel Hesaplama");
            System.out.println("7- Mod Alma");
            System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0- Çıkış");
            System.out.print("Bir işlem seçin: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
            }
        }
    }
}
