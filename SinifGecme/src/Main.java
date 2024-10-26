import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fen, turkçe, fizik, kimya;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.println("Fen Notunuz : ");
        fen = input.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkçe = input.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = input.nextInt();

        double ort = (mat + fen + turkçe + fizik + kimya) / 5;
        if (ort <= 55) ;
        System.out.println("Sınıfta Kaldınız");
        if (ort > 55) System.out.println("Sınıfı Geçtiniz");
        System.out.println("Ortalamanız: " + ort);




    }
    }
