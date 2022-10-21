package doganPractice;

import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        /*
        Task01
        1.  Create a class called Reverse, write a program that will reverse a string.
        Your program should reverse a string only 5 characters long.
        If word is shorter, display message: "Too short!".
        If word is longer, display message: "Too long!".
        Otherwise, reverse this word and print out result into the console.
         */
        Scanner scan = new Scanner(System.in);
        String reverse = "";
        System.out.println("Lütfen bir kelime giriniz: ");
        String str = scan.next();
        if(str.length()< 5)
            System.out.println("Too short!");

        else if(str.length()>5)
            System.out.println("Too long!");

        else
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            System.out.println(reverse);

            /*
            Task02

            2. Create a class called TipCalculator, write a program for a tip calculator.
            There will be different service quality benchmarks that will determine the tip given.
            There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

	    	Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	        The program should display the following information based on the user input:

        	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

        	Ex:
	    	Split or No split (Yes or No)?
	    	Yes
	    	Enter the number of people
	    	4
	    	Enter the check amount:
	    	476
	    	How was the srvice quality? (Excellent/Great/Good/Fair/Poor)
	    	Excellent

		    output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

        	HINT: you will need to use .equals() method

             */



    }
}
