package Projeler.aracKiralama;

import static Projeler.aracKiralama.Methodlar.aracListesiYazdir;
import static Projeler.aracKiralama.Methodlar.araclariFiltrele;

public class Menu {


    public static void menu() {
        System.out.println("*****Arac Kiralama Sirketimize Hosgeldiniz*****");
        System.out.println("Lütfen yapmak istediginiz islemi seciniz...");
        System.out.println("Arac Kiralama Islemleri => 1\nÖdeme Islemleri => 2\nCikis => 3");
        int secim = TryCatch.sayiGir(1, 3);
        switch (secim) {
            case 1:
                aracKiralama();
                menu();
                break;
            case 2:
                Methodlar.odeme();
                menu();
                break;
            case 3:
                Methodlar.cikis();
                break;
        }


    }

    public static void aracKiralama() {
        AracListesi.arabalar();
        System.out.println("Tüm arac listesini görüntülemek icin => 1\nFiltre kullanarak arama yapmak icin =>2");
        int secim = TryCatch.sayiGir(1, 2);
        switch (secim) {
            case 1:
                aracListesiYazdir();
                break;
            case 2:
                araclariFiltrele();
                break;
        }


    }
}
