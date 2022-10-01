package challange.Day2;

import java.util.Scanner;

public class Q02_Modulus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bes basamakli bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int ilkIki = sayi/1000;
        int sonIki = sayi%100;
        int ilkIkiToplam = (ilkIki/10) + (ilkIki%10);
        int sonIkiToplam = (sonIki/10) + (sonIki%10);
        System.out.println(ilkIkiToplam+ sonIkiToplam);

    }
}
