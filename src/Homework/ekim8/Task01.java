package Homework.ekim8;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        while (toplam < 333) {
            System.out.println("Lütfen bir sayi giriniz: ");
            int sayi = scan.nextInt();
            toplam += sayi;


        }
        System.out.println("Girdiginiz sayilarin toplami = " + toplam);


    }
}
