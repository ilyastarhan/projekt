package Homework.ekim14;

import java.util.ArrayList;
import java.util.Scanner;

public class Not {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sinif mevcudu giriniz: ");
        int mevcud = scan.nextInt();
        ArrayList<Integer> sinif = new ArrayList<>(mevcud);


        int toplam = 0;
        double ortalama;
        int sayac = 0;
        for (int i = 0; i < mevcud; i++) {
            System.out.println("Lütfen " + (i+1) + " . ögrencinin notunu giriniz:");
            int not = scan.nextInt();
            sinif.add(not);
            toplam+=not;
        }
        ortalama = toplam/mevcud;
        System.out.println("ögrencilerin not ortalamasi = " + ortalama);
        for(int i=0; i<mevcud; i++){
            if(sinif.get(i)>ortalama)
                sayac++;
        }
        System.out.println("ortalamayi gecen ögrenci sayisi : " + sayac);
    }
}
