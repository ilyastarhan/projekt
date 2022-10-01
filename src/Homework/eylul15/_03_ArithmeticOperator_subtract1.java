package Homework.eylul15;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen farkini bulmak istediginiz iki sayiyi giriniz: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Girmis oldugunuz sayilarin farki = " + (num1-num2) );


    }
}
