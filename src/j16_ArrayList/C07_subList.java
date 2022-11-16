package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {

    public static void main(String[] args) {

        ArrayList<String> listUlke = new ArrayList<String>(List.of("Alamanya", "Amerika", "Kanada", "Fransa", "Ingiltere", "Isvec"));
        ArrayList<String> listSehir = new ArrayList<String>(List.of("Munchen", "Los Angeles", "Toronto", "Paris", "London", "Stockholm"));
        //sublist(); -> listenen istenen list parcasini return eder

        System.out.println(listSehir.subList(3, listSehir.size())) ;
        ArrayList<String> yeniList = new ArrayList<String>(listSehir.subList(2,5));
        System.out.println(yeniList);
    }
}
