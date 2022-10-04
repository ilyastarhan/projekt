package challange.Day06;

import java.util.Scanner;

public class Q01_MethodCreation {

    public static void main(String[] args) {

        /* Write a method named isEven that accepts an integer argument.
 The method should return true if the argument is even, or false otherwise.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int num = scan.nextInt();
        System.out.println(isEven(num));
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
        //return a % 2 == 0 ? true : false;


    }


}
