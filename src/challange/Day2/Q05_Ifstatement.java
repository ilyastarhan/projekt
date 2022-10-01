package challange.Day2;

import java.util.Scanner;

public class Q05_Ifstatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen is ünvaninizi giriniz: ");
        String jobTitle = scan.nextLine().toLowerCase();
        if (jobTitle.equals("qa")) {
            System.out.println("Quality Analyst");
        } else if (jobTitle.equals("dev")) {
            System.out.println("Developer");
        } else if (jobTitle.equals("ba")) {
            System.out.println("Business Analyst");
        } else if (jobTitle.equals("pm")) {
            System.out.println("Projekt Manager");
        } else {
            System.out.println("hatali bir ünvan girdiniz...");
        }


    }
}
