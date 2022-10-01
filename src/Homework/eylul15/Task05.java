package Homework.eylul15;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        //task5
        /*
         * Girilen saati  saniyeye çeviren program yazınız
         * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen saniyeye cevirmek istediginz saat degerini giriniz: ");
        double saat = scan.nextDouble();
        System.out.println("Girdiginiz saat degeri " + saat*3600 + " saniye yapar");


    }
}
