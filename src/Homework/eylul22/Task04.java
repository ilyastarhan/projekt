package Homework.eylul22;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen 'Ay' adini giriniz: ");
		String ay = scan.nextLine().toLowerCase();
		switch (ay){
			case "ocak":
			case "mart":
			case "mayis":
			case "temmuz":
			case "agustos":
			case "eylül":
			case "kasim":
				System.out.println("Belirttiginiz 'Ay' 31 gündür");
				break;
			case "nisan":
			case "haziran":
			case "ekim":
			case "aralik":
				System.out.println("Belirttiginiz 'Ay' 30 gündür");
				break;
			case "subat":
				System.out.println("Hangi yilin \"Subat Ayi'ni\" ögrenmek istiyorsun?");
				int yil = scan.nextInt();
				if((yil%4==0&&yil%100!=0)||yil%400==0){
					System.out.println("Belirttiginiz yilin Subat Ayi 29 gündür");}
				else{
					System.out.println("Belirttiginiz yilin Subat Ayi 28 gündür");}
				break;
			default:
				System.out.println("Yanlis bir veri girdiniz\nLütfen tekrar deneyiniz...");


		}

	}

}
