package challange.Day04;

import java.util.Scanner;

public class Q02_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

//yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime yaziniz: ");
        String s1 = scan.nextLine();
        System.out.println("Lütfen baska bir kelime yaziniz: ");
        String s2 = scan.nextLine();
        String s3 = s1.concat(" " + s2);
        System.out.println(s3);
        System.out.println(s1 + " " + s2);
        System.out.println(s1.substring(1).concat(" " + s2.substring(1)));


    }
}
