package j36_Map;

import java.util.HashMap;

public class C08_replace {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        //map.replace()-> girilen value degeri istenen key e update yapar
        //oldvalue return eder
        //olmayan key icin null return eder
        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm.replace(\"Amazon\", \"356\") = " + hm.replace("Amazon", "356 Euro"));
        System.out.println("hm = " + hm);
        System.out.println("hm.replace(\"lidl\", \"haluk\") = " + hm.replace("lidl", "haluk"));
        System.out.println("hm = " + hm);

    }
}
