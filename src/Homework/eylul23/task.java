package Homework.eylul23;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        //ask-> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz->ternary kullanınız
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz: ");
        String input = scan.nextLine();
        System.out.println("Lütfen yazdiginiz cümle icerisinde aramk istediginiz kelimeyi giriniz: ");
        String input2 = scan.nextLine();
        System.out.println(input.contains(input2) ? "Aradiginiz ifade yazdiginiz cümle icerisinde gecmektedir" : "Aradiginiz ifade yazdiginiz cümle icerisinde gecmektedir");

    }
}
