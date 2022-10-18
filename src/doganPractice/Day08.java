package doganPractice;

import java.util.Scanner;

public class Day08 {
    public static void main(String[] args) {


        //Tasks
        //1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        byte age = scan.nextByte();
        if (age >=18)
            System.out.println("You are eligible to buy Cigarettes");
        else
            System.out.println("You are not eligible to buy Cigarettes");


        /*2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
        */
        System.out.println("Please enter a number(byte) grade level:");
        byte grade = scan.nextByte();
        if(grade <1 || grade >18 ) System.out.println("YOu have entered a mistake number.sout");
        else if(grade <6) System.out.println("Elementary school");
        else if(grade <9) System.out.println("Middle school");
        else if(grade <13) System.out.println("High school");
        else if(grade <17) System.out.println("College");
        else if(grade <19) System.out.println("Grad school");

        /*3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number
		*/
        System.out.println("Enter the first nummer: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second nummer: ");
        int num2 = scan.nextInt();
        if(num1> num2) System.out.println(num1 + " is maximum number");
        else if(num1<num2) System.out.println(num2 + " is maximum number");
        else System.out.println("Both are equal");
    }
}