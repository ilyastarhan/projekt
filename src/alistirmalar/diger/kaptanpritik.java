package alistirmalar.diger;

import java.util.Random;
import java.util.Scanner;

public class kaptanpritik {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int S = 12314;
        System.out.println("Please enter the array length :");
        int arrayLength = scan.nextInt();
        int[] arr = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }
        for(int value : arr){
            if(value <10000 && value >-10000){
                System.out.println(value);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == S) {
                    System.out.println("sum of " + arr[i] + " and " + arr[j] + " is your number ->>" + S);
                }

            }
        }

    }
}


