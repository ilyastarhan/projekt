package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplami {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üc basamakli bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int birler = sayi%10;
        int onlar = (sayi/10)%10;
        int yuzler = sayi/100;
        System.out.println("Girdiginiz sayinin rakamlari toplami = " + (yuzler+onlar+birler));
            }
}
