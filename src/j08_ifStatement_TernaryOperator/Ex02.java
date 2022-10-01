package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        /*
        girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
            artık yıl:
            Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
            Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
            Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
         */



        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yil giriniz: ");
        int year = scan.nextInt();
        //    4ün kati      100ün kati    400ün kati
        if ((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year+ " artık yıldır");
        }else
            System.out.println(year+" artık yıl değildir");

        /*Scanner scan = new Scanner(System.in);
        System.out.println("lütfen yil giriniz: ");
        int year = scan.nextInt();
        if(year%4!=0){
            System.out.println("girdiginiz yil artik yil degildir");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println("girdiginiz yil artik yildir");
        }
        else if(year%400==0){
            System.out.println("girdiginiz yil artik yildir");
        }
        else System.out.println("girdiginiz yil artik yildir");
        */
    }
}
