package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {

        //set();-> listin istenen indexe istenen elemanı update eder.
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih", "losAngeles", "Londra", "stockholm"));
        System.out.println(listSehir.set(3, "Angara"));//stockholm->set edilen değer print edilir

        System.out.println(listSehir);//[Münih, losAngeles, Londra, Angara]-> list set edilmiş hali print edildi

        // System.out.println(listSehir.set(11, "pataGONYA"));//olmayan index set edilirse RTE veririr.
        System.out.println("listSehir = " + listSehir);
    }}