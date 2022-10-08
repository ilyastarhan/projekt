package Homework.ekim8;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rand = new Random();
        int num = rand.nextInt(100);
        int sayac = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen tahmininizi giriniz: ");
        int tahmin = scan.nextInt();
        while (tahmin != num) {
            if (num < tahmin) {
                System.out.println("sayiyi kucult");

            } else {
                System.out.println("sayiyi arttir");

            }
            tahmin = scan.nextInt();
            sayac++;
        }
        System.out.println("tebrikler sayiyi bildiniz");
        System.out.println("sayiyi " + sayac + ". denemede buldunuz");


    }

}
