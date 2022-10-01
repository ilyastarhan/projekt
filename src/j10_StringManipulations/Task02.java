package j10_StringManipulations;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
   Girilen passwordun aşagıdakişartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sifre giriniz: ");
        String password = scan.next();
        if (
                password.length() >= 6
                        && (password.charAt(0) >= 'A' && (password.charAt(0) <= 'Z'))
                        && (password.charAt(password.length() - 1) >= 0) && (password.charAt(password.length() - 1)) <= 9
                        && !password.contains(" ")
        ) {
            System.out.println("sifreniz gecerlidir");
        } else
            System.out.println("Sifreniz gecersizdir");


    }
}
