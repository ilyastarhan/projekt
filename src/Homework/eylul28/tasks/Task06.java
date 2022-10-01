package Homework.eylul28.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hangisi icin islem yapmak istiyorsunuz: \n1->Paralelkenar\n2->Dikdörtgen\n3->Ücgen");
        int secim = scan.nextInt();

        if (secim == 1) {
            paralelkenar();
        } else if (secim == 2) {
            dikdortgen();
        } else if (secim == 3) {
            ucgen();
        } else System.out.println("Hatali giris yaptiniz");

    }

    private static void ucgen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen taban uzunlugunu giriniz: ");
        int a = scan.nextInt();
        System.out.println("Lütfen yuksekligi giriniz: ");
        int b = scan.nextInt();
        int alan = a * (b / 2);
        double cevre = a + b + Math.sqrt(a * a + b * b);
        System.out.println("Ücgenin alani : " + alan + "\nÜcgenin cevresi: " + cevre);


    }

    private static void dikdortgen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen uzun ve kisa kenari giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int alan = a * b;
        int cevre = 2 * (a + b);
        System.out.println("Dikdotgenin alani: " + alan + "\nDikdörgenin cevresi: " + cevre);

    }

    private static void paralelkenar() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen taban uzunlugunu giriniz: ");
        int a = scan.nextInt();
        System.out.println("Lütfen yuksekligi giriniz: ");
        int b = scan.nextInt();
        int alan = a * b;
        int cevre = 2 * (a + b);
        System.out.println("Paralel knearin alani: " + alan + "\nParalel kenarin cevresi: " + cevre);

    }


}
