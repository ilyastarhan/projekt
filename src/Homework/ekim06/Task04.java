package Homework.ekim06;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */

        Scanner sc= new Scanner(System.in);
        System.out.println(" sayı1 giriniz : ");
        int sayi1=sc.nextInt();

        System.out.println(" sayı2 giriniz : ");
        int sayi2=sc.nextInt();

        if(sayi1<sayi2){
            for(int i= sayi1; i<= sayi2; i++){
                if(i%2==0){
                    System.out.print(i + " ");
                }
            }
        }
        else
            for(int i= sayi2; i<= sayi1; i++){
                if(i%2==0){
                    System.out.print(i + " ");
                }
            }

    }//main sonu





















}
