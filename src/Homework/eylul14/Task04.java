package Homework.eylul14;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* Projeler.TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String isim = scan.nextLine();
        System.out.println("Lütfen Soyisminizi giriniz: ");
        String soy_isim = scan.nextLine();
        System.out.println("Lütfen yasinizi giriniz: ");
        int yas = scan.nextInt();
        System.out.println("Lütfen boyunuzu \"cm\" olarak giriniz: ");
        int boy = scan.nextInt();
        System.out.println("Lütfen salona devam edeceginiz süreyi \"ay\" olrak giriniz: ");
        int ay = scan.nextInt();
        System.out.println("Sayin " + isim + " " + soy_isim + " salon icin ödeyeceginiz toplam tutar: " + ay*20 + "$");


    }
}
