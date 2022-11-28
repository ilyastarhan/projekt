package j99_Lambda;

import java.util.*;
import java.util.stream.Stream;

public class C08_Limit {
//limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.

    public static void main(String[] args) {
        List<String> menu = new ArrayList<String>(Arrays.asList("küsleme", "küsleme", "küsleme", "soganli", "soganli", "trilice", "bicibici", "büryan", "melemen", "cacix", "kokorec", "yaglama", "güvec", "arabasi", "tantuni"));
// Task : Karakter sayisi en buyuk elemani yazdiriniz
        enUzunKarakterliString(menu);

        System.out.println("\n***************************");
    }

    public static void enUzunKarakterliString(List<String> menu) {


        Stream<String> enBuyukKarakter = menu.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1);
        System.out.println(Arrays.toString(enBuyukKarakter.toArray()));
    }
}
