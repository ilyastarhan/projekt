package alistirmalar.Loop;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 1;
        System.out.println("Enter two Integer values: ");
        int base = scan.nextInt();
        int power = scan.nextInt();
        for(int i = 1; i<=power; i++){
            result *= base;
        }
        System.out.println(result);


    }
}
