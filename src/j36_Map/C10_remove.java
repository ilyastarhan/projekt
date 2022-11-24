package j36_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<String, String>();
        //map.remove() -> Girilen entry map de varsa siler ve true return eder, yoksa false return eder.

        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");
        System.out.println("hm = " + hm);
        System.out.println("hm.remove(\"Amazon\", \"296 Euro\") = " + hm.remove("Amazon", "296 Euro"));
        System.out.println("hm.remove(\"Amazon\", \"GabiK\") = " + hm.remove("Amazon", "GabiK"));
        System.out.println("hm.remove(\"ebik\", \"gabik\") = " + hm.remove("ebik", "gabik"));
        System.out.println("hm.remove(\"Ebay\") = " + hm.remove("Ebay"));
        System.out.println("hm.remove(\"111 Euro\") = " + hm.remove("111 Euro"));
        System.out.println("hm = " + hm);
    }
}
