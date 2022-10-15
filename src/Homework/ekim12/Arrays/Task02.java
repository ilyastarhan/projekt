package Homework.ekim12.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {



        int[] a = {1, 2, 3, 4};
        for (int i = 0; i < a.length - 1; i++) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        System.out.println(Arrays.toString(a));
        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner sc = new Scanner(System.in);

        System.out.print("agam kaç elemanlı array istirsen : ");
        //int arrBoyut = sc.nextInt();

        int arr[] = new int[sc.nextInt()];//boyutu belirlenmiş boş int array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("agam istedgin array : " + Arrays.toString(arr));
        int arrToplam = 0;//local var.


        for (int i = 0; i < arr.length; i++) {
            arrToplam += arr[i];
        }
        System.out.println("array eleman toplamları : "+arrToplam);


    }
}
