import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n , k ;
        Scanner input = new Scanner(System.in);
        System.out.println("Üstü Alınacak Sayı : ");
        n = input.nextInt();
        System.out.println("Üs Olacak Sayı : ");
        k= input.nextInt();
        int total=1 , i = 1;
        while (i<= k){
            total*= n;
            i++;


        }
        System.out.println("Cevap: "+total);
    }
}