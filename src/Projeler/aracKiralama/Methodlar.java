package Projeler.aracKiralama;

import java.util.Scanner;

public class Methodlar {
    static Scanner scan = new Scanner(System.in);
    static int aracSecim;

    public static void aracListesiYazdir() {
        System.out.println("******Sistemde kayitli araclar******");
        System.out.println("ID" + "\t\tMarka" + "\t\tModel" + "\t\tYakit Tipi" + "\t\tVites Tipi" + "\t\tGünlük Ücret");
        AracListesi.aracListesi.values().stream().forEach(t -> System.out.println(t));

    }

    public static Arac filtreUygulayarakAracSec() {

        AracListesi.aracListesi.values().stream().map(Arac::getMarka).distinct().forEach(t -> System.out.println(t + " "));

        System.out.print("Lütfen aracin markasini giriniz");
        String marka = scan.nextLine();
        AracListesi.aracListesi.values().stream().filter(t -> t.getMarka().equalsIgnoreCase(marka)).forEach(t -> System.out.println(t + " "));

        System.out.print("Lütfen vites tipini giriniz: ");
        String vites = scan.nextLine();
        AracListesi.aracListesi.values().stream().filter(t -> t.getMarka().equalsIgnoreCase(marka) && t.getVites().equalsIgnoreCase(vites)).forEach(t -> System.out.println(t + " "));

        System.out.print("Lütfen secmek istediginiz aracin id'sini giriniz");
        aracSecim = TryCatch.sayiGir(1000, 1013);
        System.out.println(AracListesi.aracListesi.get(aracSecim));
        return AracListesi.aracListesi.get(aracSecim);
    }
    public static Arac aracSec(){
        System.out.print("Lütfen secmek isteginiz Arac Id sini giriniz: ");
        aracSecim = TryCatch.sayiGir(1000,1013);
        return AracListesi.aracListesi.get(aracSecim);
    }
    public static void odenecekTutar(){
        System.out.println("Sectiginiz araca ait günlük ücret = " + AracListesi.aracListesi.get(aracSecim).getGunlukUcret());

    }
    public static void kiralanacakGun(){
        System.out.println("Lutfen araci alacaginiz sehri giriniz:");
        String sehir = scan.nextLine();
        System.out.println("Lutfen teslim alacaginiz gunu giriniz: (Ornek: 12.04)");// ay ve gunu ayirmak mi yoksa string almak mi?
        String alisGunu = scan.next();
        System.out.println("Lutfen teslim edeceginiz gunu giriniz: (Ornek: 12.04)");
        String teslimGunu = scan.next();
        System.out.println("************************************");
        String aGun=alisGunu.substring(0,2); //12.04
        int intAGunu= Integer.parseInt(aGun);
        String aAy= alisGunu.substring(3);
        int intAAy = Integer.parseInt(aAy);
        System.out.println("Integer alis tarihi: "+intAGunu+"."+intAAy);

        String tGun=teslimGunu.substring(0,2); //12.04
        int intTGunu= Integer.parseInt(tGun);
        String tAy= teslimGunu.substring(3);
        int intTAy = Integer.parseInt(tAy);
        System.out.println("Integer teslim tarihi: "+intTGunu+"."+intTAy);

        System.out.println("************************************");
        if (intAAy>intTAy) {
            System.out.println("Alis gunu Teslim gununden sonra olamaz");
            Menu.menu();
        }else if(intAGunu>intTGunu){
            System.out.println("Alis gunu Teslim gununden sonra olamaz");
            Menu.menu();
        }else{

        }
        int toplamGun= (intTAy-intAAy)*30 + (intTGunu-intAGunu);
        System.out.println("Odenecek toplam gun ayisi: "+toplamGun);
        System.out.println("************************************");
    }

    public static void odeme() {

        String kartNo;
        while (true) {
            System.out.println("Lütfen 12 haneli kredi karti numaranizi giriniz: ");
            kartNo = scan.nextLine();
            if (kartNo.length() == 12 && kartNo.matches("[0-9]")) {
                System.out.println("Ödemeniz gerceklesmistir...\n");
                break;
            } else
                System.out.println("Hatati giris yaptiniz tekrar deneyiniz...");
            System.out.println("Cikis yapmak istiyorsaniz \"q\" ya basiniz");
            if (kartNo.equalsIgnoreCase("q")) {
                cikis();
            }
        }
        System.out.println("Ödemeniz gerceklesmistir...\n");
        cikis();

    }

    public static void cikis() {
        System.out.println("Iyi gunler dileriz");
        System.exit(0);
    }
}
