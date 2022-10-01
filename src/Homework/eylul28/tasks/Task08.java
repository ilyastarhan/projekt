package Homework.eylul28.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        System.out.println("Lütfen kontrol etmek istediginiz yili giriniz: ");
        Scanner scan = new Scanner(System.in);
        int yil = scan.nextInt();
        System.out.println(artikyil(yil));
    }

    private static boolean artikyil(int a) {
        return (a % 4 == 0 && a %100 != 0) || a % 400 == 0;

    }
}
