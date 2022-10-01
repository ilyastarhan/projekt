package Homework.eylul15;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ciftlikte bulunan inek, koyun ve tavuk sayilarini sirasiyla giriniz: ");
        int inek_sayi = scan.nextInt();
        int koyun_sayi = scan.nextInt();
        int tavuk_sayi = scan.nextInt();
        System.out.println("Ciftliginizdeki ineklerin toplam " + inek_sayi*4 + ",");
        System.out.println("Ciftliginizdeki koyunlarin toplam " + koyun_sayi*4 + ",");
        System.out.println("Ciftliginizdeki tavuklarin toplam " + tavuk_sayi*2 + " ayagi vardir");





    }

}
