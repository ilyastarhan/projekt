package Homework.eylul23;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen String bir cümle yaziniz");
        String yazi = scan.nextLine();
        if (yazi.contains(" ")) {
            System.out.println("Girdiginiz cümlede \" Bosluk \" karakteri vardir... ");
        } else {
            System.out.println("Girdiginiz cümlede \" Bosluk \" karakteri yoktur... ");
        }
    }
}

