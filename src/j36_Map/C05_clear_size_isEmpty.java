package j36_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        //map.size()-> girilen map in entry(giris) ya da eleman sayisini return eder
       //map.clear()-> girilen map in tüm entry(giris:eleman) siler
       //map.isEmpty()-> girilen map in entry(giris:eleman) varligini kontrol eder boolean return eder
        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");
        System.out.println("hm = " + hm);
        System.out.println("hm.size() = " + hm.size());
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        hm.clear();
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        System.out.println("hm.size() = " + hm.size());
    }
}
