package Homework.eylul27;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 kelimelik isim giriniz: ");
        String s = scan.nextLine().toUpperCase();
        if(s.indexOf(" ") != s.lastIndexOf(" ")){
        System.out.println(s.charAt(0) + "." + s.charAt(s.indexOf(" ") + 1) + "." + s.charAt(s.lastIndexOf(" ") + 1));}
        else System.out.println("Hatali giris yaptiniz");


    }
}
