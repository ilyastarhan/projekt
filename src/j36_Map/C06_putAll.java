package j36_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<String, String>();
        //map.putAll()-> girilen map'i istenen mep'e ekler
        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("köfteci yusuf", "kaburga izgara");
        hm2.put("Starbucks", "flat White");//key null deger kabul eder
        hm2.put("güllüoglu", "fistik sarma");
        hm2.put("Nusret", "Golden biftek");
        hm2.put("clarusway", "bolcana offer");
        hm2.put("javaCan", "javaNaz");

        System.out.println("hm = " + hm2);

        hm.putAll(hm2);
        System.out.println(hm);
        System.out.println(hm2);

        //clean code
        HashMap<String,String> hm3 = new HashMap<String,String>(hm2);
        System.out.println("hm3 = " + hm3);
        hm2.remove("köfteci yusuf");
        System.out.println(hm2);
        System.out.println(hm3);

    }
}
