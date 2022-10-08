package Homework.ekim8;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

		Scanner scan = new Scanner(System.in);

		int harf =0;
		int rakam = 0;
		int karakter = 0;
		int i = 0;
		String str = scan.nextLine();

		do{
			if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')){
				harf++;
			}
			else if(str.charAt(i)>='1' && str.charAt(i) <='9'){
				rakam++;
			}
			else karakter++;
			i++;
		}
		while(i<str.length());
			System.out.println("Girdiginiz metinde toplam harf sayisi : " + harf);
            System.out.println("Girdiginiz metinde toplam rakam sayisi : " + rakam);
            System.out.println("Girdiginiz metinde toplam özel karakter sayisi : " + karakter);




	}}
