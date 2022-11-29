package j99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C12_stream_iterator {

    //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.
    //rangeClosed(int startInclusive, int endInclusive) cift taraf dahil
    //iterate(seed, repeat action) --> seed'den başlayarak repeat action'a göre  sonsuza kadar elemanları akısa alır.

    public static void main(String[] args) {

        //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.

        int num = 10;
        System.out.println("Task01  = " + sumStructured(num));
        System.out.println("Task01 = " + sumFunctional(num));

        //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.

        System.out.println("Task02 = " + sumEven(num));

//TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.

        System.out.println("Task03 = " + sumEvenx(num));
        System.out.println("Task03-2= " + IntStream.rangeClosed(1, 2 * num).filter(t -> t % 2 == 0).limit(num).sum());

        //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
        System.out.println("Task04= " + sumOddx(num));

        //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
        System.out.print("Task05= ");
        powx(num);
        System.out.println("\n");

        //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
        System.out.println("Task06= " + task06(7, 5));
        System.out.println();
        //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
        System.out.print("task07");
        task07(num);
        System.out.println();
        //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    }
        public static void task07(int num){
            System.out.println(IntStream.iterate(num, t -> t - 1).reduce(1, (t, u) -> t * u));
        }
    public static OptionalInt task06(int a, int num){
        return IntStream.iterate(a, t->t*a).skip(num-1).findFirst();
    }

    public static void powx(int num) {
        IntStream.iterate(2, t -> t * 2).limit(num).forEach(t-> System.out.print(t+ " "));

    }

    public static int sumOddx(int num) {
        return IntStream.iterate(1, t -> t + 2).limit(num).sum();
    }

    public static int sumEvenx(int num) {

        return IntStream.iterate(2, t -> t + 2).limit(num).sum();
    }

    public static int sumEven(int num) {
        return IntStream.range(1, num + 1).filter(t -> t % 2 == 0).sum();
    }

    public static int sumStructured(int a) {

        int toplam = 0;
        for (int i = 0; i <= a; i++) {
            toplam += i;
        }
        return toplam;
    }

    public static int sumFunctional(int a) {

        return IntStream.//manual akis tanimlama
                range(1, a + 1).//1 dahil a+1 haric ->1,2,3,...x sayilarindan aralik ranimlandi
                sum();//akisa giren sayilar toplandi

    }


}
