package j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {
        //Task girilen 3 notun ortalamasini hesaplayan method

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sinav norlariniz giriniz: ");
        double not1 = scan.nextDouble();
        double not2 = scan.nextDouble();
        double not3 = scan.nextDouble();
        System.out.println(ortalama(not1, not2, not3));

    }

    public static double ortalama(double a, double b, double c) {
        return (a+b+c)/3;


    }
}
