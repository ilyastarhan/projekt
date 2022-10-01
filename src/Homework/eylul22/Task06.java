package Homework.eylul22;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
		Scanner scan = new Scanner(System.in);
		System.out.println("VIP den öğrenmek istediğiniz harfi giriniz : ");
		char harf = scan.next().toLowerCase().charAt(0);
		switch (harf) {
			case 'v':
				System.out.println("Very");
				break;
			case 'i':
				System.out.println("Important");
				break;
			case 'p':
				System.out.println("Person");
				break;
			default:
				System.out.println("hatalı harf girdiniz");


	}
}}
