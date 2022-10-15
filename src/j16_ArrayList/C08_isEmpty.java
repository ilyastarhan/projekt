package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty {
    public static void main(String[] args) {

        //isEmpty() -> listenin bos olup olmadigini kontrol eder.
        //clear() -> listenin tüm elemanlarini siler

        ArrayList<String> listUlke = new ArrayList<String>(List.of("Alamanya", "Amerika", "Kanada", "Fransa", "Ingiltere", "Isvec"));
        ArrayList<String> listSehir = new ArrayList<String>(List.of("Munchen", "Los Angeles", "Toronto", "Paris", "London", "Stockholm"));

        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());
        System.out.println("listSehir = " + listSehir);
        listSehir.clear();//List temizlendi
        System.out.println("listSehir = " + listSehir);
        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty());

    }
}
