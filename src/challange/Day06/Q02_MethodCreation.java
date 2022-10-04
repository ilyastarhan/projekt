package challange.Day06;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {
        /*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
  */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayiyi giriniz: ");
        double cm = scan.nextDouble();
        System.out.println(meter(cm));
        System.out.println(km(cm));


    }

    private static double meter(double cm) {
        return cm/100;
    }

    private static double km(double cm) {
        return cm/100000;
    }
}
