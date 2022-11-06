package alistirmalar.diger;

import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {
        float a, b;
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen islem yapmak istediginiz ilk sayiyi giriniz: ");
        a = scan.nextFloat();
        System.out.print("Lütfen islem yapmak istediginiz ikinci sayiyi giriniz: ");
        b = scan.nextFloat();
        System.out.println("Lütfen isleminizi seciniz...");
        System.out.println("1. Toplama" + "\n2. Cikarma" + "\n3. Carpma" + "\n4. Bölme");
        sayi = scan.nextInt();


        switch (sayi) {
            case 1:
                System.out.println("Girdiginiz iki sayinin toplami: " + (a + b));
                break;
            case 2:
                System.out.println("Girdiginiz iki sayinin farki: " + (a - b));
                break;
            case 3:
                System.out.println("Girdiginiz iki sayinin carpimi: " + (a * b));
                break;
            case 4:
                System.out.println("Girdiginiz iki sayinin birbirine bölümü: " + (a / b));
                break;
            default: {
                System.out.println("Lütfen 1 ile 4 arasinda bir secim yapiniz");
                break;
            }
        }
    }
}
