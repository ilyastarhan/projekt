package challange.Kasim28.day4;

import java.util.Scanner;

public class Q05_UsingDoWhileWithCondition {
    /*
           Ask user to enter an integer.
           If the integer is less than 100, tell user "Won!"
           Otherwise tell user "Lost!"
       */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter an integer: ");
            num = scan.nextInt();
            if (num < 100)
                System.out.println("Won!");

        }
        while (num<100);

        System.out.println("Lost!");
    }
}