package challange.Kasim28.extra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q06_TreeMapFrekans {

    // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("cumle giriniz :");
        String cumle = scan.nextLine().toLowerCase();

        frekans(cumle); //1.yol

        Map<String, Integer> map = frekans2(cumle); //2.yol array sinifindan faydalanarak
    }
    private static Map<String, Integer> frekans2(String cumle) {
        String[] harfler = cumle.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String each: harfler
        ) {
            if(!map.containsKey(each)){ //daha onceden map icinde bu harf yoksa
                map.put(each,1); //sayisi 1 olsun
            }else map.put(each,map.get(each)+1); ////daha onceden map icinde bu harf varsa sayisini 1 arttir
        }
        return map;
    }

    private static void frekans(String cumle) {
        TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
        for(int i = 0; i <cumle.length(); i++) {
            char c = cumle.charAt(i);
            if(tm.containsKey(c+"")) {
                tm.replace(c+"",tm.get(c+"")+1);
            }
            else
                tm.put(c+"", 1);
        }
        System.out.println(tm);
    }
}
