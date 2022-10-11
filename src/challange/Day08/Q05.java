package challange.Day08;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char karakter;
        do {System.out.println("Program calisiyor...");
            System.out.println("lütfen bir karakter giriniz: ");
            karakter = scan.nextLine().toLowerCase().charAt(0);

        }
        while (karakter != 'x');
        System.out.println("Program bitti");

    }
}
