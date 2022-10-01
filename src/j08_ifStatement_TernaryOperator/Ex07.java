package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        if (sayi > 0) {
            if (sayi > 10) {
                System.out.println("Büyüksün!");
            } else System.out.println("Normalsin");
        } else if (sayi < 0) {
            if (sayi > -10) {
                System.out.println("Negatifsin!");
            } else System.out.println("Cok negatifsin!!!");
        } else {
            System.out.println("nötr sayi girdiniz!!!");
        }
    }
}