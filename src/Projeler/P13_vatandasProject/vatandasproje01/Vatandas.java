package Projeler.P13_vatandasProject.vatandasproje01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Vatandas {
    Map<Integer, VatandasBilgileri> vatandaslar = new HashMap<>();
    Scanner scan = new Scanner(System.in);
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


    /*
    saveInfo() method olusturun:
     1)Kullanicidan bir kimlik numarasi(4 haneli), isim, adres ve telefon alin.
     2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
     3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
     */
    public void saveInfo() {
        int count = 0;

        System.out.println("Lutfen kimlik numaranizi giriniz");
        int kimlikNo = scan.nextInt();
        if (vatandaslar.containsKey(kimlikNo)) {
            System.out.println("Girdiginiz kimlik numarasi mevcut lutfen baska bir kimlik numarasi giriniz");
            count++;
            if (count == 3) {
                System.out.println("3 defa hatali giris yaptiniz hesabiniz bloke oldu");
            } else {
                saveInfo();
            }
        } else {
            scan.nextLine();
            System.out.println("Lutfen Isim ve Soyisminizi giriniz");
            String isimSoyisim = scan.nextLine();
            System.out.println("Lutfen adres'inizi giriniz");
            String adres = scan.nextLine();
            System.out.println("Lutfen telefon numaranizi giriniz");
            String telefonNo = scan.next();

            VatandasBilgileri vatandas = new VatandasBilgileri(isimSoyisim, adres, telefonNo);
            vatandaslar.put(kimlikNo, vatandas);
        }

        selectOption();
    }

    /*
        getInfo() method olusturun:
        1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
        2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
     */
    public void getInfo() {
        System.out.println("Lutfen bilgisini gormek istediginiz kisinin kimlik numarasini giriniz");
        int kimlikNumarasi = scan.nextInt();
        if (vatandaslar.containsKey(kimlikNumarasi)) {
            System.out.println(kimlikNumarasi + " kimlik numarali kisinin " + vatandaslar.get(kimlikNumarasi));
        } else {
            System.out.println("Girdiginiz kimlik numarasi mevcut degildir lutfen tekrar deneyiniz");
            getInfo();
        }
        selectOption();
    }


    /*
    removeInfo() method olusturun:
     1)Kimlik numarasini girerek data silin.
     2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
     3)Collection bos ise kullaniciya hata mesaji verin.
     */
    public void removeInfo() {
        int count = 0;
        do {
            if (vatandaslar.size() == 0) {
                System.out.println("Herhangi bir vatandas kayitli degildir lutfen once vatandas ekleyin\nSizleri Kisi ekleme menusune yonlendiriyoruz. Lutfen bekleyin...");
                saveInfo();
                selectOption();
            } else {
                System.out.println("Lutfen silmek istediginiz kisinin kimlik numarasini giriniz");
                int kimlikNo = scan.nextInt();
                if (vatandaslar.containsKey(kimlikNo)) {
                    vatandaslar.remove(kimlikNo);
                    System.out.println("Girdiginiz kimlik numarasina sahip olan kisinin bilgileri basariyla silinmistir!");
                    break;
                } else {
                    count++;
                    if (count == 3) {
                        System.out.println("3 defa hatali giris yaptiniz hesabiniz bloke oldu");
                        break;
                    } else {
                        System.out.println("Girdiginiz kimlik numarasi mevcut degildir lutfen tekrar deneyiniz");
                    }

                }

            }

        } while (true);
        if (count == 3) {
            cikis();
        } else {
            selectOption();
        }


    }


    /*
            selectOption() method olusturun:
            1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
     */
    int count = 0;

    public void selectOption() {
        System.out.println("Lutfen yapmak istediginiz islemi seciniz\n1:Kisi Ekleme\n2:Kisi Arama\n3:Kisi silme\n4:Listeleme\n5:Cikis");
        String secim = scan.next();
        switch (secim) {
            case "1":
                saveInfo();
                count++;
                break;
            case "2":
                getInfo();
                count++;
                break;
            case "3":
                removeInfo();
                count++;
                break;
            case "4":
                listeleme();
                break;
            case "5":
                cikis();
                break;
            default:
                System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz");
        }
    }

    public void cikis() {
        System.out.println("Bizi tercih ettiginiz icin tesekkurler iyi gunler dileriz...");
    }

    public void listeleme() {
        Set<Integer> allKeys = vatandaslar.keySet();
        int i = 1;
        if (allKeys.size() == 0) {
            System.out.println("Listelenicek kimse yoktur");
            selectOption();
        } else {
            for (Integer each : allKeys) {
                System.out.println(i + ". Kisinin bilgileri\n" + "Kimlik no:" + each + " " + vatandaslar.get(each));
                i++;
            }
        }

    }

}
