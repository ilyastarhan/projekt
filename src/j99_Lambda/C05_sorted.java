package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_sorted {
    //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
//Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.

    //reverseOrder() => Comparator Class'ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan
// bir Comparator (karşılaştırıcı) return eder.
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));

        list.
                stream().//liste akisa alindi
                filter(t -> t % 2 == 0).//filtreleme yapildi
                map(t -> (int)Math.pow(t, 2)).//method uygulandi
                sorted().//siralama yapildi
                forEach(t->System.out.print(t + " "));//yazdirildi
        System.out.println();

        System.out.println("*****");

        // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.

        list.stream().filter(t-> t%2==1).map(t-> (int)Math.pow(t, 2)).sorted((Comparator.reverseOrder())).forEach(t-> System.out.print(t+ " "));

    }
}
