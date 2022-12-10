package challange.lambda;

import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {
    //iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belirliyoruz
    public static void main(String[] args) {

        // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
        //range(int startInclusive, int endExclusive)
        System.out.print("S1 : ");
        IntStream.range(1,30).forEach(t-> System.out.print(t+  " "));
        System.out.println("\n \t\t\t***");

        //-->S2 1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
        //rangeClosed(int startInclusive, int endInclusive)
        System.out.print("S2 : ");
        IntStream.rangeClosed(1,30).forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //-->S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim
        int num1 = 15;
        int num2 = 35;
        System.out.print("S3 : ");
        System.out.println(IntStream.rangeClosed(num1, num2).sum());

        System.out.println("\n \t\t\t***");

        //-->S4 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim
        System.out.print("S4 : ");
        System.out.println(IntStream.rangeClosed(30, 40).average());
        System.out.println("\n \t\t\t***");

        //-->S5 325 ile 468 arasinda 8 e bolunen kac sayi vardir?
        System.out.print("S5 : ");
        System.out.println(IntStream.rangeClosed(325, 468).filter(t -> t % 8 == 0).count());
        System.out.println("\n \t\t\t***");

        //-->S6 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim
        System.out.print("S6 : ");
        System.out.println("\n \t\t\t***");

        //-->S7 325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim
        System.out.print("S7 : ");
        System.out.println("\n \t\t\t***");

        //-->S8 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim
        System.out.print("S8 : ");
        System.out.println("\n \t\t\t***");

        //-->S9 pozitif tek sayilarin ilk 10 elemanin yazdiralim
        System.out.print("S9 : ");
        System.out.println("\n \t\t\t***");

        //-->S10 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim
        System.out.print("S10 : ");
        IntStream.iterate(21,t->t+7).filter(t-> t%2==1).limit(10).forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //-->S11 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim
        System.out.print("S11 : ");
        System.out.print(IntStream.iterate(21, t -> t + 7).limit(20).sum());
        System.out.println("\n \t\t\t***");

    }

}
