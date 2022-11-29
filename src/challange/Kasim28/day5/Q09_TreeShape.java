package challange.Kasim28.day5;

import java.util.Scanner;

public class Q09_TreeShape {
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken
    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Satir sayisi giriniz: ");
        int num = scan.nextInt();
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("|");
            }
            System.out.println();
        }

    }
}
