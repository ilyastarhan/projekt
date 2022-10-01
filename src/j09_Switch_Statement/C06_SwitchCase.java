package j09_Switch_Statement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Haftanin gününü giriniz: ");
        String gun = scan.next().toLowerCase();
        switch (gun){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Hatali veri girisi yaptiniz...");
        }

    }}