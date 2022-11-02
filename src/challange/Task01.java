package challange;

import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {

        int sayi1 = 34;
        tamBolenlerToplami(sayi1);

        int sayi2 = 36;
        ebob(sayi1, sayi2);
        ekok(sayi1, sayi2);
    }

    private static void ebob(int sayi1, int sayi2) {
        int ebob = 0;
        for (int i = Math.min(sayi1, sayi2); i >= 2; i--) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
                break;
            }
        }
        System.out.println("Sayilarin en büyük ortak böleni: " + ((ebob >= 2) ? ebob : "yok"));
    }

    private static void ekok(int sayi1, int sayi2) {
        ArrayList<Integer> bolenler = new ArrayList<Integer>();
        int ekok = 1;
        for (int i = 2; i <= Math.max(sayi1, sayi2); i++) {
            if (sayi1 % i == 0 || sayi2 % i == 0) {
                bolenler.add(i);
                ekok *= i;
                if (sayi1 % i == 0)
                    sayi1 /= i;
                if (sayi2 % i == 0)
                    sayi2 /= i;
            }
        }
        System.out.println("ortakCarpanlar = " + bolenler);
        System.out.println("Sayilarin en kücük ortak kati = " + ekok);
    }

    private static void tamBolenlerToplami(int sayi) {
        int toplam = 0;
        ArrayList<Integer> tamBolenler = new ArrayList<Integer>();
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                tamBolenler.add(i);
                toplam += i;
            }
        }
        System.out.println(sayi + " sayisinin tam bölenleri = " + tamBolenler);
        System.out.println(sayi + " sayisinin tam bölenler toplami = " + toplam);
    }
}
