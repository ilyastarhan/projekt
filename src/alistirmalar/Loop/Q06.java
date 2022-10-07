package alistirmalar.Loop;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        System.out.print("Enter the number ");
        int number = console.nextInt();
        int result = 0;


        for (int i = 0; number > i; i++) {

            result = number % 10;
            number /= 10;

            System.out.print(result);
        }
        System.out.print(number);
    }
}