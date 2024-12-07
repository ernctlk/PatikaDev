public class Main {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");

        // 1 ile 100 arasındaki sayılar için döngü
        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;

            // Sayının asal olup olmadığını kontrol et
            for (int bolen = 2; bolen <= Math.sqrt(sayi); bolen++) {
                if (sayi % bolen == 0) { // Eğer tam bölünüyorsa asal değil
                    asalMi = false;
                    break; // Daha fazla kontrol etmeye gerek yok
                }
            }

            // Asal olan sayıları yazdır
            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}