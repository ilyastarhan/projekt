package j11_MethodCreation;

import java.util.Scanner;

public class Task05 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$
yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
12 ve 24 yas arasindaysa 10% indirim,
65 yasindan buyukse 30% indirim,
bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz */


        System.out.println("Lütfen gitmek istediginiz sehri giriniz: ");
        System.out.println("B sehri icin ->1 \nC sehri icin ->2 \nD sehri icin ->3");
        int sehir = scan.nextInt();

        if (sehir == 1) {
            bsehri();
        } else if (sehir == 2) {
            csehri();
        } else if (sehir == 3) {
            dsehri();
        } else System.out.println("Hatali secim yaptiniz...");
    }


    private static void bsehri() {
        double ucret = 500 * 0.10;
        ucret = ucret * yasindirim() * gidisdonus();
        System.out.println("Toplam ücret : " + ucret + " $dir");
    }

    private static void csehri() {
        double ucret = 700 * 0.10;
        ucret = ucret * yasindirim() * gidisdonus();
        System.out.println("Toplam ücret : " + ucret + " $dir");
    }

    private static void dsehri() {
        double ucret = 900 * 0.10;
        ucret = ucret * yasindirim() * gidisdonus();
        System.out.println("Toplam ücret : " + ucret + " $dir");
    }

    private static double yasindirim() {
        double yasindirim;
        System.out.println("Lütfen yasinizi giriniz: ");
        int yas = scan.nextInt();
        if (yas < 12) {
            yasindirim = 0.50;
        } else if (yas < 24) {
            yasindirim = 0.90;
        } else if (yas > 65) {
            yasindirim = 0.70;
        } else yasindirim = 1;
        return yasindirim;
    }

    private static double gidisdonus() {
        double gidisdonusindirim = 0;
        System.out.println("Lütfen seciniz \ncift yön -> 1 \ntek yön -> 2 ");
        int secim = scan.nextInt();
        if (secim == 1)
            gidisdonusindirim = 0.80;
        else if (secim == 2)
            gidisdonusindirim = 1.0;
        else System.out.println("Hatali secim yaptiniz...");
        return gidisdonusindirim;
    }
}

