package challange.Day09;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        for(int c = 50; c<=60; c++) {
            double f = (c*1.8)+32;
            System.out.println(c+ " =  " + f);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println(" baklva dilimi için bir boyut giriniz");
        int boyut = scan.nextInt();
        // baklva diliminin üst bölgesi
        for (int i = 1; i <= boyut; i++) {//outer for
            for (int j = boyut; j > i; j--) {//boşluk foru
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {//yıldız foru
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
