package Projeler.ogrcOgrtYonetimiMap02;

import java.util.Map;
import java.util.Set;

public class OgrenciDegistirme extends OgrenciIslemleri implements Degistirme{
    static Set<Map.Entry<Integer,Ogrenci>> ogrEntrySet;
    static int numara;
    public void degiştir() {
        System.out.println(R+"============= DEGİŞİKLİK ISLEMLERI =============\n" +
                "\t\t 1-ADI SOYADI\n" +
                "\t\t 2-TC KİMLİK\n" +
                "\t\t 3-ÖGRENCİ YAŞ\n" +
                "\t\t 4-SINIF\n" +
                "\t\t 0-ANA MENÜ");
        System.out.print("Değiştirmek istediniz bigi=");
        int secim=scan.nextInt();

        switch (secim){
            case 1:
                adiSoyadiD();
                listeleme();
                degiştir(); break;
            case 2:
                tcKimlikD();
                listeleme();
                degiştir(); break;
            case 3:
                yasD();
                listeleme();
                degiştir(); break;
            case 4:
                sinifD();
                listeleme();
                degiştir(); break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("Hatali secim yaptınız");
                ;break;

        }
    }
    @Override
    public void adiSoyadiD() {
        System.out.print("Bilgi değişikliği yapmak istediğiniz ögrencinin numarasini giriniz=");
        numara=scan.nextInt();
        ogrEntrySet= ogrenci.entrySet();
        for (Map.Entry<Integer,Ogrenci> each: ogrEntrySet
        ) {
            Integer keyEntry=each.getKey();

            if (keyEntry==numara){
                System.out.print("Adi ve Soyadi tekrar giriniz=");
                scan.nextLine();
                String adiSoyadi = scan.nextLine().toUpperCase();
                Ogrenci okul2=new Ogrenci(adiSoyadi, each.getValue().getKimlikNo()
                        ,each.getValue().getYas(),each.getValue().getNumara(),each.getValue().getSinif());

                ogrenci.put(each.getKey(),okul2);

            }else {
                System.out.println("Öğrenci numarası bulunamadi");

            }
        }}
    @Override
    public void tcKimlikD() {
        System.out.print("Bilgi değişikliği yapmak istediğiniz ögrencinin numarasini giriniz=");
        numara = scan.nextInt();
        ogrEntrySet = ogrenci.entrySet();
        for (Map.Entry<Integer, Ogrenci> each : ogrEntrySet
        ) {
            Integer keyEntry = each.getKey();

            if (keyEntry == numara) {
                System.out.print("TC Kimlik numarasini tekrar giriniz=");
                scan.nextLine();
                String tC = scan.nextLine();
                Ogrenci okul2 = new Ogrenci(each.getValue().getAdiSoyadi()
                        , tC, each.getValue().getYas(), each.getValue().getNumara(), each.getValue().getSinif());

                ogrenci.put(each.getKey(), okul2);

            } else {
                System.out.println("Öğrenci numarası bulunamadi");

            }

        }
    }
    @Override
    public void yasD() {
        System.out.print("Bilgi değişikliği yapmak istediğiniz ögrencinin numarasini giriniz=");
        numara=scan.nextInt();
        ogrEntrySet= ogrenci.entrySet();
        for (Map.Entry<Integer,Ogrenci> each: ogrEntrySet
        ) {
            Integer keyEntry=each.getKey();

            if (keyEntry==numara){
                System.out.print("Ogrencinin yasini tekrar giriniz=");
                scan.nextLine();
                int yas = scan.nextInt();
                Ogrenci okul2=new Ogrenci(each.getValue().getAdiSoyadi()
                        ,each.getValue().getKimlikNo(),yas,each.getValue().getNumara(),each.getValue().getSinif());

                ogrenci.put(each.getKey(),okul2);

            }else {
                System.out.println("Öğrenci numarası bulunamadi");

            }
        }

    }
    public void sinifD() {
        System.out.print("Bilgi değişikliği yapmak istediğiniz ögrencinin numarasini giriniz=");
        numara=scan.nextInt();
        ogrEntrySet= ogrenci.entrySet();
        for (Map.Entry<Integer,Ogrenci> each: ogrEntrySet
        ) {
            Integer keyEntry=each.getKey();

            if (keyEntry==numara){
                System.out.print("Ogrencinin yasini tekrar giriniz=");
                scan.nextLine();
                String sinif = scan.nextLine();
                Ogrenci okul2=new Ogrenci(each.getValue().getAdiSoyadi()
                        ,each.getValue().getKimlikNo(),each.getValue().getYas(),each.getValue().getNumara(),sinif);

                ogrenci.put(each.getKey(),okul2);

            }else {
                System.out.println("Öğrenci numarası bulunamadi");

            }
        }

    }
}
