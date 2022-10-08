package Homework.ekim8;

import java.util.Scanner;


public class Task11 {
    static int num;

    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner scan = new Scanner(System.in);



        System.out.println("lütfen sayi giriniz: ");
        int num = scan.nextInt();
        int toplam = num;
        int sayac =0;

        while (num != 0) {
            System.out.println("lütfen sayi giriniz: ");
            num = scan.nextInt();
            toplam += num;
            sayac++;

        }
        System.out.println(sayac + "adet sayi girdiniz.");
        System.out.println("toplamlari = " + toplam);



    }


}
