package alistirmalar.diger;

import java.util.Scanner;

public class Daire_Alani_Hesaplama {
    public static void main(String[] args) {
        double r;
        double pi = 3.14;
        double alan;
        double cevre;
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen dairenin yari capini \"cm\" olarak giriniz: ");
        r = scan.nextDouble();
        alan = pi * r*r;
        cevre = 2 * pi * r;
        System.out.println("Daire' nin alani: " + alan + "cm2 dir");
        System.out.println("Daire' nin cevresi: " + cevre + "cm'dir");


    }
}
