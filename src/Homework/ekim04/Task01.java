package Homework.ekim04;

import java.util.Scanner;

public class Task01 {
    static Scanner scan = new Scanner(System.in);
    static int oyuncu1puan = 0;
    static int oyuncu2puan = 0;
    static String oyuncu1kelime = "";
    static String oyuncu2kelime = "";

    public static void main(String[] args) {
        /* Iki kisinin oynayacagi bir kelime oyunu uretelim
         * Kurallar
         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
         *
         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
         *        ve 3.adima gecin
         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
         *        kazandigini yazip oyunu bitirin
         *
         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
         *          basa mi sona mi ekleyecegini sorun
         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
         *
         *      *   Devam etmek istemezse
         *          "Oyun bitti" yazin
         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
         */


        System.out.println("*****kelime yarismamiza hosgeldiniz*****");

        oyuncu1();

    }

    private static void oyuncu1() {

        System.out.println("1. Oyuncu-> Lütfen bir kelime girin: ");
        String anakelime = scan.next().toLowerCase();
        System.out.println("Lütfen eklemek istediginiz Stringi giriniz: ");
        String str = scan.next().toLowerCase();
        System.out.println("Stringi kelimenin basina eklemek icin ->1\nsonuna eklemek icin ->2 'ye basiniz: ");
        int secim1 = scan.nextInt();
        if (secim1 == 1) {
            oyuncu1kelime = str.concat(anakelime);
        } else if (secim1 == 2) {
            oyuncu1kelime = anakelime.concat(str);
        } else {
            System.out.println("Hatali secim yaptiniz...");
            oyuncu1();
        }kelimekabuloyuncu2();
    }

    private static void kelimekabuloyuncu1() {
        System.out.println("2. oyuncunun girdigi kelime: " + oyuncu2kelime);
        System.out.println(" Kabul ediyor musunuz ?\nEvet icin ->1\nHayir icin ->2 'ye basiniz: ");
        int secim = scan.nextInt();
        if (secim == 1) {
            oyuncu2puan += oyuncu2kelime.length();
            devammioyuncu1();
        } else if (secim == 2) {
            System.out.println("Gecersiz kelime");
            oyunsonu();
        } else {
            System.out.println("hatali secim yaptiniz...");
            kelimekabuloyuncu1();
        }
    }

    private static void kelimekabuloyuncu2() {
        System.out.println("1. oyuncunun girdigi kelime: " + oyuncu1kelime);
        System.out.println(" Kabul ediyor musunuz ?\nEvet icin ->1\nHayir icin ->2 'ye basiniz: ");
        int secim = scan.nextInt();
        if (secim == 1) {
            oyuncu1puan += oyuncu1kelime.length();
            devammioyuncu2();
        } else if (secim == 2) {
            System.out.println("Gecersiz kelime");
            oyunsonu();
        } else {
            System.out.println("hatali secim yaptiniz...");
            kelimekabuloyuncu2();
        }
    }

    private static void devammioyuncu1() {
        System.out.println("Oyuncu 1 devam etmek istiyor musunuz? ");
        System.out.println("Evet icin ->1\nHayir icin ->2 'ye basiniz: ");
        int secim = scan.nextInt();
        if (secim == 1) {
            System.out.println("Lütfen eklemek istediginiz Stringi giriniz: ");
            String str = scan.next().toLowerCase();
            System.out.println("Stringi kelimenin basina eklemek icin ->1\nsonuna eklemek icin ->2 'ye basiniz: ");
            int secim1 = scan.nextInt();
            if (secim1 == 1) {
                oyuncu1kelime = str.concat(oyuncu2kelime);
                System.out.println(oyuncu1kelime);
                kelimekabuloyuncu2();
            } else if (secim1 == 2) {
                oyuncu1kelime = oyuncu2kelime.concat(str);
                System.out.println(oyuncu1kelime);
                kelimekabuloyuncu2();

            } else {
                System.out.println("Hatali secim yaptiniz...");
                devammioyuncu1();
            }
        } else if (secim == 2) {
            oyunsonu();
        } else {
            System.out.println("Hatali secim yaptiniz...");
            devammioyuncu1();
        }
    }

    private static void devammioyuncu2() {
        System.out.println("Oyuncu 2 devam etmek istiyor musunuz? ");
        System.out.println("Evet icin ->1\nHayir icin ->2 'ye basiniz: ");
        int secim = scan.nextInt();
        if (secim == 1) {
            System.out.println("Lütfen eklemek istediginiz Stringi giriniz: ");
            String str = scan.next().toLowerCase();
            System.out.println("Stringi kelimenin basina eklemek icin ->1\nsonuna eklemek icin ->2 'ye basiniz: ");
            int secim1 = scan.nextInt();
            if (secim1 == 1) {
                oyuncu2kelime = str.concat(oyuncu1kelime);
                System.out.println(oyuncu2kelime);
            } else if (secim1 == 2) {
                oyuncu2kelime = oyuncu1kelime.concat(str);
                System.out.println(oyuncu2kelime);
            } else {
                System.out.println("Hatali secim yaptiniz...");
                devammioyuncu2();
            }
            kelimekabuloyuncu1();
        } else if (secim == 2) {
            oyunsonu();
        } else {
            System.out.println("Hatali secim yaptiniz...");
            devammioyuncu2();
        }
    }

    private static void oyunsonu() {
        System.out.println("oyun bitti");
        System.out.println("Oyuncu 1'in puani: " + oyuncu1puan);
        System.out.println("Oyuncu 2'in puani: " + oyuncu2puan);
    }
}