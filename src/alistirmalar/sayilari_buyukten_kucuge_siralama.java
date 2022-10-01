package alistirmalar;

import java.util.Scanner;

public class sayilari_buyukten_kucuge_siralama {



    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen siralamak istediginiz uc adet sayi giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a > b && a > c) {
            if (b > c) {

                System.out.println("a>b>c");

            } else {
                System.out.println("a>c>b");
            }
        } else if (c > a && c > b) {
            if (a < b) {
                System.out.println("c>b>a");
            } else {
                System.out.println("c>a>b");
            }
        } else {
            if (a < c) {
                System.out.println("b>c>a");
            } else
                System.out.println("b>a>c");

        }
    }
}