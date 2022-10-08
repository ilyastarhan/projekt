package Homework.ekim8;

import java.util.Scanner;

public class Task07 {
    static Scanner scan = new Scanner(System.in);
    static int sayi;
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz

        int i = 0;

        int temp = 0;

        while(i<5){
            System.out.println("lütfen sayi giriniz: ");
            int sayi = scan.nextInt();
            if(sayi>temp)
                temp = sayi;
            i++;

        }
        System.out.println(sayi);


    }
}
