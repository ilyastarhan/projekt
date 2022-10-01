package j11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz: ");
        String name = scan.next();
        System.out.println("Lütfen soyisminizi giriniz");
        String surname = scan.next();
        isimsoyisim(name, surname);
        isimsoyisim2(name, surname);


    }

    private static void isimsoyisim(String a, String b) {
        System.out.println(a.toUpperCase().charAt(0) + a.substring(1).toLowerCase() + " " + b.toUpperCase().charAt(0) + b.substring(1).toLowerCase());


    }
    private static String isimsoyisim2(String a, String b) {
        System.out.println(a.toUpperCase().charAt(0) + a.substring(1).toLowerCase() + " " + b.toUpperCase().charAt(0) + b.substring(1).toLowerCase());
        a = a.toUpperCase().charAt(0) + a.substring(1).toLowerCase();
        b = b.toUpperCase().charAt(0) + b.substring(1).toLowerCase();
        return (a + " " + b);

    }
}
