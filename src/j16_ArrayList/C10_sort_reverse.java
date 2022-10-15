package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_sort_reverse {

    public static void main(String[] args) {

        //Collections.sort(list); -> verilen listeyi natural siralama yapar
        //Collections.reverse(list); -> verilen listenin ters siralamasini return eder

        ArrayList<String> listUlke = new ArrayList<String>(List.of("Alamanya", "Amerika", "Kanada", "Fransa", "Ingiltere", "Isvec"));
        ArrayList<String> listSehir = new ArrayList<String>(List.of("Munchen", "Los Angeles", "Toronto", "Paris", "London", "Stockholm"));

        Collections.sort(listUlke);
        System.out.println("listUlke = " + listUlke);
        Collections.reverse(listUlke);
        System.out.println("listUlke = " + listUlke);


    }
}
