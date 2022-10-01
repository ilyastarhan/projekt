package challange.Day2;

import java.util.Scanner;

public class Q04_IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Y/N ikilisinden birini giriniz: ");
        char karakter = scan.next().charAt(0);
        if (karakter == 'Y' || karakter == 'y') {
            System.out.println("YES");
        } else if (karakter == 'N' || karakter == 'n') {
            System.out.println("NO");
        } else {
            System.out.println("Yanlis giris yaptiniz. Lütfen tekrar giriniz...");
        }


    }
}
