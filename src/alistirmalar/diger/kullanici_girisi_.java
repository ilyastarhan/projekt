package alistirmalar.diger;

import java.util.Scanner;

public class kullanici_girisi_ {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen kullanici adinizi giriniz: ");
        String kullanici_adi = scan.nextLine();
        System.out.print("Lütfen parolanizi giriniz: ");
        String parola = scan.nextLine();

        if(kullanici_adi.equals("ilyas") && parola.equals("427597")) {
            System.out.println("Tebrikler... Sisteme basarili bir sekilde giris yaptiniz...");}
            else
            System.out.println("Lütfen tekrar deneyiniz...");



    }
}