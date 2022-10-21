package doganPractice;

import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        /*  Task 01 - >>
      Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people live with your home? ");
        int houseMate = scan.nextInt();
        if (houseMate < 3) System.out.println("Live with less then 3 people");
        else if (houseMate < 6) System.out.println("Live with 3-6 people");
        else System.out.println("Live with more than 6 people");

        /* Task 02 ->>

            Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
            Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
         */
        int speedLimit = 70;
        System.out.println("Enter your current speed");
        int currentSpeed = scan.nextInt();
        if (currentSpeed > speedLimit)
            System.out.println("You are driving " + (currentSpeed - speedLimit) + " over the limit. Slow down.");
        
        /*
        Task 03 ->>>
        Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
        */
        System.out.println("Enter quantity of cents");
        int cents = scan.nextInt();
        int dollars = 0;
        if (cents > 99) {
            dollars = cents / 100;
            cents = cents % 100;
            System.out.println(dollars + " dollars" + " and " + cents + " cents");
        }else System.out.println(cents + " cents");

        /*
        Task 04 ->>
        Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

         */
        System.out.println("Enter miles you want to convert to KM");
        int miles = scan.nextInt();
        double km = miles*1.609;
        System.out.println(miles + " miles equals to " + km + " kilometers");

        /* Task 05->>>
        PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
         */
        System.out.println();

        System.out.println("Enter the product name: ");
        System.out.println();
        String productName = scan.nextLine();
        System.out.println("Enter the price: ");
        double price = scan.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = scan.nextInt();
        System.out.println("Enter your name: ");
        String firstName = scan.next();
        System.out.println(firstName + ", your order for " + quantity + productName + " has been places. Your total is " + (quantity * price));
        /* Task 06 ->>
        StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
         */
        System.out.println("how many total shares have you got already?");
        int stock = scan.nextInt();
        if(stock >0){
            System.out.println("how much their total value in the stock market");
            double totalValue = scan.nextDouble();
            System.out.println("enter the name of the company you have the most shares");
            String companyName = scan.nextLine();
            System.out.println("Your total stock market holding is " + totalValue + " which is made up of " + stock + " shares." + companyName + " is your company holdings");
        }

    }
}
