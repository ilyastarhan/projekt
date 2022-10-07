package Homework.ekim06;

import java.util.Scanner;

public class Odev03 {


    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int a = scan.nextInt();
        System.out.println(getAsalmi(a));

    }

    public static boolean getAsalmi(int num) {
        boolean result = false;

        int sayac = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sayac++;
            }
        }
        if
        (num > 1 && sayac == 0)
            result = true;
        return result;
    }


}