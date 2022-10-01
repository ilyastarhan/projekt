package Homework.eylul15;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen carpmak istediginiz 3 ondalikli sayi giriniz: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double sonuc = num1*num2*num3;
        System.out.println("üc sayinin carpimi :" + sonuc);


    }
}
