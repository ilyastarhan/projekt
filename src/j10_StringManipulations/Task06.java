package j10_StringManipulations;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(s.substring(0, s.length() - 1));

    }
}
