package Homework.ekim10;

import java.util.Scanner;

public class T01_TopZiplama {

   /* HAFTANIN Projeler.TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("yüksekligi metre olarak giriniz: ");
        double yukseklik = scan.nextDouble();
        double yol=yukseklik;
        int count = 0;


        do {
            yol+=yukseklik*0.75*2;
            yukseklik=yukseklik/4*3;
            count++;
        }
        while (yukseklik>1);

            System.out.println("topun katettigi toplam mesafe: " + yol + " metredir");
            System.out.println("topun son yüksekligi: " + yukseklik  + " metredir");
            System.out.println("topun yere degme sayisi: " + count);


    }
}
