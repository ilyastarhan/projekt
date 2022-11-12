package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiMap02;

import java.util.*;

public class OgretmenIslemleri extends Method implements Islem, GirisCikisInterface {
    static Scanner scan = new Scanner(System.in);
    static Ogretmen ogrt = new Ogretmen();
    static HashMap<Integer, Ogretmen> ogretmen = new HashMap<>();
    static Set<Map.Entry<Integer, Ogretmen>> ogrtSeti;
    static int sicilNo;

    @Override
    public void girisPaneli() {
        System.out.println(R + "============= OGRETMEN ISLEMLERI =============\n" +
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
                    new OgretmenDegistirme().degiştir();
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
            girisPaneli();
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
        System.out.print("Ogretmen adiSoyadi=");
        String adiSoyadi = scan.nextLine();
        System.out.print("Ogretmen kimlik no=");
        String kimlikNo = scan.next();
        System.out.print("Ogretmen yas=");
        scan.nextLine();
        int yas = scan.nextInt();
        System.out.print("Ogretmen sicil no=");
        sicilNo = scan.nextInt();
        scan.nextLine();
        System.out.print("Ogretmen bolum=");
        String bolum = scan.next();
        ogrt = new Ogretmen(adiSoyadi, kimlikNo, yas, bolum, sicilNo);
        ogretmen.put(sicilNo, ogrt);
    }


    @Override
    public void arama() {
        ogrtSeti = ogretmen.entrySet();
        System.out.print("Aramak istediniz ögretmenin sicil numarasini giriniz=");
        sicilNo = scan.nextInt();
        System.out.print("Aranan Ogretmen=");
        for (Map.Entry<Integer, Ogretmen> each : ogrtSeti) {
            if (each.getKey().equals(sicilNo)) {
                listeleme();
            } else {
                System.out.println("Öğretmen bulunamadi");

            }

        }
    }


    @Override
    public void listeleme() {

        ogrtSeti = ogretmen.entrySet();

        System.out.println("Ogretmen sicil:    Adi ve Soyadi:         TC Kimlik Nu:   Ogretmen Yasi:       Sinif:" +
                "\n-----------------------------------------------------------------------------------------------");
        for (Map.Entry<Integer, Ogretmen> each : ogrtSeti) {

            System.out.printf("%-15s    %-16s       %-15s %-10d          %-8s"
                    , each.getKey(), each.getValue().getAdiSoyadi().toUpperCase(), each.getValue().getKimlikNo(), each.getValue().getYas(), each.getValue().getBolum().toUpperCase());
            System.out.println("");
        }

    }


    @Override
    public void silme() {
        ogrtSeti = ogretmen.entrySet();
        System.out.print("Silmek istediniz ögretmenin sicil numarasini giriniz=");
        sicilNo = scan.nextInt();
        System.out.print("Silinen Ogretmen=");
        for (Map.Entry<Integer, Ogretmen> each : ogrtSeti) {
            if (each.getKey().equals(sicilNo)) {
                ogretmen.remove(each.getKey());
                System.out.println("Ögretmen silindi");
                listeleme();
            } else {
                System.out.println("Öğretmen bulunamadi");
            }

        }

    }
}
