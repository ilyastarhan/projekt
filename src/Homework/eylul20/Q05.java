package Homework.eylul20;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yasinizi giriniz: ");
        int yas = scan.nextInt();
        if (yas >= 18) {
            System.out.println("Lütfen kilonuzu giriniz");
            int kilo = scan.nextInt();
            if (kilo > 50) {
                System.out.println("kan bagisi yapabilirsiniz");
            } else System.out.println("kan bagisi yapamazsiniz");
        } else {
            System.out.println("Kan bagisi yapamazsiniz");
        }

    }

}
