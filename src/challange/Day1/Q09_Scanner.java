package challange.Day1;

import java.util.Scanner;

public class Q09_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cemberin yari capini \"cm\" olarak giriniz: ");
        double r = scan.nextDouble();
        double pi = 3.14;
        double cevre = 2*pi*r;
        double alan = pi*r*r;
        System.out.println("cemberin cevresi = " + cevre + " cm'dir" + "\nCemberin alani = " + alan + " cm²'dir");
        scan.nextLine();
        System.out.println("Lütfen isminizi giriniz: ");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz: ");
        String soyisim = scan.nextLine();

        System.out.println("Isim - soyisim : " + isim + " " + soyisim);
        char a = isim.charAt(0);
        System.out.println("isminizin ilk harfi: " + a);
    }
}
