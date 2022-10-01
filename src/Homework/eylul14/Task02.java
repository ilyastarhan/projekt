package Homework.eylul14;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu \"cm\" olarak giriniz ");
        double boy = scan.nextDouble()/100;
        System.out.println("Lütfen kilonuzu \"kg\" olarak giriniz ");
        int kilo = scan.nextInt();
        double vke = kilo/(Math.pow(boy, 2));
        System.out.println("Vücut kitle endeksiniz " + (int)vke + " boy/kg² dir" + "\nVücut kitle endeksiniz " + vke + " boy/kg² dir");


    }
}
