package Homework.eylul15;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen 3 basamakli bir tam sayi giriniz: ");
		int sayi = scan.nextInt();
		int yuzler = sayi/100;
		int birler = sayi%10;
		System.out.println("Girmis oldugunuz sayinin ilk ve son rakamlarinin toplami: " + (yuzler+birler));

	//	String sayi = scan.next();
	//	String ilk_rakam = sayi.charAt(0)+"";
	//	String son_rakam = sayi.charAt(2)+"";
	//	int i1 = Integer.valueOf(ilk_rakam);
	//	int s1 = Integer.valueOf(son_rakam);
//
	//	System.out.println(i1);
	//	System.out.println(s1);
	//	System.out.println(i1+s1);

		
	}

}
