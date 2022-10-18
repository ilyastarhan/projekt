package Homework.Ekim17;

import java.util.Arrays;
import java.util.Scanner;

public class Task12_Manav {


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        Scanner scan = new Scanner(System.in);
        String urun[] = {"1-Domates", "2-Salatalik","3-Kabak", "4-Elma", "5-Portakal" };
        double fiyat [] = {15, 20, 25, 24, 26};
        boolean devamMi = true;
        int secim;
        double kilo;
        double toplamTutar = 0;
        while(devamMi){
            System.out.println(Arrays.toString(urun));
            System.out.println("Lütfen almak istediginiz ürün numarasini giriniz: ");
            secim = scan.nextInt();
            System.out.println("Lütfen almak istediginiz miktarini 'kg' olarak giriniz: ");
            kilo=scan.nextDouble();
            toplamTutar+=kilo*fiyat[secim+1];
            System.out.println("Baska ürün almak istiyor musunuz? Evet icin '1', hayir icin '2' : ");
            secim=scan.nextInt();
            if (secim==2) devamMi = false;
        }
        System.out.println("Ödemeniz gereken toplamTutar = " + toplamTutar + " TL'dir");


    }




}

