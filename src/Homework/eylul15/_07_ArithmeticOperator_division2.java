package Homework.eylul15;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bölme islemi yapmak istediginiz iki sayiyi giriniz: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sonuc = num1/num2;

        System.out.println("Girmis oldugunuz sayilarin bölümü = " + sonuc );



    }
}
