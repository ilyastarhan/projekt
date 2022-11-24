package j36_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        //map.get(key)-> parametre olarak aldigi key degerinin value degerini  döndürür
        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");
        System.out.println("hm = " + hm);
        System.out.println("hm.get(\"Saturn\") = " + hm.get("Saturn"));
        System.out.println(hm.get("olmayan key"));//olmayan key icin null return eder
        System.out.println("hm.get(12) = " + hm.get(12));//key data type farkli olsa da null return eder

    }
}
