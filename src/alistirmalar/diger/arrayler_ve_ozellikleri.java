package alistirmalar.diger;

import java.util.Scanner;

public class arrayler_ve_ozellikleri {
    public static void mean(int[] arr){
        int total = 0;
        for(int i = 0; i<arr.length; i++)
        {total+=arr[i];
    }
        System.out.println("Ortalama: " + ((double)total / arr.length));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] arr = new int[6];
        System.out.println("Arrayin degerlerini girin...");
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Degerler yaziliyor");
        for (int i=0; i<arr.length;i++){
            System.out.println("Eleman " + i +" = " + arr[i]);
        }
        mean(arr);



    }
}
