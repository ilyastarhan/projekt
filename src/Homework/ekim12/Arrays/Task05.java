package Homework.ekim12.Arrays;

import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz: ");
        int num = scan.nextInt();
        String str = "" + num;
        String yeniarr[] = str.split("");
        for (int i = yeniarr.length - 1; i >= 0; i--) {
            System.out.print(yeniarr[i]);
        }


    }

}
