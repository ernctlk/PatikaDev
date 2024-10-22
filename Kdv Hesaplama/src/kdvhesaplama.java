import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class kdvhesaplama
{
  public static void main(String[] args) {
    double alışFiyatı, kar, kdv, ürünfiyatı;
    kar = 1.30;
    kdv = 1.20;
    Scanner inp = new Scanner(System.in);
    System.out.println("Alış Fiyatını girihiz:");
    alışFiyatı = inp.nextDouble();
    ürünfiyatı=(alışFiyatı*kar)*kdv;
    System.out.println("Ürün Satış Fiyatınız kdv dahil=");
    System.out.println(ürünfiyatı);

  }
}

