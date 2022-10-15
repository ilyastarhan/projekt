package Homework.ekim12.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lütfen " + i + " index ini giriniz");
            arr[arr.length - 1 - i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
