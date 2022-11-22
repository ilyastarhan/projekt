package P11_depoYonetimi.Deneme;

import java.util.HashMap;
import java.util.Scanner;

public class Depo {
    public static Scanner scan = new Scanner(System.in);
    static Urun urun;
    static HashMap<Integer, Urun> urunListesi = new HashMap<Integer, Urun>();



    public void islemMenusu() {
        System.out.println("Lütfen yapmak istediginiz islemi seciniz...");
        System.out.println("" +
                "1- Yeni Ürün Tanimla\n" +
                "2- Urunleri Listele\n" +
                "3- Depoya urun ekle\n" +
                "4- Urunu rafa ekle\n" +
                "5- Urun cikis\n" +
                "6- Sistemden cikis");
        islemSecimi();
    }

        public void islemSecimi(){
            char secim = scan.next().charAt(0);
        switch (secim) {
            case '1':
                uruntanimlama();
                islemMenusu();
                break;
            case '2':
                urunListele();
                islemMenusu();
                break;
            case '3':
                urunGirisi();
                islemMenusu();
                break;
            case '4':
                urunuRafaKoy();
                islemMenusu();
                break;
            case '5':
                urunCikisi();
                islemMenusu();
                break;
            case '6':
                sistemdenCikis();
                islemMenusu();
                break;
            default:
                System.out.println("Hatali secim yaptiniz ...\n Tekrar deneyiniz ...");
                islemMenusu();
                break;
        }
        }




    static void uruntanimlama() {
        System.out.println();
        System.out.print("Lütfen Ürün bilgilerini giriniz ...\n" +
                "Urun ismi : ");
        scan.nextLine();
        String urunIsmi = scan.nextLine();
        System.out.print("Üretici ismini giriniz: ");
        String ureticiIsmi = scan.nextLine();
        System.out.print("Ürün birimini giriniz: ");
        String urunBirimi = scan.next();
        Urun urun = new Urun(urunIsmi, ureticiIsmi,urunBirimi);
        urunListesi.put(urun.getUrunId(), urun);
        urun.setUrunId(urun.getUrunId()+1);
    }

    static void urunListele() {


    }



    static void urunGirisi() {
        System.out.println("ürün girisi");
    }

    static void urunuRafaKoy() {
        System.out.println("ürün rafa koy");
    }

    static void urunCikisi() {
        System.out.println("urun cikisi");
    }
    static void sistemdenCikis(){
        System.out.println("Sistemden Cikiliyor... Iyi günler dileriz...");
    }

}
