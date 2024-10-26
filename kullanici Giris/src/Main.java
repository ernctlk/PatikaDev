import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "ernctlk", password = "eren2002", usernameCheck, passwordCheck;
        System.out.print("Kullanıcı Adı: ");
        usernameCheck = scanner.next();

        System.out.print("Şifre: ");
        passwordCheck = scanner.next();

        switch (usernameCheck) {
            case "ernctlk":
                break;
            default:
                System.out.println("Kullanıcı adı yanlış tekrar deneyiniz");
                System.out.print("Kullanıcı Adı: ");
                usernameCheck = scanner.next();

        }
        switch (passwordCheck) {
            case "eren2002":
                System.out.println("-- Giriş Başarılı --");
                break;
            default:
                System.out.print("Şifre yanlış değiştirmek ister misiniz? (type 'evet' veya 'hayır'): ");
        }
        {
            String choice = scanner.next();

            switch (choice) {
                case "evet":
                    System.out.println("Yeni Şifre");
                    passwordCheck = scanner.next();

                    if (password.equals(passwordCheck = "eren2002")) ;
                    System.out.println("Yeni şifre Eski şifre ile aynı olamaz lütfen başka şifre giriniz");
                    passwordCheck = scanner.next();
                    System.out.println("İyi Günler");
                    break;

                default:
                    System.out.println("İyi Günler");
                    break;


            }
        }
    }
}
