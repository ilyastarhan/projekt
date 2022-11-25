package Homework.eylul23;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  Projeler.TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir yazi giriniz: ");
        String input = scan.nextLine();
        System.out.println(input.substring(0, input.length()/2));

    }
}
