package challange.Day07;

import java.util.Scanner;

public class ForLoop6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz: ");
        String str = scan.nextLine();
        System.out.println(reverse(str));

    }

    private static String reverse(String str) {
        String reversestr = "";

        for(int i = str.length()-1; 0 <= i; i--) {
            reversestr += str.charAt(i);
        }
        return reversestr;

    }
}
