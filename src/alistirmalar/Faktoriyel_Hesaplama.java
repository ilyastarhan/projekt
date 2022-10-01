package alistirmalar;

import java.util.Scanner;

public class Faktoriyel_Hesaplama {
    public static void main(String[] args) {


        System.out.println("Lütfen Faktöriyelini hesaplamak istediginiz sayiyi giriniz: ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        int faktoriyel = 1;
        for (int i=1; i<=sayi; sayi--){
            faktoriyel *= sayi;
        }
        System.out.println(faktoriyel);






    }
}
