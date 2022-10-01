package Homework.eylul14;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

        // c = (f-32)*5/9
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sicakligi \"Fahrenheit\" olarak giriniz: ");
        double f = scan.nextInt();
        double sonuc = (f-32)*5/9;
        System.out.println("Girmis olldugunuz sicaklik \"Celcius\" cinsinden= " + sonuc + "°'dir");


    }
}
