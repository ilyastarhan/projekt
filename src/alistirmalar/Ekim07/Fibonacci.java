package alistirmalar.Ekim07;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int toplam=0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1; i<num;i++){
            if(num%i==0){
                System.out.print("bölenler : " + i);
                toplam +=i;
            }
        }
        if(toplam==num){
            System.out.println("mükemmel sayidir");
        }
        else{
            System.out.println("mükemmel sayi degildir");
}}}