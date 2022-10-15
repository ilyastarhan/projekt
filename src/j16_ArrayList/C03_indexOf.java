package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        //indexOf(); -> list icinde istenen elemanin index degerini return eder

        ArrayList<String> listUlke = new ArrayList<String>(List.of("Alamanya", "Amerika", "Kanada", "Fransa", "Ingiltere", "Isvec"));
        ArrayList<String> listSehir = new ArrayList<String>(List.of("Munchen", "Los Angeles", "Toronto", "Paris", "London", "Stockholm"));

        System.out.println(listSehir.indexOf("London")); //4
        System.out.println(listSehir.indexOf("Manisa")); //-1

        listUlke.add("Amerika");
        System.out.println(listUlke.indexOf("Amerika"));// 1 - tekrarli elemanlarda soldan ilk bulunan eleman index'i return eder
        System.out.println(listUlke.lastIndexOf("Amerika"));// 6 - tekrarli elemanlarda sagdan ilk bulunan eleman index'i return eder

    }
}
