import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Örnek dizi
        int[] dizi = {2, 4, 6, 8, 2, 4, 10, 12, 6, 8, 14, 18, 2};

        // Tekrar eden çift sayıları bulmak için HashSet kullanıyoruz
        HashSet<Integer> sayilar = new HashSet<>();
        HashSet<Integer> tekrarEdenCiftSayilar = new HashSet<>();

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) { // Sadece çift sayıları kontrol et
                if (!sayilar.add(dizi[i])) { // Eğer sayi daha önce eklenmişse tekrar eden sayıdır
                    tekrarEdenCiftSayilar.add(dizi[i]);
                }
            }
        }

        // Sonuçları ekrana yazdırma
        if (tekrarEdenCiftSayilar.isEmpty()) {
            System.out.println("Tekrar eden çift sayılar yok.");
        } else {
            System.out.println("Tekrar eden çift sayılar: " + tekrarEdenCiftSayilar);
        }
    }
}
