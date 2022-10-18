package Homework.ekim14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bakkal {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> gunlerList = new ArrayList<>(List.of("Pazartesi",
            "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static ArrayList<Double> gunlukKazanc = new ArrayList<Double>();

    static double toplamkazanc = 0;
    static double ortalamaKazanc = 0;

    public static void main(String[] args) {

        int i = 0;
        while(i<7){
            System.out.println("Lütfen " + gunlerList.get(i) + " gününün kazancini giriniz: ");
            double kazanc = scan.nextDouble();
            gunlukKazanc.add(kazanc);
            toplamkazanc+= kazanc;
            i++;
        }

        System.out.println("Ortalama kazanciniz = " + getOrtalamaKazanc());
        System.out.println("gunlukKazanc = " + gunlukKazanc);
        System.out.println("Ortalamanin üstünde kazandiginiz günler: " + getOrtalamaninUstundeKazancGunleri());
        System.out.println("Ortalamanin üstünde kazandiginiz günler: " + getOrtalamaninAltindaKazancGunleri());


    }

    public static String getOrtalamaninAltindaKazancGunleri() {
        String gunler = "";
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i)< getOrtalamaKazanc()) {
                gunler += gunlerList.get(i) + " ";
            }
        }
        return gunler;
    }

    public static String getOrtalamaninUstundeKazancGunleri() {

        String gunler = "";
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i)> getOrtalamaKazanc()) {
                gunler += gunlerList.get(i) + " ";
            }
        }
        return gunler;
    }

    public static double getOrtalamaKazanc() {
        ortalamaKazanc = toplamkazanc/7;
        return ortalamaKazanc;
    }
}
