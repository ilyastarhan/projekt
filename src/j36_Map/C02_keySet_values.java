package j36_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        //map.keySet()-> map key degerlerini Set'e atayip return eder
        // map.values()-> map value degerlerini collectiona atayip return eder
        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");
        System.out.println("hm = " + hm);
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for(String key : hm.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();
        for(String value : hm.values()){
            System.out.print(value + " ");
        }
    }
}
