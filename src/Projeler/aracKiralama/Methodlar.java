package Projeler.aracKiralama;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Methodlar {
    static Scanner scan = new Scanner(System.in);
    static int aracSecim;

    public static void aracListesiYazdir() {
        System.out.println("******Sistemde kayitli araclar******");
        System.out.println("ID" + "\t\tMarka" + "\t\tModel" + "\t\tYakit Tipi" + "\t\tVites Tipi" + "\t\tGünlük Ücret");
        AracListesi.aracListesi.values().stream().forEach(t -> System.out.println(t));


    }

    public static int filtreUygulayarakAracSec() {

        AracListesi.aracListesi.values().stream().map(Arac::getMarka).distinct().forEach(t -> System.out.println(t + " "));

        System.out.print("Lütfen aracin markasini giriniz");
        String marka = scan.nextLine();
        AracListesi.aracListesi.values().stream().filter(t -> t.getMarka().equalsIgnoreCase(marka)).forEach(t -> System.out.println(t + " "));

        System.out.print("Lütfen vites tipini giriniz: ");
        String vites = scan.nextLine();
        AracListesi.aracListesi.values().stream().filter(t -> t.getMarka().equalsIgnoreCase(marka) && t.getVites().equalsIgnoreCase(vites)).forEach(t -> System.out.println(t + " "));

        System.out.print("Lütfen secmek istediginiz aracin id'sini giriniz");
        aracSecim = TryCatch.sayiGir(1000, 1013);
        return filtreUygulayarakAracSec();
    }

    public static int aracSec() {
        System.out.print("Lütfen secmek isteginiz Arac Id sini giriniz: ");
        return aracSecim = TryCatch.sayiGir(1000, 1013);

    }

    public static void ucretHesapla() {

        System.out.println("Sectiginiz araca ait günlük ücret = " + AracListesi.aracListesi.get(aracSecim).getGunlukUcret());

    }

    public static int kiralanacakGun() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime teslimAlma, teslimEtme;
        while (true) {
            System.out.print("Araci kiralanacak istediginiz tarih ve saati girin (GG-AA-YYYY SS:DD:SS): ");
            try {
                teslimAlma = LocalDateTime.parse(scan.nextLine(), formatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Lütfen örnekteki formatta tarih giriniz");
            } catch (DateTimeException f) {
                System.out.println("Lütfen tarihi ay ve güne dikkat ederek giriniz");
            }
        }
        while (true) {
            System.out.print("Araci teslim etmek istediginiz tarih ve saati girin (GG-AA-YYYY SS:DD:SS): ");        //     try {

            try {
                teslimEtme = LocalDateTime.parse(scan.nextLine(), formatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Lütfen örnekteki formatta tarih giriniz");
            } catch (DateTimeException f) {
                System.out.println("Lütfen tarihi ay ve güne dikkat ederek giriniz");
            }
        }
        Duration duration = Duration.between(teslimAlma, teslimEtme);

        long fark = duration.toDays() + 1;
        System.out.println(fark);

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // LocalDate teslimAlma, teslimEtme;
        // while (true) {
        //     System.out.println("Lutfen teslim almak istediginiz gunu giriniz: (Ornek: 12-04-2022)");

        //     try {
        //         teslimAlma = LocalDate.parse(scan.next(), formatter);
        //         break;
        //     } catch (DateTimeParseException e) {
        //         System.out.println("Lütfen örnekteki formatta tarih giriniz");
        //     }
        //     catch (DateTimeException f){
        //         System.out.println("Lütfen tarihi ay ve güne dikkat ederek giriniz");
        //     }
        // }
        // while (true) {
        //     System.out.println("Lutfen teslim etmek istediginiz gunu giriniz: (Ornek: 15-04-2022)");
        //     try {
        //         teslimEtme = LocalDate.parse(scan.next(), formatter);
        //         break;
        //     }
        //     catch (DateTimeParseException e) {
        //         System.out.println("Lütfen örnekteki formatta tarih giriniz");
        //     }
        //     catch (DateTimeException f){
        //         System.out.println("Lütfen tarihi ay ve güne dikkat ederek giriniz");
        //     }
        // }
        //     System.out.println(Period.between(teslimAlma, teslimEtme).getDays()+1);//
        //     if (Period.between(teslimAlma, teslimEtme).getDays() < 0) {
        //         System.out.println("teslim tarihi kiralama tarihinden önce olamaz");
        //         kiralanacakGun();
        //     }
        //     if (Period.between(teslimAlma, teslimEtme).getDays() > 0)
        //         return (Period.between(teslimAlma, teslimEtme).getDays()+1);
        //     else
        //         return 1;
        return (int) fark;
    }

    public static void odeme() {

        String kartNo;
        while (true) {
            System.out.println("Lütfen 12 haneli kredi karti numaranizi giriniz: ");
            kartNo = scan.nextLine();
            if (kartNo.length() == 12 && kartNo.matches("[0-9]")) {
                System.out.println("Ödemeniz gerceklesmistir...\n");
                break;
            } else
                System.out.println("Hatati giris yaptiniz tekrar deneyiniz...");
            System.out.println("Cikis yapmak istiyorsaniz \"q\" ya basiniz");
            if (kartNo.equalsIgnoreCase("q")) {
                cikis();
            }
        }
        System.out.println("Ödemeniz gerceklesmistir...\n");
        cikis();

    }

    public static void cikis() {
        System.out.println("Iyi gunler dileriz");
        System.exit(0);
    }
}
