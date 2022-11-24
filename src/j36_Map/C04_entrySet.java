package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        //map.entrySet()-> girilen map in key value datalrini set e atayip return eder.
        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");
        System.out.println("hm = " + hm);
        System.out.println("hm.entrySet() = " + hm.entrySet());
        for(Map.Entry<String, String> e: hm.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());//entrySet(9 ile gelen key value loop ici  Entry<kwy,value> data

        }
    }
}
