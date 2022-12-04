package challange.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");

        //-->S1
        System.out.print("S1 : ");
        List<String> ilkHarfi_d_veya_c_Olanlar = list.stream().filter(t -> t.charAt(0) == 'd' || t.charAt(0) == 'c').collect(Collectors.toList());
        ilkHarfi_d_veya_c_Olanlar.forEach(t -> System.out.print(t + " "));
        System.out.println("\n \t\t\t***");

        //-->S2
        System.out.print("S2 : ");
        list.stream().forEach(t -> System.out.print("*" + t + "*" + " "));
        System.out.println("\n \t\t\t***");

        //-->S3
        System.out.print("S3 : ");
        List<String> alfabetikSiralama = list.stream().sorted().collect(Collectors.toList());
        alfabetikSiralama.forEach(t -> System.out.print(t + " "));
        System.out.println("\n \t\t\t***");

        //-->S4
        System.out.print("S4 : ");
        //list.stream().map(t-> t.replace((""+'l'), "")).forEach(t-> System.out.print(t + " "));
        System.out.println("\n \t\t\t***");
        //-->S5
        System.out.print("S5 : ");
        List<String> icinde_a_HarfiOlanlar = list.stream().filter(t -> t.contains("a")).collect(Collectors.toList());
        icinde_a_HarfiOlanlar.forEach(t -> System.out.print(t + " "));
        System.out.println("\n \t\t\t***");

        //-->S6
        System.out.print("S6 : ");
        list.stream().map(t -> "" + t.charAt(0) + t.charAt(0) + t).forEach(t -> System.out.print(t + " "));
        System.out.println("\n \t\t\t***");

        //-->S7
        System.out.print("S7 : ");
        list.stream().map(String::toLowerCase).forEach(t -> System.out.print(t.toUpperCase().charAt(0) + "" + t.substring(1) + " "));
        System.out.println("\n \t\t\t***");

        //-->S8
        System.out.print("S8 : ");
        List<String> uzunluguDortveAltiOlanlarHaric = list.stream().filter(t -> t.length() != 4 && t.length() != 6).collect(Collectors.toList());
        uzunluguDortveAltiOlanlarHaric.forEach(t -> System.out.print(t + " "));
    }
    // S1: ilk harfi d ve ya c olanlari listeleyelim


    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim


    //S3: alfabetik  olarak siralayalim list olarak


    //S4: tum 'l' leri silelim yazdiralim


    //S5 : icinde e olanlardan yeni bir list olusturunuz


    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi


    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz


    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz


}
