import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Bir yıl giriniz : ");
        int yil =   Scanner.nextInt();

        if (isArtikYil(yil)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        Scanner.close();
    }

    public static boolean isArtikYil(int yil) {
        // Artık yıl kontrolü
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                return yil % 400 == 0; // 400'e tam bölünüyorsa
            }
            return true; // 4'e tam bölünüyorsa
        }
        return false; // Diğer durumlar için
    }
}