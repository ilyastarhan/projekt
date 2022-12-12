package Projeler.aracKiralama.deneme2;

import Projeler.aracKiralama.AracListesi;
import Projeler.aracKiralama.Methodlar;
import Projeler.aracKiralama.TryCatch;

import java.util.ArrayList;
import java.util.List;

import static Projeler.aracKiralama.Methodlar.*;

public class Menu {
    static List<Arac> list = new ArrayList<>();
    static{


        Arac peugeot301 = Arac.ID1001;
        Arac citroenCElysee=Arac.ID1002;
        Arac fordTourneo= Arac.ID1003;
        Arac fiatLinea= Arac.ID1004;
        Arac renaultClioHb= Arac.ID1005;
        Arac fiatFierino= Arac.ID1006;
        Arac fordTourneoCourier= Arac.ID1007;
        Arac fiatLineaEko= Arac.ID1008;
        Arac peugeot2008= Arac.ID1009;
        Arac hundaiTuscon= Arac.ID1010;
        Arac nissanQashqai= Arac.ID1011;
        Arac peugeot3008= Arac.ID1012;
        Arac peugeotExpert = Arac.ID1013;

        list.add(peugeot301);
        list.add(citroenCElysee);
        list.add(fordTourneo);
        list.add(fiatLinea);
        list.add(renaultClioHb);
        list.add(fiatFierino);
        list.add(fordTourneoCourier);
        list.add(fiatLineaEko);
        list.add(peugeot2008);
        list.add(hundaiTuscon);
        list.add(peugeot3008);
        list.add(peugeotExpert);

        for(Arac value : list){
            if(value.sinif.equals("ekonomik"))
                System.out.println(value.model);
        }
    }


    public static void menu(){
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
              // Methodlar.odeme();
              // Methodlar.odenecekTutar();
                Methodlar.kiralanacakGun();
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
                list.stream().forEach(t-> System.out.println(t + " "));
                aracSec();
                break;
            case 2:
                filtreUygulayarakAracSec();
                break;
        }


    }
}
