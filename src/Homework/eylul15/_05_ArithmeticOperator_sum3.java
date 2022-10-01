package Homework.eylul15;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen toplamak istediginiz üc sayiyi giriniz: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println("Girmis oldugunuz sayilarin toplami = " + (num1+num2+num3) );


    }
}
