package doganPractice;

import java.util.Scanner;

public class Day09 {
    public static void main(String[] args) {
       /*1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1
			output:
				One
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("*****Number to word*****");
        System.out.println("Enter the number");
        switch (scan.nextInt()) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("You have entered a wrong number");
        }
       /*
       2. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator
		char operator -> -, +, *,
		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator
		Ex:
			n1 = 10, n2= 20, mathOperator = '+
		output:
			3
        */
        System.out.println("******Calculator******");
        System.out.println("Please enter two double numbers: ");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Please enter your choice \n-> +\n-> -\n-> *\n-> /");
        double result = 0;
        switch (scan.next().charAt(0)) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:
                System.out.println("You made the wrong choice ");
        }
        System.out.println("result = " + result);
       /*
       3. Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message
		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appe
        */
        System.out.println("*****ChooseLanguage*****");
        System.out.println("Please select the language \n1->English \n2->Spanish\n3->Turkish\n4->Polnish\n5->French");
        int selection = scan.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Hello, thank for your call");
                break;
            case 2:
                System.out.println("Hola, gracias para llamar");
                break;
            case 3:
                System.out.println("Merhaba, aradiginiz icin tesekkurler");
                break;
            case 4:
                System.out.println("Privet, spasibo za vash zvonok");
                break;
            case 5:
                System.out.println("Merci ,pour votre appel");
                break;
            default:
                System.out.println("Error");
                break;
        }
       /*
       4. Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special characte
		Ex:
			ch = '@
		output:
			Special Characte
		HINT: You may wanna check out the numbers of the chracters on ASCII tabl
        */
        System.out.println("*****Character Identity*****");
        System.out.println("Please enter a character to identify");
        char ch = scan.next().charAt(0);
        if ((ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'Z')) {
            System.out.println("It is an alphabetic character");
        } else if (ch > '0' && ch < '9') {
            System.out.println("It is a digit");
        } else System.out.println("It is a special character");
       /*
       5. Create a class called AgeGroups, and write a program that can define the age groups of a perso
	            age groups are:
	                   infant (1 - 2)
	                   Toddler (3 - 5),
	                   Kid (6 - 9),
	                   Pre-Teen (10 - 12),
	                   Teenager (13 - 17),
	                   Young Adult (18 - 20),
	                   Adult (21 - 39),
	                   Young Middle-Aged Adult (40 - 49),
	                   Middle-Aged Adult (50 - 54),
	                   Very Young Senior Citizen (55 - 64),
	                   Young Senior Citizen (65 - 74),
	                   Senior Citizen (75 - 84),
	                   Old Senior Citizen (85+)
       */
        System.out.println("*****Age Groups*****");
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        if (age <= 0) System.out.println("you have entered a wrong number");
        else if (age < 3) System.out.println("infant");
        else if (age < 6) System.out.println("Toddler");
        else if (age < 10) System.out.println("Kid");
        else if (age < 13) System.out.println("Pre-Teen");
        else if (age < 18) System.out.println("Teenager");
        else if (age < 21) System.out.println("Young Adult");
        else if (age < 40) System.out.println("Adult");
        else if (age < 50) System.out.println("Young Middle-Aged Adult");
        else if (age < 55) System.out.println("Middle-Aged Adult");
        else if (age < 65) System.out.println("Very Young Senior Citizen");
        else if (age < 75) System.out.println("Young Senior Citizen");
        else if (age < 85) System.out.println("Senior Citizen");
        else if (age >= 85) System.out.println("Old Senior Citizen");
       /*6. Create a class called EqualNumbers, and write a program that can check the equality of the three given numberrs
				declare 3 numbers n1, n2, n3
				if all are equal ==> print "all equal"
	 			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	  			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	  			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
       */
        System.out.println("*****Equal Numbers*****");
        System.out.println("Please enter 3 numbers you want to compare");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 == num2 && num1 == num3) System.out.println("all equal");
        else if (num1 == num2) System.out.println("n1&n2 are equal");
        else if (num2 == num3) System.out.println("n2&n3 are equal");
        else if (num1 == num3) System.out.println("n1&n3 are equal");
        else System.out.println("none of them are equal");
      /*
       8. Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end
       Data based on grade
       grade - 1
       location -  Apple orchard
       number of groups - 3
       teacher in charge - Ms. Smit
       grade - 2
       location - Zoo
       number of groups - 7
       teacher in charge - Mr. Le
       grade - 3
       location - Aquarium
       number of groups - 5
       teacher in charge - Ms. Wilso
       grade - 4
       location - Movie theater
       number of groups - 2
       teacher in charge - Ms. Reye
       grade - 5
       location - Museum
       number of groups - 5
       teacher in charge - Ms. Lel
       grade - 6
       location - Six Flags
       number of groups - 8
       teacher in charge - Mr. Watt
       */
        System.out.println("*****Field Trip*****");
        System.out.println("Please enter yout grade number");
        switch (scan.nextInt()) {
            case 1:
                System.out.println("location -  Apple orchard\n" +
                        "number of groups - 3\n" +
                        "teacher in charge - Ms. Smith");
                break;
            case 2:
                System.out.println("location - Zoo\n" +
                        "number of groups - 7\n" +
                        "teacher in charge - Mr. Lee");
                break;
            case 3:
                System.out.println("  location - Aquarium\n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Wilson");
                break;
            case 4:
                System.out.println("   location - Movie theater  \n" +
                        "        number of groups - 2\n" +
                        "        teacher in charge - Ms. Reyes");
                break;
            case 5:
                System.out.println("  location - Museum \n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Lela ");
                break;
            case 6:
                System.out.println("location - Six Flags\n" +
                        "number of groups - 8\n" +
                        "teacher in charge - Mr. Watt");
                break;
            default:
                System.out.println("you have entered a wrong number");
                break;
        }
       /*
       1.  Create a class called CampusTime, an integer variable named time is given with a number
       between 1~24 has been initialized, write a program that can find out if the campus is open or not.
       Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open time they should
       see message: “open”  but if the time entered is outside of operating hours they should see:
       “ closed”
        */
        System.out.println("*****Campus Time*****");
        System.out.println("Please enter the time");
        int time = scan.nextInt();
        if (time >= 8 && time <= 23) System.out.println("open");
        else System.out.println("closed");
       /*2. Write a program that can calculate the salary after tax based on the following requirements
               the tax rates are:
                       35% for salary of 130K or more
     			30% for salary of 100K to 130k (excluded)
     			25% for salary of 80K to 100K (excluded)
     			20% for salary less than 80
               in addition, if the person is married, he/she will pay 5% less ta
        */
        double tax;
        System.out.println("Please enter your salary");
        double salary = scan.nextDouble();
        System.out.println("Are you married? \n'Y' or 'N'");
        char married = scan.next().toUpperCase().charAt(0);
        if (salary < 80000)
            tax = salary * 0.20;
        else if (salary < 100000)
            tax = salary * 0.25;
        else if (salary < 130000)
            tax = salary * 0.30;
        else tax = salary * 0.35;
        if (married == 'Y')
            tax *= 0.95;

        System.out.println("tax = " + tax);


        /*
        3. Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
            output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA
         */
        System.out.println("*****Finra*****");
        System.out.println("Please enter the number");
        int number = scan.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FINRA");

        }
        else if (number % 3 == 0 ){
            System.out.println("FIN");
        }
        else if (number % 5 == 0){
            System.out.println("RA");
        }

        /*

        4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
         */
        System.out.println("*****Oxygen Tank*****");
        String result1 = "";
        System.out.println("Please enter the level of your oxygen tank: ");
        int level = scan.nextInt();
        if(level >90 && level <=100)
            result1 = "Your tank is full";
        else if(level >80)
            result1 = "Still okay";
        else if(level >70)
            result1 = "Don't go too far";
        else if(level >60)
            result1 = "Start to head back";
        else if(level >50)
            result1 = "Be careful now you at 50%";
        System.out.println(result1);


    }
}