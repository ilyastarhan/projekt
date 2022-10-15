package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {
        ArrayList<String> listUlke = new ArrayList<String>(List.of("Alamanya", "Amerika", "Kanada", "Fransa", "Ingiltere", "Isvec"));
        ArrayList<String> listSehir = new ArrayList<String>(List.of("Munchen", "Los Angeles", "Toronto", "Paris", "London", "Stockholm"));

        //nCopies(int, Obj); -> int elemanli bir obj den olusan list atamasi yapar
        ArrayList<String> yeniList = new ArrayList<String>(Collections.nCopies(3, "JavaCAN"));
        System.out.println("yeniList = " + yeniList);

        //addAll(); -> bir listeyi diger listeye oldugu gibe ekler
        listUlke.addAll(listSehir); // ülke list sonuna sehir list tamamen eklendi
        System.out.println(listUlke);
        listSehir.addAll(3, listUlke); //
        System.out.println(listSehir);
        ArrayList <Integer> listSayi = new ArrayList<Integer>(10);
        for (int i = 1; i <= 10; i++) {
            listSayi.add(i);
        }
        System.out.println(listSayi);

    }
}
