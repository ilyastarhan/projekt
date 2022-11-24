package j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {

    /*
    TreeMap->
    1- TreeMap key 'lerde null deger tanimlanamaz, fakat value larda null deger tanimlanabilir.
    2- TreeMap elemanlarini key naturel order a göre tanimlar
    3- TreeMap thread safe ve synchronized degildir.
    4- TreeMap en yavas Map türüdür Kullanirken cok dikkat edilmelidir.

     */
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(101, "Ugur");
        tm.put(102, "Enise");
        tm.put(103, "Kevser");
        tm.put(104, "Emine");
        tm.put(105, "Fatih");

        System.out.println("tm = " + tm);
       // tm.put(null, "Fatih");//key null deger kabul etmez
        tm.put(105, null);
        tm.put(106, null);
        System.out.println(tm);

        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", null);
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "500 Euro");
        hm.put("MediaMarkt", "183 Euro");
        TreeMap<String, String> tm2 = new TreeMap<String, String>(hm);
        System.out.println("tm2 = " + tm2);
        System.out.println(tm.ceilingKey(104));//104 // method parametre olarak key degerini  mapte varsa return eder
        //yoksa paramtreden büyük en kücük degerini return eder
        //parametre map de yok ve parametreden büyük en kücük key de yoksa null return eder

        System.out.println(tm.ceilingKey(108));//null
        System.out.println(tm.ceilingKey(100));//101
        System.out.println("tm.floorKey(110) = " + tm.floorKey(110)); //girilen deger en büyük key den daha yukarda ise en büyük degeri return eder
        System.out.println("tm.floorKey(100) = " + tm.floorKey(100)); //girilen deger en büyük key den daha yukarda ise en büyük degeri return eder
        System.out.println("tm2 = " + tm2);
        System.out.println("tm2.ceilingKey(\"adana\") = " + tm2.ceilingKey("Adana"));
        System.out.println("tm2.ceilingKey(\"Zed\") = " + tm2.ceilingKey("Zed"));


        //descending order-> artan sira ile keyleri siralar
        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());//[106, 105, 104, 103, 102, 101]
        System.out.println("tm.keySet() = " + tm.keySet());//[101, 102, 103, 104, 105, 106]
        System.out.println("tm.firstKey() = " + tm.firstKey());//101
        System.out.println("tm.lastKey() = " + tm.lastKey());//106
        System.out.println("tm.pollFirstEntry() = " + tm.pollFirstEntry());

    }
}
