package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //  System.out.print("Girilen karakterin harf olup olmadigini kontrol ediniz ");
        //  char karakter = scan.next().charAt(0);
        //  if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z')) {
        //      System.out.println("girdiginiz karakter harftir");
        //  } else {
        //      System.out.println("Girdiginiz karakter harf degildir...");
        //  }

        System.out.println("Lütfen iki sayi giriniz: ");
        double i1 = scan.nextDouble();
        double i2 = scan.nextDouble();
        System.out.println("+ \"Toplama\" icin -> 1\n- \"Cikarma\" icin ->2 \n* \"Carpma\" icin -> 3 \n/ \"Bölme\" icin -> 4 seciniz");
        int secim = scan.nextInt();
        if (secim == 1) {
            System.out.println("Toplama sonucu: " + (i1 + i2));
        } else if (secim == 2) {
            System.out.println("Cikarma sonucu: " + (i1 - i2));
        } else if (secim == 3) {
            System.out.println("Carpma sonucu: " + (i1 * i2));
        } else if (secim == 4) {
            System.out.println("Bölme sonucu: " + (i1 / i2));
        } else {
            System.out.println("Hatali secim yaptiniz");
        }
    }
}