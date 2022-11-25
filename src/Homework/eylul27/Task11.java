package Homework.eylul27;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* Projeler.TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ad ve soyadinizi giriniz");
        String name_surname = scan.nextLine();
        if(name_surname.contains(" "))
            if(name_surname.indexOf(" ") == name_surname.lastIndexOf(" "))
        System.out.println("Adiniz: " + name_surname.substring(0, name_surname.indexOf(" ")) + "\nSoyadiniz: " + name_surname.substring(name_surname.indexOf(" ")+1));
        else
                System.out.println("hatali giris yaptiniz..");

    }
}
