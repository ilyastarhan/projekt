package Homework.eylul14;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        int mid_term_grade, final_grade, projekt_grade;
        double general_grade;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mid-term grade: ");
        mid_term_grade = scan.nextInt();
        System.out.println("Enter final grade: ");
        final_grade = scan.nextInt();
        System.out.println("Enter project grade: ");
        projekt_grade = scan.nextInt();

        general_grade = (mid_term_grade*0.30) + (final_grade*0.50) + (projekt_grade*0.20);
        System.out.println("Your grade is : " + general_grade);


    }
}
