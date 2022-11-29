package challange.Kasim28.day4;

import java.util.Scanner;

public class Q01_UsingDoWhilePrintNumber {

      /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        do{
            System.out.print(num + " ");
            num+=5;
        }
        while(num<100);
    }
}
