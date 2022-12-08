package Projeler.aracKiralama;

import java.util.Scanner;

public class Methodlar {
    static Scanner scan = new Scanner(System.in);

    public static void aracListesiYazdir() {
        System.out.println("******Sistemde kayitli araclar******");
        System.out.println("ID" + "\t\tMarka" + "\t\tModel" + "\t\tYakit Tipi" + "\t\tVites Tipi" + "\t\tGünlük Ücret");
        AracListesi.aracListesi.values().stream().forEach(t -> System.out.println(t));

    }

    public static Arac araclariFiltrele() {

        AracListesi.aracListesi.values().stream().map(t -> t.getMarka()).distinct().forEach(t -> System.out.println(t + " "));

        System.out.println("Lütfen aracin markasini giriniz");
        String marka = scan.nextLine();
        AracListesi.aracListesi.values().stream().filter(t -> t.getMarka().equalsIgnoreCase(marka)).forEach(t -> System.out.println(t + " "));

        System.out.println("Lütfen aracin modelini giriniz");
        String model = scan.nextLine();
        AracListesi.aracListesi.values().stream().filter(t -> t.getMarka().equalsIgnoreCase(marka) && t.getModel().equalsIgnoreCase(model)).forEach(t -> System.out.println(t + " "));

        System.out.println("Lütfen secmek istediginiz aracin id'sini giriniz");
        int id = TryCatch.sayiGir(1000, 1013);
        System.out.println(AracListesi.aracListesi.get(id));
        return AracListesi.aracListesi.get(id);
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
