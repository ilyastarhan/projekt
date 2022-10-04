package challange.Day06;

import java.util.Scanner;

public class Q04_MethodCreation {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Kullaniciya kac sayi toplamak istedigini sorun.
//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
//Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
//2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz

        System.out.println("Lütfen kac sayi toplamak istediginizi giriniz: ");
        int num = scan.nextInt();
        secim(num);

    }

    private static void secim(int num) {
        if (num == 4) {
            System.out.println("sayilari giriniz: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            System.out.println(toplam(a, b, c, d));
        } else if (num == 3) {
            System.out.println("sayilari giriniz: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            System.out.println(toplam(a, b, c));
        } else if (num == 2) {
            System.out.println("sayilari giriniz: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(toplam(a, b));
        } else if (num == 1) {
            System.out.println("en az 2 sayi girmelisiniz...");
        } else {
            System.out.println("fazla sayi girdiniz...");

        }
    }

    private static int toplam(int a, int b) {
        return a+b;
    }
    private static int toplam(int a, int b, int c) {
        return a+b+c;
    }
    private static int toplam(int a, int b, int c, int d) {
        return a+b+c+d;
    }
}

