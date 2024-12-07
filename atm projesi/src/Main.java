import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sabit kullanıcı adı ve şifre
        String dogruKullaniciAdi = "ernctlk";
        String dogruSifre = "9052";

        String kullaniciAdi, sifre;
        int girisHakki = 3;  // Kullanıcının üç hakkı var

        // Kullanıcı girişi için döngü
        while (girisHakki > 0) {
            System.out.print("Kullanıcı adınızı girin: ");
            kullaniciAdi = scanner.nextLine();

            System.out.print("Şifrenizi girin: ");
            sifre = scanner.nextLine();

            // Kullanıcı adı ve şifre kontrolü
            if (kullaniciAdi.equals(dogruKullaniciAdi) && sifre.equals(dogruSifre)) {
                System.out.println("Giriş başarılı!");
                menu(scanner); // Ana menüyü aç
                break;  // Giriş başarılıysa program sonlanır
            } else {
                girisHakki--; // Hakkı bir azalt
                System.out.println("Yanlış kullanıcı adı veya şifre! Kalan giriş hakkınız: " + girisHakki);

                // Eğer 3 hakkı da kaybetmişse, banka ile iletişime geçmesini söyleriz
                if (girisHakki == 0) {
                    System.out.println("Hakkınız bitti. Bankayla iletişime geçin.");
                }
            }
        }

        scanner.close();
    }

    // Ana menü
    public static void menu(Scanner scanner) {
        int secim;
        do {
            System.out.println("\nATM Menü");
            System.out.println("1. Bakiye Görüntüle");
            System.out.println("2. Para Çekme");
            System.out.println("3. Para Yatırma");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminizi yapın (1-4): ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Bakiye görüntüleniyor...");
                    System.out.println("Bakiyeniz : 1TL - Para yok pis fakir git çalış lan it :) ");
                    break;
                case 2:
                    System.out.println("Para çekme işlemi...");
                    System.out.println("Çekecek para mı var ulan fakir it ");
                    break;
                case 3:
                    System.out.println("Para yatırma işlemi...");
                    System.out.println("ooo reis paralandın herhalde hesap biraz para görsün ");
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    System.out.println("Siktir git len pis fakir");
                    break;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        } while (secim != 4);  // Çıkış seçeneği seçilene kadar menü devam eder
    }
}
