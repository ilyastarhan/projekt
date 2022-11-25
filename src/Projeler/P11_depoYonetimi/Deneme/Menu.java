package Projeler.P11_depoYonetimi.Deneme;

public class Menu {

    public static void islemMenusu() {
        System.out.println("Lütfen yapmak istediginiz islemi seciniz...");
        System.out.println("" +
                "1- Yeni Ürün Tanimla\n" +
                "2- Urunleri Listele\n" +
                "3- Depoya urun ekle\n" +
                "4- Urunu rafa ekle\n" +
                "5- Urun cikis\n" +
                "6- Ürün Sorgulama\n" +
                "7- Cikis");
        islemSecimi();
    }

    public static void islemSecimi() {
        int secim = TryCatch.sayiGir();
        switch (secim) {
            case 1:
                Methodlar.urunTanimlama();
                islemMenusu();
                break;
            case 2:
                Methodlar.urunListele();
                islemMenusu();
                break;
            case 3:
                Methodlar.urunGirisi();
                islemMenusu();
                break;
            case 4:
                Methodlar.urunuRafaKoy();
                islemMenusu();
                break;
            case 5:
                Methodlar.urunCikisi();
                islemMenusu();
                break;
            case 6:
                Methodlar.urunSorgulama();
                islemMenusu();
                break;
            case 7:
                Methodlar.sistemdenCikis();
                break;
            default:
                System.out.println("Hatali secim yaptiniz ...\n Tekrar deneyiniz ...");
                islemSecimi();
                break;
        }
    }
}
