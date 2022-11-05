package challange;

import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {

        int sayi1 = 544;
        int sayi2 = 172;

        tamBolenlerToplami(sayi1);
        System.out.println();
        tamBolenlerToplami(sayi2);
        System.out.println();
        System.out.println("ebob(sayi1, sayi2) = " + ebob(sayi1, sayi2));
        System.out.println();
        ekok(sayi1, sayi2);
        System.out.println();
        ekok1(sayi1, sayi2);
    }

    private static void ekok1(int sayi1, int sayi2) {
        int ekok = (sayi1*sayi2)/ebob(sayi1, sayi2);
        System.out.println("ekok = " + ekok);
    }

    private static int ebob(int sayi1, int sayi2) {
        int ebob = 1;
        for (int i = Math.min(sayi1, sayi2); i >= 2; i--) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
                break;
            }
        }
        return ebob;
    }

    private static void ekok(int sayi1, int sayi2) {
        ArrayList<Integer> bolenler = new ArrayList<Integer>();
        int ekok = 1;
        for (int i = 2; i <= Math.max(sayi1, sayi2); i++) {
            while (sayi1 % i == 0 || sayi2 % i == 0) {
                bolenler.add(i);
                ekok *= i;
                if (sayi1 % i == 0)
                    sayi1 /= i;
                if (sayi2 % i == 0)
                    sayi2 /= i;
            }
        }
        System.out.println("bölenler = " + bolenler);
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
