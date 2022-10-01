package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {
        /*byte < short < int < long < float < double
        auto widening ile casting -> Kucuk data typlerini

         */
    //   boolean basarili = true;
    //   boolean basari = basarili;
    //   byte a = 17;
    //   int b = a;
    //   System.out.println("b = " + b);

    //   int num = 1453;
    //   double d1 = num;
    //   System.out.println("d1 = " + d1);

    //   int num3 = 150;
    //   byte b1 = (byte) num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz: ");
        char c1 = scan.nextLine().charAt(0);
        int sonuc = c1;
        System.out.println(c1+ "ascii degeri: " + sonuc);


    }
}
