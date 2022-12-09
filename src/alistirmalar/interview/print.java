package alistirmalar.interview;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     int max = Integer.MIN_VALUE;//-115325324
     int min = Integer.MAX_VALUE;//289552566565
     int sayi=0;
     int i = 0;
     while(i<5){
         System.out.println("Sayi girin");
         sayi = scan.nextInt();  ///24,36,12,58,11
         if(sayi < min){
             min =sayi; //24-12-11
         }
         if(sayi > max){//
             max =sayi;//24-36-58
         }
         i++;
     }

        System.out.println(min);//11
        System.out.println(max);//58
    }
}
