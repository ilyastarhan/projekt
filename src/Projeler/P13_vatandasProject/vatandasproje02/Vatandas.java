package Projeler.P13_vatandasProject.vatandasproje02;
/*
		 saveInfo() method olusturun:
		 1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
		 2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
		 3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.

		 getInfo() method olusturun:
		 1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
		 2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.

		 removeInfo() method olusturun:
		 1)Kimlik numarasini girerek data silin.
		 2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
		 3)Collection bos ise kullaniciya hata mesaji verin.

		 selectOption() method olusturun:
		 1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
		*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vatandas {
    Map<Integer, VatandasBilgileri> vatandaslar = new HashMap<>();
    Scanner scan = new Scanner(System.in);

   /* selectOption() method olusturun:
    1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin */

    public void selectOption() {

        System.out.println("------- Menu -------");
        System.out.println("1- Kisi Olustur");
        System.out.println("2- Kisi Ara");
        System.out.println("3- Kisi Sil");
        System.out.println("4- Cikis");
        String secim = scan.next().toLowerCase();

        switch (secim) {
            case "1": saveInfo();
                break;
            case "2": getInfo();
                break;
            case "3": removeInfo();
                break;
            case "4": cikis();
                break;
            default: 	System.out.println("Yanlis Giris");
                selectOption();
                break;
        }
    }

    private void cikis() {
        System.out.println("Yine Bekleriz...");
    }

    /*
    saveInfo() method olusturun:
     1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
     2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
     3)Ayni kimlik numarasi ile bilgi girilmesine engel olun. */

        public void saveInfo () {
            int count = 0;
            System.out.println("Lutfen 4 haneli kimlik numaranizi giriniz");
            int kimlikNo = scan.nextInt();
            if (vatandaslar.containsKey(kimlikNo)) {
                System.out.println("Girdiginiz kimlik numarasi mevcut lutfen baska bir kimlik numarasi giriniz");
                count++;
                if (count == 3) {
                    System.out.println("3 defa hatali giris yaptiginiz icin hesabiniz bloke oldu");
                } else {
                    saveInfo();
                }
            } else {
                System.out.println("Lutfen isminizi ve soyisminizi giriniz");
                String isimSoyisim = scan.next();
                System.out.println("Lutfen adresinizi giriniz");
                String adres = scan.next();
                System.out.println("Lutfen telefon numaranizi giriniz");
                String telefon = scan.next();

                VatandasBilgileri vatandas = new VatandasBilgileri(kimlikNo,isimSoyisim, adres, telefon);
                vatandaslar.put(kimlikNo, vatandas);
                System.out.println("Bilgileriniz"+ "\n-----------------\nKimlik No: " +kimlikNo +
                                    "\nIsim Soyisim: " + isimSoyisim+ "\nAdres: " +adres+ "\nTelefon: " +telefon);
            }
            selectOption();
        }

    /* getInfo() method olusturun:
		 1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
		 2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin. */

        public void getInfo () {
            System.out.println("Lutfen bilgisini gormek istediginiz kisinin kimlik numarasini giriniz");
            int kimlikNumarasi = scan.nextInt();
            if (vatandaslar.containsKey(kimlikNumarasi)) {
                System.out.println(vatandaslar.get(kimlikNumarasi));
            } else {
                System.out.println("Girdiginiz kimlik numarasi mevcut degildir lutfen tekrar deneyiniz");
                getInfo();
            }
            selectOption();
        }

    /* removeInfo() method olusturun:
		 1)Kimlik numarasini girerek data silin.
		 2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
		 3)Collection bos ise kullaniciya hata mesaji verin. */

        public void removeInfo () {
            int count = 0;
            do {
                System.out.println("Lutfen silmek istediginiz kisininin kimlik numarasini giriniz");
                int kimlikNo = scan.nextInt();

                if (vatandaslar.containsKey(kimlikNo)) {
                    vatandaslar.remove(kimlikNo);
                    System.out.println("Girdiginiz kimlik numarasina sahip olan kisinin bilgileri basariyla silinmistir");
                    break;
                } else {
                    count++;
                    if (count == 3) {
                        System.out.println("3 defa hatali giris yaptiginiz icin hesabiniz bloke oldu");
                        break;
                    } else {
                        System.out.println("Girdiginiz kimlik numarasi mevcut degildir tekrar deneyiniz");
                    }
                }


            } while (true);
            selectOption();
        }

}
