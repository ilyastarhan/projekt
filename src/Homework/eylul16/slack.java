package Homework.eylul16;

import java.util.Scanner;

public class slack {
    public static void main(String[] args) {
        //Task 14->
        int i1 = 13, i2 = 10;
        System.out.println(i1>i2); //true

        //Task 15->
        int i3 = 17, i4 = 20;
        System.out.println(i3<i4); //true

        //Task 16->
        int i5 = 13, i6 = 13;
        System.out.println(i5<=i6); //true

        //Task 17->
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num1==num2); //

        //Task 18->
        System.out.println("lütfen iki sayi giriniz: ");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        System.out.println(d1==d2); //

        //Task 19->
        String s1 = "Apple", s2 = "Apple";
        System.out.println(s1==s2); //true

        //Task 20->
        float f1 = 14f, f2 = 17f;
        System.out.println(f1 >= f2 || f1 > f2 || !(f1 > f2)); // true

        //Task 21->
        double d3 = 14.23, d4 = 19.52;
        System.out.println(d3!=d4); // true

        //Task 22->
        String s3 = "Techno Study", s4 = "Techno Study";
        System.out.println(s3!=s4); // false

        //Task 23->
        double d5 = 14.23, d6 = 14.23;
        System.out.println(d5<d6); // false

        //Task 24->
        int i7 = 120, i8 = 158;
        System.out.println(i7>i8); // false


    }
}
