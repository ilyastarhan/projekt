package P11_depoYonetimi.Deneme;

import java.util.HashMap;
import java.util.Scanner;

import static P11_depoYonetimi.Deneme.TryCatch.sayiGir;

public class Methodlar {


    static Scanner scan = new Scanner(System.in);
    static HashMap<Integer, Urun> urunListesi = new HashMap<Integer, Urun>();


    static void urunTanimlama() {
        System.out.println("Lütfen Ürün bilgilerini giriniz ...");
        System.out.print("Urun ismi : ");
        String urunIsmi = scan.nextLine();
        System.out.print("Üretici ismi: ");
        String ureticiIsmi = scan.nextLine();
        System.out.print("Ürün birimi: ");
        String urunBirimi = scan.nextLine();
        Urun urun = new Urun(urunIsmi, ureticiIsmi, urunBirimi);
        urunListesi.put(urun.getUrunId(), urun);
    }

    static void urunListele() {

            System.out.println("ID\t\tURUN ADI\tÜRETICI ADI\t\tBIRIM\t\tMIKTAR\t\tRAF");
            System.out.println("==============================================================================");
            for (Urun i : urunListesi.values()) {
                System.out.println(i);
            }
    }

    static void urunGirisi() {
        urunListele();
        int secim = 0;
        int miktar = 0;
        if (urunListesi.size() == 0)
            System.out.println();
        else {
            while (true) {
                System.out.println("Lütfen islem yapmak istediginiz ürünün Id sini seciniz:");
                secim = sayiGir();
                if (!urunListesi.containsKey(secim)) {
                    System.out.println("Girdiginiz Id sistemde bulunmamaktadir");
                } else break;
            }
            System.out.println("Ürün miktarini giriniz: ");
            miktar = sayiGir();
            urunListesi.get(secim).setUrunMiktari(miktar);
            System.out.println("Ürün girisi\t\t==> " + "id: " + secim + " urun girisi: " + miktar);

        }
    }

    static void urunuRafaKoy() {
        urunListele();
        int secim = 0;
        int raf = 0;
        if (urunListesi.size() == 0)
            System.out.println();
        else {
            while (true) {
                System.out.println("Lütfen islem yapmak istediginiz ürünün Id sini seciniz:");
                secim = sayiGir();
                ;
                if (!urunListesi.containsKey(secim)) {
                    System.out.println("Girdiginiz Id sistemde bulunmamaktadir");
                } else break;
            }
            System.out.println("Ürünü Hangi rafa eklemek isteginiz giriniz: ");
            raf = sayiGir();
            urunListesi.get(secim).setUrunRaf(raf);
            System.out.println("Ürün rafa yerlestir\t\t==> " + "id: " + secim + " urun rafi: " + raf);

        }
    }

    static void urunCikisi() {
        urunListele();
        int secim;
        int miktar = 0;
        if (urunListesi.size() == 0)
            System.out.println();
        else {
            while (true) {
                System.out.println("Lütfen islem yapmak istediginiz ürünün Id sini seciniz:");
                secim = sayiGir();
                if (!urunListesi.containsKey(secim)) {
                    System.out.println("Girdiginiz Id sistemde bulunmamaktadir");
                    Menu.islemMenusu();
                } else if (!(urunListesi.get(secim).getUrunMiktari() > 0)) {
                    System.out.println("Girdiginiz ürüne ait stok mevcut degildir");
                    Menu.islemMenusu();
                } else {
                    System.out.println("Cikis yapmak istediginiz ürün miktarini giriniz: ");
                    miktar = sayiGir();
                    if (urunListesi.get(secim).getUrunMiktari() < miktar) {
                        System.out.println("deponuzda mevcut olandan daha fazla ürün cikarmaya calisiyorsunuz");
                        urunCikisi();
                    } else break;
                }
            }
            urunListesi.get(secim).setUrunMiktari(urunListesi.get(secim).getUrunMiktari() - miktar);
            System.out.println("Id==>\t\t" + secim +
                    "urun cikis: " + miktar + " " + "(kalan " +
                    urunListesi.get(secim).getUrunMiktari() + " "
                    + urunListesi.get(secim).getUrunBirimi() + " "
                    + urunListesi.get(secim).getUrunIsmi() + ")");
        }
    }


    static void urunSorgulama() {
        urunListele();
        if (urunListesi.size() == 0)
            System.out.println();
        else {
            int secim;
            while (true) {
                System.out.println("Lütfen islem yapmak istediginiz ürünün Id sini giriniz:");
                secim = sayiGir();
                if (urunListesi.containsKey(secim)) {
                    System.out.println(urunListesi.get(secim));
                    break;
                } else System.out.println("Ürün sistemde bulunmamaktadir");
            }
        }
    }

    static void sistemdenCikis() {
        System.out.println("Sistemden Cikiliyor... Iyi günler dileriz...");
        System.exit(0);
    }
}
