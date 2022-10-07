package alistirmalar;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int i1=0;
        int i2=1;
        int toplam1;
        for( int i = 1; i<=sayi; i++  ){
            System.out.print(i1 + " ");
            toplam1=i1+i2;
            i1=i2;
            i2=toplam1;
        }
    }
}
