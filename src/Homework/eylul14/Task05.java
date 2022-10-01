package Homework.eylul14;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {


// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen islemini yapmak istediginiz \"iki tam sayi\" giriniz: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Girmis oldugunuz iki sayinin toplami: " + (a+b) + "\nfarki: " + (a-b) + "\ncarpimi: " + (a*b) + "\nbirbirine bölümü: " + (a/b) + "dir");


		
		

		


	}

}
