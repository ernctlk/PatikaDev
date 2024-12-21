public class Main {
    public static void main(String[] args) {
        // E harfi için 2 boyutlu dizi
        int satir = 7; // E harfinin yüksekliği
        int sutun = 5; // E harfinin genişliği

        // E harfi için çok boyutlu dizi oluşturuluyor
        char[][] dizi = new char[satir][sutun];

        // Diziyi yıldızlar ile dolduruyoruz
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                if (j == 0) {
                    // E harfinin sol dikey çizgisi
                    dizi[i][j] = '*';
                } else if (i == 0 || i == satir - 1 || i == satir / 2) {
                    // E harfinin üst, alt ve orta yatay çizgileri
                    dizi[i][j] = '*';
                } else {
                    dizi[i][j] = ' '; // Diğer yerler boş
                }
            }
        }

        // E harfini ekrana yazdırma
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(dizi[i][j]);
            }
            System.out.println(); // Her satırdan sonra yeni satıra geç
        }
    }
}
