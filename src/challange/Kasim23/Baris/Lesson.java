package challange.Kasim23.Baris;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public  class Lesson {
    static Scanner sc = new Scanner(System.in);
    private int maxKrediSayisi = 10;
    private int kalanKrediSayisi = 10;
    private int alinanKrediSayisi = 0;
    private int dersMinKredi= 0;
    private int kullaniciTercihi;

    ArrayList<String> dersler = new ArrayList<>(Arrays.asList("Java", "Math", "English", "Turkish", "Science"));
    ArrayList<Integer> derslerinKredileri = new ArrayList<>(Arrays.asList(4, 3, 4, 2, 3));
    ArrayList<String> alinanDersler= new ArrayList<>();
    ArrayList<Integer> alinanDerslerinKredileri= new ArrayList<>();

    public int getMaxKrediSayisi() {
        return maxKrediSayisi;
    }

    public void setMaxKrediSayisi(int maxKrediSayisi) {
        this.maxKrediSayisi = maxKrediSayisi;
    }

    public int getKalanKrediSayisi() {
        return kalanKrediSayisi;
    }

    public void setKalanKrediSayisi(int kalanKrediSayisi) {
        this.kalanKrediSayisi = kalanKrediSayisi;
    }

    public int getAlinanKrediSayisi() {
        return alinanKrediSayisi;
    }

    public void setAlinanKrediSayisi(int alinanKrediSayisi) {
        this.alinanKrediSayisi = alinanKrediSayisi;
    }

    public int getDersMinKredi() {
        return dersMinKredi;
    }

    public void setDersMinKredi(int dersMinKredi) {
        this.dersMinKredi = dersMinKredi;
    }

    public int getKullanicitercihi() {
        return kullaniciTercihi;
    }

    public void setKullanicitercihi(int kullanicitercihi) {
        this.kullaniciTercihi = kullanicitercihi;
    }



    public void dersEkle(Student ogr1) {
        while (kalanKrediSayisi >= dersMinKredi && !(kullaniciTercihi == 9 || kullaniciTercihi == 10)) {
            System.out.println("Alabileceğiniz dersler ve ders kredileri: ");
            System.out.println("================================================================");
            int j = 1;
            for (int i = 0; i < dersler.size(); i++) {
                if (kalanKrediSayisi >= derslerinKredileri.get(i)) {
                    System.out.println(j + ")" +dersler.get(i) + " dersi " + derslerinKredileri.get(i) + " kredi. " + dersler.get(i) + " dersini seçmek için--> " + j + " giriniz.");
                    j++;            }
            }
            System.out.println("Alabileceğiniz toplam kredi: " + kalanKrediSayisi);
            System.out.println("Almak istediğiniz dersi giriniz: ");

            System.out.println("Üst Menüye gitmek istiyorsanız : -->  10 giriniz");
            kullaniciTercihi = sc.nextInt()-1;
            setKullanicitercihi(kullaniciTercihi);
            switch (getKullanicitercihi()) {
                case 8:
                    dersSeciminiBitir(ogr1);
                    break;
                case 9:
                    ustMenu(ogr1);
                    break;
                default: {
                    alinanKrediSayisi +=derslerinKredileri.get(kullaniciTercihi);
                    kalanKrediSayisi = maxKrediSayisi - alinanKrediSayisi;
                    alinanDersler.add(dersler.get(kullaniciTercihi));
                    alinanDerslerinKredileri.add(derslerinKredileri.get(kullaniciTercihi));
                    dersler.remove(dersler.get(kullaniciTercihi));
                    if (dersler.size() == 0) {
                        alinanDersler(ogr1);
                        break;
                    }
                    derslerinKredileri.remove(derslerinKredileri.get(kullaniciTercihi));
                    dersMinKredi=Collections.min(derslerinKredileri);
                    alinanDersler(ogr1);
                    break;
                }
            }

        }

    }
    public void ustMenu(Student ogr1){

        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        if (kalanKrediSayisi >= getDersMinKredi()) {
            System.out.println("Ders eklemek için-->7");
        }
        if (alinanDerslerinKredileri.size() != 0) {
            System.out.println("Ders Bırakmak için-->8");
            System.out.println("Ders Seçme İşlemini Bitirmek için-->9\nGiriniz:");
        } else System.out.println("Ders Seçme İşlemini Bitirmek için-->9\nGiriniz:");
        kullaniciTercihi = sc.nextInt()-1;
        setKullanicitercihi(kullaniciTercihi);
        switch (getKullanicitercihi()) {
            case 6:
                dersEkle(ogr1);
                break;
            case 7:
                dersBirak(ogr1);
                break;
            case 8: {
                dersSeciminiBitir(ogr1);
                break;
            }
            default: {
                System.out.println("Hatalı giriş yaptınız.Lütfen İstenilen şarta uygun sayı giriniz.");
                ustMenu(ogr1);
                break;
            }
        }
    }
    public void alinanDersler(Student ogr1) {
        System.out.println("Aldığınız dersler               Ders Kredisi");
        System.out.println("============================================");
        for (int i = 0; i < alinanDersler.size(); i++) {
            System.out.printf((i + 1) + ")" + "%-15.10s%17.2s\n", alinanDersler.get(i), alinanDerslerinKredileri.get(i));
        }
        System.out.println("=============================================");
        System.out.println("Aldığınız Toplam Kredi:          " + alinanKrediSayisi + "\nAlabileceğiniz Maksimum kredi:   " + kalanKrediSayisi + "\n");
        ustMenu(ogr1);

    }
    public void dersBirak(Student ogr1) {
        while (alinanDersler.size() != 0 && !(kullaniciTercihi == 7 || kullaniciTercihi == 9 || kullaniciTercihi == 10)) {
            System.out.println("Bırakabileceğiniz dersler ve ders kredileri: ");
            System.out.println("================================================================");
            for (int i = 0; i < alinanDersler.size(); i++) {
                System.out.println((i + 1) + ") " + alinanDersler.get(i) + " dersi " + alinanDerslerinKredileri.get(i) + " kredi. " + alinanDersler.get(i) + " dersini Bırakmak  için--> " + (i) + " giriniz.");
            }
            if (kalanKrediSayisi >= getDersMinKredi()) System.out.println("Ders eklemek için-->7");
            System.out.println("Ders Seçme İşlemini Bitirmek için-->9\nGiriniz:");

            kullaniciTercihi = sc.nextInt()-1;
            setKullanicitercihi(kullaniciTercihi);
            if (kullaniciTercihi < 0 || (kullaniciTercihi >= alinanDersler.size() && kullaniciTercihi != 7 && kullaniciTercihi != 9)) {
                System.out.println("Hatalı giriş yaptınız.Lütfen İstenilen şarta uygun sayı giriniz.");
                dersBirak(ogr1);
            }
            switch (getKullanicitercihi()) {
                case 7:
                    dersEkle(ogr1);
                    break;
                case 9:
                    dersSeciminiBitir(ogr1);
                    break;

                default:
                    alinanKrediSayisi -= alinanDerslerinKredileri.get(kullaniciTercihi);
                    kalanKrediSayisi = maxKrediSayisi - alinanKrediSayisi;
                   dersler.add(alinanDersler.get(kullaniciTercihi));
                    derslerinKredileri.add(alinanDerslerinKredileri.get(kullaniciTercihi));
                    alinanDersler.remove(alinanDersler.get(kullaniciTercihi));
                    alinanDerslerinKredileri.remove(alinanDerslerinKredileri.get(kullaniciTercihi));
                    setDersMinKredi(Collections.min(derslerinKredileri));
                    alinanDersler(ogr1);
            }
        }
    }


    public void dersSeciminiBitir(Student ogr1) {
        System.out.println("\nAd soyad: " + ogr1.getAd() + " Öğrenci No: " + ogr1.getNo() + "\nDers seçme işlemini tamamladınız.\n");
        if (alinanKrediSayisi > 0) {
            System.out.println("Aldığınız dersler     Ders Kredisi");
            System.out.println("======================================");
            for (int i = 0; i < alinanDersler.size(); i++) {
                System.out.printf((i + 1) + ")" +"%-15.10s%17.2s\n", alinanDersler.get(i), alinanDerslerinKredileri.get(i));
            }
            System.out.println("======================================");
        }

        System.out.println("Aldığınız Toplam Kredi:          " + alinanKrediSayisi);
    }
















}
