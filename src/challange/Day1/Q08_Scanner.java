package challange.Day1;

import java.util.Scanner;

public class Q08_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen toplamak istediginiz iki sayi giriniz: ");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        System.out.println("ilk ve ikinci sayinin toplami: " + (i1+i2));
    }
}
