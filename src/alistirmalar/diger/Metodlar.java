package alistirmalar.diger;

import java.util.Scanner;

public class Metodlar {
    public static int toplam(int []sayilar) {
        int toplam = 0;
        for(int sayi : sayilar){
            toplam+=sayi;
        }
        return toplam;
    }


    public static int hesap(int a, int b){
        return a+b;

    }
    public static void faktoriyel(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen faktoriyelini almak istediginiz bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int faktoriyel = 1;
        while(sayi>1) {
            faktoriyel *=sayi;
        sayi--;}
        System.out.println("faktoriyel = " + faktoriyel);


    }
    public static void main(String[] args) {
        faktoriyel();
        hesap(2,3);
        System.out.println(hesap(2,3));



        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: "); ////basamaklari toplama
        int sayi1 = scan.nextInt();
        int toplam = 0;
        while(sayi1 > 0) {
            toplam += sayi1%10;
            sayi1 = sayi1/10;
        }
        System.out.println("toplam = " + toplam);
        System.out.println("lütfen bir sayi giriniz: ");  /////faktoriyel
        int sayi2 = scan.nextInt();
        int toplam1 = 1;
        for(int sayi =0; sayi2>sayi; sayi2--  ){
            toplam1*=sayi2;
        }
        System.out.println("toplam1 = " + toplam1);

        System.out.println(toplam(new int[] {5,7,98,4532}));


    }
}
