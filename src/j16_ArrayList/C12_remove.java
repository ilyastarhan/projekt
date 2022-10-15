package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove
{
    public static void main(String[] args) {

        //remove(); ->listenen istenen elemani siler

        ArrayList<String> listUlke = new ArrayList<String>(List.of("Alamanya", "Amerika", "Kanada", "Fransa", "Ingiltere", "Isvec"));
        ArrayList<String> listSehir = new ArrayList<String>(List.of("Munchen", "Los Angeles", "Toronto", "Paris", "London", "Stockholm"));
        System.out.println("listUlke = " + listUlke);
        System.out.println("listUlke.remove(4) = " + listUlke.remove(4)); // String
      //  System.out.println("listUlke.remove(7) = " + listUlke.remove(7)); // String
        System.out.println("listUlke.remove() = " + listUlke.remove("Fransa"));//sildigi eleman varsa true
        System.out.println("listUlke.remove() = " + listUlke.remove("Türkiye"));//sildigi eleman yoksa false
        System.out.println("listUlke = " + listUlke);
        listUlke.add("Alamanya");
        listUlke.add("Greece");
        listUlke.add("Kanada");
        System.out.println("listUlke = " + listUlke);
        listUlke.remove("Alamanya");
        System.out.println("listUlke = " + listUlke);
        System.out.println("listUlke.removeAll(listUlke) = " + listUlke.removeAll(listUlke));
    }
}
