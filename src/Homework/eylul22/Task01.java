package Homework.eylul22;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 10 ile 1000 arasinda bir sayi giriniz = ");
        int sayi = scan.nextInt();
        if (sayi < 100 && sayi >= 10) {
            int onlar = sayi / 10;
            switch (onlar) {
                case 1:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Bir\"");
                    break;
                case 2:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Iki\"");
                    break;
                case 3:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Uc\"");
                    break;
                case 4:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Dort\"");
                    break;
                case 5:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Bes\"");
                    break;
                case 6:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Alti\"");
                    break;
                case 7:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Yedi\"");
                    break;
                case 8:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Sekiz\"");
                    break;
                default:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Dokuz\"");
                    break;
            }
        } else if (sayi < 1000 && sayi >= 100) {
            int onlar = (sayi / 10) % 10;
            switch (onlar) {
                case 1:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Bir\"");
                    break;
                case 2:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Iki\"");
                    break;
                case 3:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Uc\"");
                    break;
                case 4:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Dort\"");
                    break;
                case 5:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Bes\"");
                    break;
                case 6:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Alti\"");
                    break;
                case 7:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Yedi\"");
                    break;
                case 8:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Sekiz\"");
                    break;
                default:
                    System.out.println("Girilen sayinin onlar basamagi\n\"Dokuz\"");
                    break;
            }
        } else {
            System.out.println("Lütfen \"0\" ile \"999\" arasi bir sayi giriniz...");
        }
    }
}