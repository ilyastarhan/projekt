package Homework.eylul15;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
         * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
         * 1 saat = 3600 saniye
         * 1 dk   = 60 saniye
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen \"saat\", \"dakika\" ve \"saniye\" olarak görmek istediginiz sayiyi giriniz: ");
        int saniye = scan.nextInt();
        int saat = saniye/(3600);
        int dakika = (saniye-(saat*3600))/60;
        int kalan_saniye = saniye - (saat*3600) - (dakika*60);
        System.out.println(saat + " saat " + dakika + " dakika " + kalan_saniye + " saniye" );

    }
}
