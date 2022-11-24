package j36_Map;

import java.util.HashMap;

public class C09_getOrDefault {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        //map.getOrDefault()-> girilen  key map te varsa key e ait value yoksa default deger return eder
        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");
        System.out.println("hm = " + hm);
        System.out.println("hm.getOrDefault(\"Ebay\", \"Ebikgabik\") = " + hm.getOrDefault("Ebay", "Ebikgabik"));
        //ebay map de var oldugu icin ebay e ait value return edildi
        System.out.println("hm.getOrDefault(\"Ebik\", \"gabik\") = " + hm.getOrDefault("Ebik", "gabik"));
        //ebik key map te olmadigi icin bu key default deger gabik atanip return edildi
        System.out.println("hm = " + hm);
    }
}
