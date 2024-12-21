public class Main {
    public static void main(String[] args) {
        // Örnek dizi
        int[] dizi = {10, 20, 30, 40, 50};

        // Dizideki elemanların toplamını bulma
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }

        // Ortalamayı hesaplama
        double ortalama = (double) toplam / dizi.length;

        // Sonucu ekrana yazdırma
        System.out.println("Dizinin ortalaması: " + ortalama);
    }
}
