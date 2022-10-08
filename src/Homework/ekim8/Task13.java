package Homework.ekim8;

import java.util.Scanner;

public class Task13 {
    static char ch;
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */
        Scanner scan = new Scanner(System.in);

        char ch;
        do {
            System.out.print("lütfen bir karakter giriniz: ");
            ch = scan.next().toLowerCase().charAt(0);
            System.out.println("javaCAN");


        }
        while (ch != 'x');
        System.out.println("jAVATAR");

    }
}