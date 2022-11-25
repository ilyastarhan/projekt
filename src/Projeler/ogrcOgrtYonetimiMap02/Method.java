package Projeler.ogrcOgrtYonetimiMap02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Method implements GirisCikisInterface{
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);

    @Override
    public void girisPaneli() {
        OgrenciIslemleri ogr=new OgrenciIslemleri();
        OgretmenIslemleri ogrt=new OgretmenIslemleri();
        System.out.println(Y+"====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t 0- ÇIKIŞ");
        System.out.print("Yapmak istediniz islemi secin= ");
        int secim=scan.nextInt();
        try {
            switch (secim){
                case 1:
                    ogr.girisPaneli();
                    girisPaneli();
                    break;
                case 2:
                    ogrt.girisPaneli();
                    girisPaneli();
                    break;
                case 0:
                    cikisYap();
                    break;
            }

        }catch (
                InputMismatchException e) {
            System.out.println("Sayi disinda karakter girilemez");
            scan.nextLine();
            girisPaneli();
        }
    }

    @Override
    public void cikisYap() {

        System.out.println("Okul yönetimi programindan sevgilerle yine bekleriz");

    }
}
