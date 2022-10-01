package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        String str = "Istanbul";
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.charAt(0));
        // System.out.println(str.charAt(18));//rte error
        System.out.println(str.charAt(str.length() / 2));
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir veri giriniz");
        String veri = scan.nextLine();
        if (veri.length() % 2 == 0) {
            System.out.println("Girilen kelimenin orta karakteri yoktur");

        } else {
            System.out.println(veri.charAt((veri.length()-1) / 2));
        }


    }
}
