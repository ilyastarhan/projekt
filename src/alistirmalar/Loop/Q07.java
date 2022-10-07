package alistirmalar.Loop;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive Integer: ");
        int num = scan.nextInt();
        int sayac = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sayac++;
            }}
            if (sayac == 0) {
                System.out.println("The number is a prime number.");

            } else {
                System.out.println("The number is not a prime number.");

            }


        }
    }
