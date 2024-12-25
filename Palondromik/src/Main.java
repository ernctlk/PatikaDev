import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan girdi almak için Scanner sınıfı
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kelime girmesini istiyoruz
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        // Kelimeyi tersine çeviriyoruz
        String tersKelime = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);  // Kelimenin her bir karakterini ters sırayla ekliyoruz
        }

        // Orijinal kelime ile ters kelimeyi karşılaştırıyoruz
        if (kelime.equalsIgnoreCase(tersKelime)) {
            System.out.println(kelime + " bir Palindromik kelimedir.");
        } else {
            System.out.println(kelime + " bir Palindromik kelime değildir.");
        }

        scanner.close();  // Scanner'ı kapatıyoruz
    }
}
