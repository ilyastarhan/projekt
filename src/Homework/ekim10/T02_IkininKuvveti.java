package Homework.ekim10;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        System.out.println(PowersofTwo(sayi));


    }

    private static String PowersofTwo(int sayi) {
        boolean PowersofTwo = true;
        for (int i = 2; i <= sayi; i *= 2) {
            if (sayi % i != 0)
                PowersofTwo = false;

        }
        return (PowersofTwo) ? "girdiginiz sayi 2'nin üssüdür": "girdiginiz sayi 2'nin üssü degildir";
    }
}

