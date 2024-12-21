import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan dizinin boyutunu alıyoruz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        // Kullanıcıdan dizi elemanlarını alıyoruz
        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sıralıyoruz
        Arrays.sort(dizi);

        // Sıralanmış diziyi ekrana yazdırıyoruz
        System.out.println("Sıralanmış dizi:");
        for (int i = 0; i < boyut; i++) {
            System.out.print(dizi[i] + " ");
        }
        scanner.close();
    }
}
