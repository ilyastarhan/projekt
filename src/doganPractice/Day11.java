package doganPractice;

import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        /*
        1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

         */

        System.out.println("***** Cappuccino Buyer *****");
        Scanner scan = new Scanner(System.in);
        String priceAndSize;
        System.out.println("Enter the size: ");
        String size = scan.next().toLowerCase();
        if (size.equals("tall")) priceAndSize = "price is $3,69\n90 calories";
        else if (size.equals("grande")) priceAndSize = "price is $3.99\n120 calories";
        else if (size.equals("venti")) priceAndSize = "price is $4,29\n150 calories";
        else priceAndSize = "Invalid Size";
        System.out.println(priceAndSize);

        switch (size) {
            case "tall":
                priceAndSize = "price is $3,69\n90 calories";
                break;
            case "grande":
                priceAndSize = "price is $3.99\n120 calories";
                break;
            case "venti":
                priceAndSize = "price is $4,29\n150 calories";
                break;
            default:
                priceAndSize = "Invalid Size";
                break;
        }
        System.out.println(priceAndSize);

    }



}
