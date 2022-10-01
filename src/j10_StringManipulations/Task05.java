package j10_StringManipulations;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String s1 = scan.nextLine().toLowerCase();
        System.out.println("Lütfen soyisminizi giriniz: ");
        String s2 = scan.nextLine().toLowerCase();
        if(s1.contains(" ")){
            System.out.println(s1.toUpperCase().charAt(0)
                    + s1.substring(1, s1.indexOf(" ")) + " " + s1.toUpperCase().charAt(s1.indexOf(" ")+1)
                    + s1.substring(s1.indexOf(" ")+2)
                    + " "
                    + s2.toUpperCase().charAt(0)
                    + s2.substring(1));
        }
        else
            System.out.println(s1.toUpperCase().charAt(0)
                    + s1.substring(1)
                    + " "  + s2.toUpperCase().charAt(0)
                    + s2.substring(1));

    }
}
