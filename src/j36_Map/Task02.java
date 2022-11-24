package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */

        Map<String, String> nazim = new HashMap<String, String>();
        nazim.put("isim", "Nazim");
        nazim.put("email", "nazim@gmail.com");
        nazim.put("adres", "ankara-sincan");
        nazim.put("telefon", "0312 485 7859");
        Map<String, String> semih = new HashMap<String, String>();
        semih.put("isim", "semih");
        semih.put("email", "semih@gmail.com");
        semih.put("adres", "ankara-gölbasi");
        semih.put("telefon", "0312 485 8596");
        Map<String, Map<String,String>> kartvizit = new HashMap<>();
        kartvizit.put("Semih", semih);
        kartvizit.put("Nazim", nazim);
        System.out.println("kartvizit = " + kartvizit);
        System.out.println("kartvizit.get(\"Nazim\").get(\"telefon\") = " + kartvizit.get("Nazim").get("telefon"));

        Map<Integer, Kartvizit> krt = new HashMap<>();
        System.out.println("krt = " + krt);
        Kartvizit krt1 = new Kartvizit("Ahmet", "ahmet@gmail.com", "Ankara-Altindag", "03126524789");
        krt.put(krt1.id, krt1);
        Kartvizit krt2 = new Kartvizit("Enise", "enise@gmail.com", "Google co", "03126547896");
        System.out.println("krt2.id = " + krt2.id);
        krt.put(krt2.id, krt2);
        System.out.println("krt = " + krt);


    }
}


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
