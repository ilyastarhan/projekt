package Homework.eylul28;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen birinci kelimeyi giriniz: ");
        String i1 = scan.next();
        System.out.println("Lütfen ikinci kelimeyi giriniz: ");
        String i2 = scan.next();

        System.out.println(kontrolEt(i1, i2));

    }

    public static boolean kontrolEt(String x, String y) {

        return x.endsWith(y);


    }
    }
