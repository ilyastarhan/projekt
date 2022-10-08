package Homework.ekim8;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen isim giriniz: ");
		String isim = scan.nextLine();
		System.out.println("lütfen soyisim giriniz: ");
		String soyisim = scan.nextLine();

		String str = isim.concat(soyisim).replaceAll(" ", "");
		int i = 0;
		while (str.length() > i) {
			System.out.print(str.charAt(i) + " ");
			i++;
		}
		
			

	}

}
