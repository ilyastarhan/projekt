package Homework.ekim06;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */

		rakamsay();


	}

	private static void rakamsay() {
		int sayac = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir String giriniz: ");
		String str = scan.nextLine();
		/*str = str.replaceAll("\\D", "");
		System.out.println(str.length());*/
		for(int i= 0; i < str.length(); i++){
			if(str.charAt(i) >=48 && 57>=str.charAt(i)){
                sayac++;
            }
		}
		System.out.println("Girdiginiz metinde toplam " + sayac + " rakam vardir");


	}
}
