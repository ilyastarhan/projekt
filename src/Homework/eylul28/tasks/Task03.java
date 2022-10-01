package Homework.eylul28.tasks;

import java.util.Scanner;

public class Task03 {



	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen saati giriniz: ");
		int saat = scan.nextInt();
		System.out.println("Lütfen mil'i giriniz: ");
		double km = scan.nextDouble();
		System.out.println("Lütfen Kilogrami giriniz: ");
		int kg = scan.nextInt();
		cevirici(saat, km, kg);

	}
	private static void cevirici(int a, double b, int c) {
		int a1 = a*3600;
		double b1 = b*1.609344;
		int c1 = c*1000;
		System.out.println(a + " saat " + a1 + " sayiyedir");
		System.out.println(b + " mil " + b1 + " kilometredir");
		System.out.println(c + " kg " + c1 + " gramdir");
	}


}
