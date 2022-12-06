package Team07.p6_Loops.break_Continue;

import java.util.ArrayList;

public class Ebob_Ekok {

    /*--->>> EBOB
    En az biri sıfırdan farklı iki veya daha fazla tam sayının pozitif ortak bölenlerinin en büyüğüne bu sayıların
    en büyük ortak böleni kısaca “EBOB“u denir.
    18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
     */

    /*---->>>> EKOK ->>> (sayi1*sayi2)/ebob

    En az biri sıfırdan farklı iki veya daha fazla tam sayının pozitif ortak katlarının en küçüğüne bu sayıların en küçük ortak katı kısaca “EKOK“u denir.

    4 ve 6 sayılarının en küçük ortak katını adım adım bulalım.

     */

    public static void main(String[] args) {
















        int sayi1= 12;
        int sayi2 = 6;

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
}
