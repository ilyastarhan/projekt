package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiMap02;

import java.util.InputMismatchException;
import java.util.Map;

public class OgretmenDegistirme extends OgretmenIslemleri implements Degistirme{
    public void degiştir() {
        System.out.println(R+"============= DEGİŞİKLİK ISLEMLERI =============\n" +
                "\t\t 1-ADI SOYADI\n" +
                "\t\t 2-TC KİMLİK\n" +
                "\t\t 3-ÖGRETMEN YAŞ\n" +
                "\t\t 4-BÖLÜM\n" +
                "\t\t 0-ANA MENÜ");
        System.out.print("Değiştirmek istediniz bigi=");
        int secim=scan.nextInt();
        try {
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
                    bolumD();
                    listeleme();
                    degiştir(); break;
                case 0:
                    girisPaneli();
                    break;
                default:
                    System.out.println("Hatali secim yaptınız");
                    ;break;

            }}catch (
                InputMismatchException e) {
            System.out.println("Sayi disinda karakter girilemez");
            scan.nextLine();
            degiştir();
        }
    }
    @Override
    public void adiSoyadiD() {
        System.out.print("Bilgi değişikliği yapmak istediğiniz ögretmenin sicil numarasini giriniz=");
        sicilNo=scan.nextInt();
        ogrtSeti= ogretmen.entrySet();
        for (Map.Entry<Integer,Ogretmen> each: ogrtSeti
        ) {
            if (each.getKey().equals(sicilNo)) {
                System.out.print("Adi ve Soyadi tekrar giriniz=");
                scan.nextLine();
                String adiSoyadi = scan.nextLine().toUpperCase();
                Ogretmen okul2=new Ogretmen(adiSoyadi, each.getValue().getKimlikNo()
                        ,each.getValue().getYas(),each.getValue().getBolum(),each.getValue().getSicilNo());

                ogretmen.put(each.getKey(),okul2);

            }else {
                System.out.println("Öğrenci numarası bulunamadi");

            }
        }}
    @Override
    public void tcKimlikD() {
        System.out.print("Bilgi değişikliği yapmak istediğiniz ögretmenin sicil numarasini giriniz=");
        sicilNo=scan.nextInt();
        ogrtSeti= ogretmen.entrySet();
        for (Map.Entry<Integer,Ogretmen> each: ogrtSeti
        ) {
            if (each.getKey().equals(sicilNo)) {
                System.out.print("TC Kimlik numarasini tekrar giriniz=");
                scan.nextLine();
                String tC = scan.nextLine();
                Ogretmen okul2=new Ogretmen(each.getValue().getAdiSoyadi()
                        , tC, each.getValue().getYas(),each.getValue().getBolum(),each.getValue().getSicilNo());

                ogretmen.put(each.getKey(), okul2);

            } else {
                System.out.println("Öğrenci numarası bulunamadi");

            }

        }
    }
    @Override
    public void yasD() {
        System.out.print("Bilgi değişikliği yapmak istediğiniz ögretmenin sicil numarasini giriniz=");
        scan.nextLine();
        sicilNo=scan.nextInt();
        ogrtSeti= ogretmen.entrySet();
        for (Map.Entry<Integer,Ogretmen> each: ogrtSeti
        ) {
            if (each.getKey().equals(sicilNo)) {
                System.out.print("Ogretmenin yasini tekrar giriniz=");
                scan.nextLine();
                int yas = scan.nextInt();
                Ogretmen okul2=new Ogretmen(each.getValue().getAdiSoyadi()
                        ,each.getValue().getKimlikNo(),yas,each.getValue().getBolum(),each.getValue().getSicilNo());

                ogretmen.put(each.getKey(),okul2);

            }else {
                System.out.println("Öğrenci numarası bulunamadi");

            }
        }

    }
    public void bolumD() {
        System.out.print("Bilgi değişikliği yapmak istediğiniz ögretmenin sicil numarasini giriniz=");
        sicilNo=scan.nextInt();
        ogrtSeti= ogretmen.entrySet();
        for (Map.Entry<Integer,Ogretmen> each: ogrtSeti
        ) {
            if (each.getKey().equals(sicilNo)) {
                System.out.print("Ogrencinin bölümünü tekrar giriniz=");
                scan.nextLine();
                String bolum = scan.nextLine();
                Ogretmen okul2=new Ogretmen(each.getValue().getAdiSoyadi()
                        ,each.getValue().getKimlikNo(),each.getValue().getYas(),bolum,each.getValue().getSicilNo());

                ogretmen.put(each.getKey(),okul2);

            }else {
                System.out.println("Öğrenci numarası bulunamadi");

            }
        }

    }
}
