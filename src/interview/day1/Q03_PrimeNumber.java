package interview.day1;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num = scan.nextInt();
      //  int count = 0;
        boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                   // count++;
                }
            }
        if(flag /*count == 0 */&& !(num <2)){
            System.out.println("The number you have entered is a prime number.");
        }
        else System.out.println("The number you have entered isn't a prime number.");
    }
}
