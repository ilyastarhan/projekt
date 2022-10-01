package Homework.eylul15;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen carpmak istediginiz 4 ondalikli sayi giriniz: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double sonuc = num1*num2*num3*num4;
        System.out.println("üc sayinin carpimi :" + sonuc);


    }
}
