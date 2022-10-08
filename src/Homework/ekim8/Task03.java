package Homework.ekim8;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 1;
		while(i<11){

			System.out.print(num + "*" + i + " = " + (num*i) + " ");
			i++;
		}
				

	}

}
