import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // değişkenleri oluşturma
        int a,b;
        double c;

        // kullanıcıdan verileri alma
        Scanner girdi  = new Scanner(System.in);
        System.out.println("1.Kenarı Giriniz");
        a = girdi.nextInt();
        System.out.println("2.Kenarı giriniz");
        b =girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs :" + c );
    }
}