package challange.Kasim28.day4;

import java.util.Scanner;

public class Q12_ExponentialNumber {

    //Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int base = scan.nextInt();
        System.out.print("Enter a number: ");
        int top = scan.nextInt();
        int result = 1;
        while(top>0){
            result*=base;
            top--;
        }
        System.out.println(result);

    }
}
