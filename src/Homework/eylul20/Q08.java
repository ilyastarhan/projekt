package Homework.eylul20;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen almis oldugunuz ürün sayisini giriniz: ");
        int urun_sayi = scan.nextInt();
        System.out.print("Lütfen toplam liste fiyatini giriniz: ");
        double fiyat = scan.nextDouble();
        System.out.println("Müsteri kartiniz var ise 'E' yok ise 'H' tuusna basiniz");
        char musteri_karti = scan.next().toUpperCase().charAt(0);
        if (musteri_karti == 'E') {
            if (urun_sayi > 10) {
                fiyat *= 0.80;
                System.out.println("Tebrikler %20 indirim kazandiniz");
            } else {
                fiyat *= 0.85;
                System.out.println("Tebrikler %15 indirim kazandiniz");
            }
        } else if (musteri_karti == 'H') {
            if (urun_sayi > 10) {
                fiyat *= 0.85;
                System.out.println("Tebrikler %15 indirim kazandiniz");
            } else {
                fiyat *= 0.90;
                System.out.println("Tebrikler %10 indirim kazandiniz");
            }
        } else {
            System.out.println("Hatali tusa bastiniz");
        }
        System.out.println("Ödemeniz gereken yeni tutar: " + fiyat);

    }

}
