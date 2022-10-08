package Homework.ekim8;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz: ");
        int num = scan.nextInt();
        int i = 0;
        while(i<=num){
            if(i%2==1){
                System.out.print(i + " ");
            }
            i++;
        }


    }
}
