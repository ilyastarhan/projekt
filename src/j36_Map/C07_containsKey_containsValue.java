package j36_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<String, String>();
        //map.containsKey()-> girilen key degerini mapta varligini kontrol eder
        //masp.containsValue()-> girilen value degerini mapte varligini kontrol eder
        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));
        System.out.println("hm.containsKey(\"lidl\") = " + hm.containsKey("lidl"));
        System.out.println("hm.containsValue(\"300 Euro\") = " + hm.containsValue("300 Euro"));
        System.out.println("hm.containsValue(\"213 Euro\") = " + hm.containsValue("213 Euro"));

    }
}
