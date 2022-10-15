package Homework.ekim12.Task;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol {


	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("lütfen birinci kelimeyi giriniz: ");
		String str1 = scan.next().toLowerCase();
		System.out.println("lütfen ikinci kelimeyi giriniz: ");
		String str2 = scan.next().toLowerCase();

		System.out.println(isAnagram(str1, str2));


	}

	private static boolean isAnagram(String str1, String str2) {
		String str3[] = str1.split("");
		Arrays.sort(str3);
		String str4[] = str2.split("");
		Arrays.sort(str4);
		return Arrays.equals(str3, str4);

	}

}
