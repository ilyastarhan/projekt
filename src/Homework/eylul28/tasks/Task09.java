package Homework.eylul28.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayi giriniz: ");
        int a = scan.nextInt();
        saniye(a);

    }

    private static void saniye(int a) {
        int saniye = a*3600;
        System.out.println(saniye);

    }
}
