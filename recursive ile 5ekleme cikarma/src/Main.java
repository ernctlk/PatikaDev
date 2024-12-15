import java.util.Scanner;

public class Main {

    // Recursive metot: Çıkarma ve ekleme işlemlerini yapacak
    public static void processNumber(int n) {
        // 0 veya negatif sayıya kadar 5 çıkarma işlemi
        if (n <= 0) {
            // 0 veya negatif değere ulaşıldıysa 5 ekleme işlemine başla
            System.out.println(n);
            return; // Recursive işlem burada sona eriyor
        }

        // Çıkarma işlemi: Sayıdan 5 çıkar ve sonucu yazdır
        System.out.println(n);
        processNumber(n - 5); // Recursive olarak 5 çıkarma işlemi tekrarlanacak
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sayı alınır
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        // Sayıdan 5 çıkarma işlemi başlatılır
        processNumber(number);

        // Sonra 5 ekleme işlemi başlatılır
        // İlk olarak sayıyı yazdırıp 5 ekleriz
        while (number <= 0) {
            System.out.println(number);
            number += 5;
        }

        scanner.close();
    }
}
