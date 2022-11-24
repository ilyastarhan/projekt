package alistirmalar;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {

        Random rand = new Random();
        int computerNumber = rand.nextInt(100);
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen tahmin icin sayi giriniz: ");
        int min = 0;
        int max = 100;
        int tahmin;
        int tahminHakki = 10;
        while (tahminHakki > 0) {
            tahmin = scan.nextInt();
            if (tahmin < computerNumber) {
                min = tahmin;
                System.out.println("Bilemedin, daha yüksek bir sayi söylemen lazim. Sayi " + min + " ve" + max + " arasinda bulunuyor");
            } else if (tahmin > computerNumber) {
                max = tahmin;
                System.out.println("Bilemedin, daha asagi bir sayi söylemen lazim. Sayi " + min + " ve " + max + " arasinda bulunuyor");

            } else {System.out.println("Tebrikler sayiyi buldun");
            break;}
            System.out.println("Kalan tahminHakki = " + (--tahminHakki));

        }
        if(tahminHakki==0){
            System.out.println("oyunu kaybettin");
        }


    }
}
