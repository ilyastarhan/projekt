package challange.Day09;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi gir : ");
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++) {

            for(int j = num; j > i; j--) {

                System.out.print(" ");

            }
            for(int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();


        }


    }
}
