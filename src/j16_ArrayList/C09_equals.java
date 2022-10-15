package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_equals {
    public static void main(String[] args) {

        //equals(); -> iki listenin index ve eleman esitligini kontrol eder true/false return eder
        ArrayList<String> listUlke = new ArrayList<String>(List.of("Alamanya", "Amerika", "Kanada", "Fransa", "Ingiltere", "Isvec"));
        ArrayList<String> listSehir = new ArrayList<String>(List.of("Munchen", "Los Angeles", "Toronto", "Paris", "London", "Stockholm"));
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b"));
        List<String> list2 = new ArrayList<>(Arrays.asList("A", "b"));
        List<String> list3 = new ArrayList<>(Arrays.asList("a", "b"));

        System.out.println(list1.equals(list2));  //false
        System.out.println(list1.equals(list3));  //true
        System.out.println(list2.equals(list3));  //false
    }
}
