import java.util.HashMap;
import java.util.Scanner;

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

        // Elemanların frekanslarını hesaplamak için HashMap kullanıyoruz
        HashMap<Integer, Integer> frekansMap = new HashMap<>();

        // Dizideki her elemanı kontrol et ve frekansını güncelle
        for (int i = 0; i < boyut; i++) {
            // Eğer eleman daha önce eklenmişse, frekansını artır
            frekansMap.put(dizi[i], frekansMap.getOrDefault(dizi[i], 0) + 1);
        }

        // Frekansları ekrana yazdırıyoruz
        System.out.println("Elemanların frekansları:");
        for (Integer eleman : frekansMap.keySet()) {
            System.out.println("Eleman " + eleman + " -> Frekans: " + frekansMap.get(eleman));
        }

        scanner.close();
    }
}
