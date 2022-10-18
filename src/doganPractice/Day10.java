package doganPractice;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {

        /*1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT*/

        Scanner scan = new Scanner(System.in);
        System.out.println("*****Grade Level*****");
        String result;
        System.out.println("Enter the grade level");
        byte gradeLevel = scan.nextByte();
        if (gradeLevel > 0 && gradeLevel < 19) {
            if (gradeLevel < 6) result = "Elemantary School";
            else if (gradeLevel < 9) result = "Middle School";
            else if (gradeLevel < 13) result = "High School";
            else if (gradeLevel < 17) result = "College";
            else result = "Grad School";
        } else result = "Invalid grade level given";
        System.out.println("result = " + result);

        /*
        2. Create a class called CrewAndPassangers, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

         */

        System.out.println("*****Crew And Passangers*****");

        String result1;
        System.out.println("Enter the number of people on the ship");
        int total = scan.nextInt();
        if (total == 50 || total == 75 || total == 100) {
            if (total == 50)
                result1 = "20 crew, 30 passengers";
            else if (total == 75)
                result1 = "25 crew, 50 passengers";
            else
                result1 = "30 crew, 70 passengers";
        } else result1 = "number of people on the ship is not valid ";
        System.out.println(result1);

        /*
        3. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
            */

        System.out.println("*****Grade*****");
        String result2;
        System.out.println("Enter grade degree: ");
        char grade = scan.next().charAt(0);
        if (grade == 'A') result2 = "excellent";
        else if (grade == 'B') result2 = "great job";
        else if (grade == 'C') result2 = "good";
        else if (grade == 'D') result2 = "passed";
        else if (grade == 'F') result2 = "failed";
        else result2 = "Invalid";
        System.out.println(result2);

        /*

        4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
             */
        System.out.println("***** Age Groups *****");
        String result3;
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        if (age <= 150 && age >= 0) {
            if (age < 21) result3 = "Teenager";
            else if (age < 55) result3 = "Adult";
            else result3 = "Senior";
        } else result3 = "Invalid age";
        System.out.println(result3);

        /*5. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY

         */

        System.out.println("***** Bigger Number *****");
        System.out.println("Enter 3 number: ");
        String result4;
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        result4 = (n1 > n2 && n1 > n3) ? "n1 is bigger" : ((n2 > n3) ? "n2 is bigger" : "n3 is bigger");
        System.out.println(result4);

        /*

        6. Create a class called Loans, Given two variables salary and credit score, use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
         */

        System.out.println("***** Loans *****");
        System.out.println("Enter the salary and credit score for the loan: ");
        double salary = scan.nextDouble();
        double creditScore = scan.nextDouble();
        String result5;
        result5 = (salary > 60000 && creditScore > 650) ? "Loan Approved" : "Loan Denied";
        System.out.println(result5);

        /*
        7.  HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
        Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.
         */

        System.out.println("HTTP Protocol codes");
        System.out.println("Enter the protocol code: ");
        int statusCode = scan.nextInt();
        String result6;
        result6 = statusCode == 200 ? "OK"
                : (statusCode == 201 ? "Created"
                : (statusCode == 202 ? "Accepted"
                : (statusCode == 301 ? "Moved Permanently"
                : (statusCode == 303 ? "See Other"
                : (statusCode == 304 ? "Not Modified"
                : (statusCode == 307 ? "Temporary Redirect"
                : (statusCode == 400 ? "Bad Request"
                : (statusCode == 401 ? "Unauthorized"
                : (statusCode == 403 ? "Forbidden"
                : (statusCode == 404 ? "Not Found"
                : (statusCode == 410 ? "Gone"
                : (statusCode == 500 ? "Internal Server Error"
                : "Service Unavailable"))))))))))
        ));
        System.out.println(result6);
    }
}
