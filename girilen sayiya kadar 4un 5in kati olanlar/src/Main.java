import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        int sayi = Scanner.nextInt();


        for(int i = 0 ; i<= sayi ;i++) {
        if (i % 4 ==0 && i % 5 ==0);
            System.out.println("Girdiğiniz Sayıya Kadar 4'ün ve 5'in katı olan sayılar : "+ i);

        }

        }
    }
