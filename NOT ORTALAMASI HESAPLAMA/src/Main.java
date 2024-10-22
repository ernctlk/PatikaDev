import org.w3c.dom.ls.LSOutput;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// DEĞİŞKENLERİ OLUŞTUR
        int mat, fizik, kimya,turkce,tarih,muzik;



        //Scanner sınıfını tanımlama
       Scanner inp=new Scanner(System.in);

       // kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz:");
        mat=inp.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik=inp.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya=inp.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce=inp.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih=inp.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik=inp.nextInt();

        double toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6.0;


        System.out.println("Ortalamanız: " + sonuc);
        if (sonuc<50) System.out.println("Kaldınız");
        else System.out.println("Geçtiniz");




    }
    }
