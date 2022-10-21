package Homework.ekim18;

import java.util.ArrayList;
import java.util.Scanner;

public class Task09 {


    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> sayiListem = new ArrayList<Integer>();
        int karelerToplami = 0;
        while(true){
            System.out.println("Lütfen eklemek isteginiz sayiyi giriniz: ");
            int sayi = scan.nextInt();
            sayiListem.add(sayi);
            System.out.println("Sayi girmeye devam etmek istiyor musunuz? \nEvet icin '1' \nHayir icin '2'");
            if(scan.nextInt() == 2){
                break;}
        }
        for(Integer each : sayiListem){
            karelerToplami+=(each*each);
        }
        System.out.println("sayilistem = " + sayiListem);
        System.out.println("karelerToplami = " + karelerToplami);

    }
}

