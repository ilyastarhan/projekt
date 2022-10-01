package Homework.eylul28.tasks;

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen saatlik calisma ücetini giriniz: ");
        double saatlik_ucret = scan.nextDouble();
        System.out.println("Lütfen ise baslama saatini giriniz: ");
        double is_baslama = scan.nextDouble();
        System.out.println("Lütfen isten cikis saatini giriniz giriniz: ");
        double is_bitis = scan.nextDouble();
        System.out.println("Lütfen fazla mesai katsayisini giriniz: ");
        double mesai_katsayi = scan.nextDouble();
        double toplamucret = ucretHesapla(saatlik_ucret, is_baslama, is_bitis, mesai_katsayi);
        System.out.println("Toplam ucretiniz = " + toplamucret);
    }

    private static double ucretHesapla(double ucret, double baslama, double bitis, double katsayi ) {

        double toplam_mesai;
        double toplam_ucret;
        toplam_mesai = bitis > baslama ? (bitis-baslama): ((24-baslama)+bitis);
        toplam_ucret = toplam_mesai > 8? ((8*ucret)+(toplam_mesai-8)*ucret*katsayi): (toplam_mesai*ucret);
        return toplam_ucret;



    }
}
