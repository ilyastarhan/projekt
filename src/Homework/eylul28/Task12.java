package Homework.eylul28;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        System.out.println("Lütfen mail adresini giriniz: ");
        Scanner scan = new Scanner(System.in);
        String mail = scan.nextLine();
        System.out.println(validateEmail(mail));
    }

    private static boolean validateEmail(String a) {
        return a.contains("@") && a.contains(".") && a.indexOf("@")  > 0;

    }


}