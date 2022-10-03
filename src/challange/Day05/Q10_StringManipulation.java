package challange.Day05;

import java.util.Scanner;

public class Q10_StringManipulation {
    public static void main(String[] args) {

// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scan = new Scanner(System.in);
        String isim = scan.nextLine();
        String soy_isim = scan.nextLine();
        if (isim.length() > soy_isim.length()) {
            System.out.println("isim soyisimden uzundur");
        }
        else if (isim.length() < soy_isim.length()) {
            System.out.println("soyisim isimden uzundur");
        }
        else System.out.println("isim ve soyisim uzunlujklari esittir");


    }
}
