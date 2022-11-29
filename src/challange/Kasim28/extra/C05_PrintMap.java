package challange.Kasim28.extra;

import java.util.HashMap;
import java.util.Map;

public class C05_PrintMap {

    /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "Bir");
        map.put(2, "Iki");
        map.put(3, "Uc");
        map.put(4, "Dort");
        map.put(5, "Bes");
        map.put(6, "Alti");
        for(Map.Entry<Integer, String> each : map.entrySet()){
            System.out.println(each.getKey() + " " + each.getValue());
        }
    }
}
