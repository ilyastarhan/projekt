package Homework.eylul15;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mod almak istediginiz sayiyi ve modunu giriniz: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("kalan = " + num1%num2);



    }
}
