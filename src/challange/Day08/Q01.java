package challange.Day08;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("**********Do-While Loop**********");
        System.out.println();
        System.out.println("lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int rakamtoplam = 0;
        int count = 0;
        do {
            rakamtoplam += sayi % 10;
            sayi /= 10;
            count++;


        }
        while (sayi > 0);
        System.out.println("Girdiginiz sayinin basamak sayisi: " + count);
        System.out.println("rakamtoplam = " + rakamtoplam);
        System.out.println();

        System.out.println("**********While Loop**********");
        System.out.println();
        rakamtoplam = 0;
        count = 0;
        System.out.println("lütfen bir sayi giriniz: ");
        int sayi1 = scan.nextInt();
        while (sayi1 > 0) {
            rakamtoplam += sayi1 % 10;
            sayi1 /= 10;
            count++;

        }
        System.out.println("Girdiginiz sayinin basamak sayisi: " + count);
        System.out.println("rakamtoplam = " + rakamtoplam);
        System.out.println();
        System.out.println("**********For Loop**********");
        System.out.println();
        rakamtoplam = 0;
        count = 0;
        System.out.println("lütfen bir sayi giriniz: ");
        int sayi2 = scan.nextInt();
        for(int i=sayi2; 0 < sayi2; sayi2/=10){
            rakamtoplam += sayi2 % 10;
            count++;

        }
        System.out.println("Girdiginiz sayinin basamak sayisi: " + count);
        System.out.println("rakamtoplam = " + rakamtoplam);
        System.out.println();

    }
}
