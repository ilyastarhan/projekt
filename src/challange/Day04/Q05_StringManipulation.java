package challange.Day04;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 kelime giriniz");
        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();
        String s4 = scan.next();
        System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1) + " " + s2 + " " + s3 + " " + s4 + ".");
    }
}
