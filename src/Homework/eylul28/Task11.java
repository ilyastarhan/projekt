package Homework.eylul28;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
        System.out.println("Lütfen yazi giriniz: ");
        Scanner scan = new Scanner(System.in);
        String yazi = scan.nextLine();
        System.out.println(hackerDili(yazi));
    }

    private static String hackerDili(String a) {
        String yeniyazi = a.replace("s", "5")
                .replace("a", "4")
                .replace("e", "3")
                .replace("i","1")
                .replace("o", "0");
        return yeniyazi;

    }


}