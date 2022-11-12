package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiMap02;

import java.util.*;

public class OgrenciIslemleri extends Method implements Islem, GirisCikisInterface {

    static Scanner scan = new Scanner(System.in);
    static Ogrenci okul = new Ogrenci();
    static HashMap<Integer, Ogrenci> ogrenci = new HashMap<>();


    @Override
    public void girisPaneli() {
        System.out.println(R + "============= OGRENCI ISLEMLERI =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-DEGİŞİKLİK YAPMA\n" +
                "\t\t 0-ANA MENÜ");
        System.out.println("Yapmak istediniz islemi secin");
        int secim = scan.nextInt();
        try {
            switch (secim) {
                case 1:
                    ekleme();
                    girisPaneli();
                    break;
                case 2:
                    arama();
                    girisPaneli();
                    break;
                case 3:
                    listeleme();
                    girisPaneli();
                    break;
                case 4:
                    silme();
                    girisPaneli();
                    break;
                case 5:
                    new OgrenciDegistirme().degiştir();
                    break;
                case 0:
                    new Method().girisPaneli();
                    break;
                default:
                    System.out.println("Hatali secim yaptınız");
                    girisPaneli();
                    break;

            }
        } catch (
                InputMismatchException e) {
            System.out.println("Sayi disinda karakter girilemez");
            scan.nextLine();
            new OgrenciIslemleri().girisPaneli();
        }

    }


    @Override
    public void cikisYap() {
        Method obj = new Method();
        obj.cikisYap();
    }



    @Override
    public void ekleme() {
        scan.nextLine();
        System.out.print("ogrenci adiSoyadi=");
        String adiSoyadi = scan.nextLine();
        System.out.print("ogrenci kimlik no=");
        String kimlikNo = scan.next();
        System.out.print("ogrenci yas=");
        scan.nextLine();
        int yas = scan.nextInt();
        System.out.print("ogrenci numara=");
        int numara = scan.nextInt();
        scan.nextLine();
        System.out.print("ogrenci sınıf=");
        String sinif = scan.next();
        okul = new Ogrenci(adiSoyadi, kimlikNo, yas, numara, sinif);
        ogrenci.put(okul.getNumara(), okul);
    }


    @Override
    public void arama() {
        Set<Map.Entry<Integer, Ogrenci>> ogrSeti = ogrenci.entrySet();
        System.out.print("Aramak istediniz ögrencinin numarasini giriniz=");
        int numara = scan.nextInt();
        System.out.print("Aranan ögrenci=");
        for (Map.Entry<Integer, Ogrenci> each : ogrSeti) {
            if (each.getKey().equals(numara)) {
                listeleme();
            } else {
                System.out.println("Öğrenci bulunamadi");

            }

        }
    }


    @Override
    public void listeleme() {

        Set<Map.Entry<Integer, Ogrenci>> ogrSeti = ogrenci.entrySet();

        System.out.println("Ogrenci Nu:    Adi ve Soyadi:         TC Kimlik Nu:   Ogrenci Yasi:       Sinif:" +
                "\n------------------------------------------------------------------------------------------");
        for (Map.Entry<Integer, Ogrenci> each : ogrSeti) {
            Integer ogrKey = each.getKey();
            System.out.printf("%-11d    %-16s       %-15s %-10d          %-8s"
                    , ogrKey, each.getValue().getAdiSoyadi().toUpperCase(), each.getValue().getKimlikNo(), each.getValue().getYas(), each.getValue().getSinif().toUpperCase());
            System.out.println("");
        }

    }


    @Override
    public void silme() {
        Set<Map.Entry<Integer, Ogrenci>> ogrSeti = ogrenci.entrySet();
        System.out.println("Silmek istediniz ögrencinin numarasini giriniz=");
        int numara = scan.nextInt();
        for (Map.Entry<Integer, Ogrenci> each : ogrSeti) {
            if (each.getKey() == numara) {
                ogrenci.remove(each.getKey());
                System.out.println("Ögrenci silindi");
                listeleme();
            } else {
                System.out.println("Öğrenci bulunamadi");
            }

        }

    }

}

