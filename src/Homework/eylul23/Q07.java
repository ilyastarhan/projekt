package Homework.eylul23;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* Projeler.TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir isim girniz");
        String isim = scan.nextLine();

            if (isim.length() > 3) {
                System.out.println("Girdiginiz isim 3 karakterden fazladir. Lütfen yeni bir isim giriniz..");
            } else {
                System.out.println(isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2) || isim.charAt(1) == isim.charAt(2) ? "girdiginiz veride en az bir adet ayni harf verdir" : "Girdiginiz verideki tüm harfler birbirinde farklidir");
            }
        }
}