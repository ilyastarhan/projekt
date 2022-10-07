package alistirmalar.Loop;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        factorial();



    }

    private static void factorial() {

        Scanner scan = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter any positive Integer: ");
        int num = scan.nextInt();
        for( int i = 1 ; i <= num ; i++){
            fact *= i;

        }
        System.out.println("Factorial of num " + num + " = " + fact);
        factorial();

    }
}
