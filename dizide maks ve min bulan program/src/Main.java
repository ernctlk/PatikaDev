import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Örnek dizi
        int[] dizi = {10, 20, 30, 40, 50, 60};

        // Kullanıcıdan bir sayı al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int girilenSayi = scanner.nextInt();

        // Küçük ve büyük en yakın sayıları bulma
        int enKucukYakın = Integer.MIN_VALUE;
        int enBuyukYakın = Integer.MAX_VALUE;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < girilenSayi && dizi[i] > enKucukYakın) {
                enKucukYakın = dizi[i];
            }
            if (dizi[i] > girilenSayi && dizi[i] < enBuyukYakın) {
                enBuyukYakın = dizi[i];
            }
        }

        // Sonuçları ekrana yazdırma
        if (enKucukYakın != Integer.MIN_VALUE) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukYakın);
        } else {
            System.out.println("Girilen sayıdan küçük bir sayı bulunamadı.");
        }

        if (enBuyukYakın != Integer.MAX_VALUE) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukYakın);
        } else {
            System.out.println("Girilen sayıdan büyük bir sayı bulunamadı.");
        }

        scanner.close();
    }
}
