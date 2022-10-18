package Homework.Ekim17;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.


        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> sayiListem = new ArrayList<>();
        boolean devamMi = true;
        while(devamMi){
            System.out.println("Lütfen sayi giriniz: ");
            sayiListem.add(scan.nextInt());
            System.out.println("Sayi eklemeye devam etmek icin -> 'E' \n cikmak icin 'H'");
            char ch = scan.next().toLowerCase().charAt(0);
            if (ch == 'h')
                devamMi = false;
        }
        System.out.println("sayi listem= " + sayiListem);
        System.out.println("ortalamadan büyük sayilar = " + ortalamadanBuyukSayilar(sayiListem));

    }

    private static ArrayList<Integer> ortalamadanBuyukSayilar(ArrayList<Integer> sayiListem) {
        int average;
        int toplam = 0;
        ArrayList<Integer> ortalamadanBuyukSayilar = new ArrayList<Integer>();
        for (int i = 0; i <sayiListem.size(); i++){
            toplam+= sayiListem.get(i);
        }
        System.out.println("sayilarin toplami = " + toplam);
        average = toplam/sayiListem.size();
        System.out.println("sayilarin ortalamasi = " + average);
        for (int i = 0; i < sayiListem.size(); i++){
            if(sayiListem.get(i)>average){
                ortalamadanBuyukSayilar.add(sayiListem.get(i));
            }
        }
        return ortalamadanBuyukSayilar;
    }
}