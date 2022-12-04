package challange.lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class C3_Array_StreamOrnekleri {
    public static void main(String[] args) {

        // Arraylerde Stream kullanabilmek icin 2 yol vardir
            // 1) Stream <Integer> isim=StreamOf(cevrilecek olan) -> Stream objesi
            // 2) Arrays.stream(arr).  ->  Array sinifindan yararlanarak
        //Array ler collection sinifinda degillerdir..set ve MAp ler gibi degildir..
        // kullanabilmek icin donusum yapilmalidir

        Integer arr1 [] ={1,5,-5,6,12,-8,9,3,4};
        //-->S1
        System.out.print("S1 : ");
        Stream<Integer> elemanList = Stream.of(arr1);
        elemanList.forEach(t->System.out.print(t+" "));
        System.out.println("\n \t\t\t***");

        //-->S2
        System.out.print("S2 : ");
        System.out.print(Arrays.stream(arr1).mapToInt(t -> t).sum());
        System.out.println("\n \t\t\t***");

        //-->S3
        System.out.print("S3 : ");
        System.out.print(Arrays.stream(arr1).mapToDouble(t -> t).average());
        System.out.println("\n \t\t\t***");
    }
    //S1: arrayin elemanlarini bir liste yazdiralim


    //S2: Arrayin elemanlarini toplamini bulalim


    // S3: Array in elemanlarinin ortalamasini bulalim yazdir



}
