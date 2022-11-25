package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {

    public static void main(String[] args) {
        //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

        List<String> menu = new ArrayList<String>(Arrays.asList("küsleme","küsleme","küsleme", "soganli","soganli", "trilice", "bicibici","büryan","melemen", "cacix","kokorec", "yaglama", "güvec", "arabasi","tantuni"));


        // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
        menu.stream().map(String::toUpperCase).sorted().distinct().forEach(t-> System.out.print(t + " "));
        System.out.println();

        menu.stream().map(String::toUpperCase).sorted(Comparator.reverseOrder()).distinct().forEach(t-> System.out.print(t + " "));
        System.out.println();
        // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
        System.out.println("Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..");
        menu.stream().map(String::length).distinct().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t + " "));

        System.out.println("// Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..\n");
// Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..

        menu.stream().sorted(Comparator.comparing(String::length)).distinct().forEach(t-> System.out.print(t + " "));

        System.out.println();
        System.out.println("Task : list elemanlarinin son harfine gore ters sirali print ediniz.");
        // Task : list elemanlarinin son harfine gore ters sirali print ediniz.

        menu.stream().
                sorted(Comparator.
                        comparing(t->t.toString().
                                charAt(t.toString().length()-1)).
                        reversed()).distinct().
                forEach(t->System.out.print(t + " "));

        // Task : listin elemanlarin karakterler sayilarinin cift sayili olanlarinin karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
        System.out.println();
        System.out.println("// Task : listin elemanlarin karakter sayilarinin cift sayili olanlarinin karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...");
            menu.stream().  //akisa al
                    map(String::length).//karakter sayilarini al
                    filter(t-> t%2==0). //karakter sayilarindan cift olanlari al
                    map(t-> t*t).  // karelerini al
                    sorted().//sirala
                    distinct().//tekrarsiz olanlari al
                    forEach(t->System.out.print(t+ " "));//yazdir
    }

    public static void alfabetikBuyuktenKucugeTekrarsizSira(List<String> menu){



    }
}
