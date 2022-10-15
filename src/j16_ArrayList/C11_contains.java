package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {






        ArrayList<String> listUlke = new ArrayList<String>(List.of("Alamanya", "Amerika", "Kanada", "Fransa", "Ingiltere", "Isvec"));
        ArrayList<String> listSehir = new ArrayList<String>(List.of("Munchen", "Los Angeles", "Toronto", "Paris", "London", "Stockholm"));


        System.out.println("listSehir.contains(\"alamanya\") = " + listSehir.contains("alamanya"));

    }
}
