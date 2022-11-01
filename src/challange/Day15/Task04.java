package challange.Day15;

import java.time.LocalDate;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ayi giriniz: ");
        int month = scan.nextInt();
        System.out.println("yili giriniz: ");
        int year = scan.nextInt();
        LocalDate date = LocalDate.of(year, month,1);
        System.out.println(date.getMonth() + " " + date.getYear() + " " + date.lengthOfMonth() + " days");


    }
}
