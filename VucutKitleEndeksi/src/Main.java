import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double boy, kilo, boyKaresi, sonuc;


        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz(cm) :");
        boy = inp.nextInt();
        System.out.println("Kilonuzu Giriniz(kg) :");
        kilo = inp.nextInt();
        boyKaresi = (boy * boy) / 10000;
        sonuc = kilo / boyKaresi;
        System.out.println("Vücut Kitle Endeksiniz : " + sonuc);
        if (sonuc < 18.5) System.out.println("Düşük Kilolu ");
        if (sonuc < 24.9 && sonuc > 18.5) System.out.println("Sağlıklı Kilo ");
        if (sonuc < 29.9 && sonuc > 24.9) System.out.println("Fazla Kilolu ");
        if (sonuc > 30 && sonuc < 34.9) System.out.println("1. sınıf obezite");
        if (sonuc > 35 && sonuc < 39.9) System.out.println("2. sınıf obezite");
        if (sonuc > 40) System.out.println("3. sınıf obezite");
    }
}