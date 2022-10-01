package alistirmalar;

import java.util.Scanner;

public class Kdv_Hesaplama {
    public static void main(String[] args) {
        double tutar, kdvliFiyat;
        double kdv;



        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen KDV eklemek istediginiz ürünün fiyatini TL olarak giriniz");
        tutar = scan.nextInt();
        System.out.println("Lütfen KDV oranini giriniz");
        kdv = scan.nextDouble();
        if(kdv == 0.18){
            kdvliFiyat = tutar*=1.18;
            System.out.println("Ürünün Kdv dahil fiyati: " + kdvliFiyat);
        } else if (kdv == 0.8) {
            kdvliFiyat = tutar*=1.08;
            System.out.println("Ürünün Kdv dahil fiyati: " + kdvliFiyat);
        }
        else {
            System.out.println("hatali Kdv orani girdiniz. Lütfen tekrar deneyiniz...");
        }
    }
}
