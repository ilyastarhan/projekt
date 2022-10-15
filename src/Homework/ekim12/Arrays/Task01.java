package Homework.ekim12.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> kullanıcdan alınan değerlerle bir int array elemanlarını bukukten kucuge   print eden code create ediniz.

        Scanner sc = new Scanner(System.in);

        System.out.print("agam kaç elemanlı array istirsen : ");
        int arrBoyut = sc.nextInt();

        int arr[] = new int[arrBoyut];//boyutu belirlenmiş boş int array

        for (int i = 0; i < arrBoyut; i++) {
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("agam istedgin array : " + Arrays.toString(arr));



        Arrays.sort(arr);//arr k->b sortingen yapıldı..
        for (int i = arr.length-1 /*-> en buyuk sondaki elemandan döngü başlar*/ ;i>=0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
