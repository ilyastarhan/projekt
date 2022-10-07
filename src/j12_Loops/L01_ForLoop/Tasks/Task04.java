package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task04 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayi giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);


                }


            }
    }
}
