package Homework.ekim8;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki tamsayi giriniz: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
            for (int i = (num2<num1)?num2:num1 + 1; i < ((num2<num1)?num1:num2); i++) {
                System.out.print(i + " ");
            }
        System.out.println();

        for (int i = Math.min(num1, num2) + 1; i < (Math.max(num2, num1)); i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        if (num1 < num2) {
            while (num1 < num2-1) {
                System.out.print((num1 + 1) + " ");
                num1++;
            }
        } else {
            while (num2 < num1-1) {
                System.out.print((num2 + 1) + " ");
                num2++;
            }
        }
    }
}
