package alistirmalar;

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz...");
        String isim = scan.nextLine();

        System.out.println("lütfen yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Girilen isim: " + isim + "\nGirilen yas: " + yas);

        System.out.println("yeni bir deger giriniz :  ");
        int yeni = scan.nextInt();
        System.out.println(yeni);


    }
}
