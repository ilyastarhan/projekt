package Projeler.ogrcOgrtYonetimiMap01;

import java.util.Scanner;

public class AnaMenu implements AnaMenuInterface {
    static Scanner scan = new Scanner(System.in);

    public static void giris() {
        AnaMenu object = new AnaMenu();

        System.out.println("Okul Yönetimi");
        System.out.println("lütfen seçiminizi yapınız");
        System.out.println("1ogrenci islemleri  2Ogretmen Işlemleri Q-Cıkıs");

        String scm = scan.next().toUpperCase();

        switch(scm){
            case "1":
                object.ogrenciIslemleri();
                break;
            case "2":
                object.ogretmenIslemlerı();
                break;
            case "Q":
                object.cikis();
                break;
            default :
                System.out.println("lütfen geçerli bir seçim yapınız");
                giris();
        }
    }

    @Override
    public void ogrenciIslemleri() {
        Islemler.IslemlerMenu(1);

    }

    @Override
    public void ogretmenIslemlerı() {
        Islemler.IslemlerMenu(2);
    }

    @Override
    public void cikis() {

    }
}
