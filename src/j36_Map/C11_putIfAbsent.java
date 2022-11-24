package j36_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<String, String>();
        //map.putIfAbsent() -> Girilen key map de yoksa entry(key,value) map e ekler ve null return eder
        //girilen key map de varsa key.value return eder.

        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");
        System.out.println("hm = " + hm);
        System.out.println("hm.putIfAbsent(\"Alamanya\", \"Berlin\") = " + hm.putIfAbsent("Alamanya", "Berlin"));
        System.out.println("hm.putIfAbsent(\"Saturn\", \"300 Euro\") = " + hm.putIfAbsent("Saturn", "300 Euro"));
        System.out.println("hm.putIfAbsent(\"Saturn\", \"200 Euro\") = " + hm.putIfAbsent("Saturn", "200 Euro"));
        System.out.println("hm = " + hm);

    }
}
