import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double armutkg, elmakg, domateskg, muzkg, patlıcankg , armut , elma , domates , muz , patlıcan , toplamtutar ;
        Scanner inp = new Scanner(System.in);
        System.out.println("Armut Kilo :");
        armutkg = inp.nextInt();
        System.out.println("Elma Kilo :");
        elmakg = inp.nextInt();
        System.out.println("Domates Kilo :");
        domateskg = inp.nextInt();
        System.out.println("Muz Kilo :");
        muzkg = inp.nextInt();
        System.out.println("Patlıcan Kilo :");
        patlıcankg = inp.nextInt();

        armut= armutkg * 2.14;
        elma = elmakg * 3.67;
        domates = domateskg * 1.11;
        muz = muzkg * 0.95;
        patlıcan = patlıcankg * 5.00;
        toplamtutar = armut + elma + domates + muz + patlıcan ;
        System.out.println("Toplam Tutar : " + toplamtutar );








    }
}

