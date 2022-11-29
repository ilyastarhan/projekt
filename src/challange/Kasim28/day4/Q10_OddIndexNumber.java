package challange.Kasim28.day4;

import java.util.Scanner;

public class Q10_OddIndexNumber {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        for(int i = 1 ; i<str.length() ; i+=2) {
            System.out.print(str.charAt(i)+"");
        }

    }
}
