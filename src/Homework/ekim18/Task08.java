package Homework.ekim18;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> sayiListem = new ArrayList<>();
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

    ortalamadanBuyukSayilar(sayiListem);

    }
    private static void ortalamadanBuyukSayilar(ArrayList<Integer> sayiListem) {
        ArrayList<Integer> ortalamadanBuyukSayilar = new ArrayList<>();
        int toplam = 0;
        while(true){
            System.out.println("Lütfen eklemek isteginiz sayiyi giriniz: ");
            int sayi = scan.nextInt();
            sayiListem.add(sayi);
            toplam+=sayi;
            System.out.println("Sayi girmeye devam etmek istiyor musunuz? \nEvet icin '1' \nHayir icin '2'");
            if(scan.nextInt() == 2){
                break;}
        }
        double ortalama = toplam/sayiListem.size();
        for(Integer each :sayiListem) {
            if(each>ortalama) {
                ortalamadanBuyukSayilar.add(each);
            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("ortalamadanBuyukSayilar = " + ortalamadanBuyukSayilar);


    }


}
