package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        //size(); listenin eleman sayisini return eder.

        ArrayList<String> listUlke = new ArrayList<String>(List.of("Alamanya", "Amerika", "Kanada", "Fransa", "Ingiltere", "Isvec"));
        ArrayList<String> listSehir = new ArrayList<String>(List.of("Munchen", "Los Angeles", "Toronto", "Paris", "London", "Stockholm"));

        System.out.println(listSehir.size());

    }
}