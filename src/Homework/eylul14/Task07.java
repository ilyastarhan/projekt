package Homework.eylul14;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mesafeyi \"km\" cinsinden giriniz");
        double mesafe = scan.nextInt();
        System.out.println("Lütfen saatteki ortalama hizini giriniz");
        double hiz = scan.nextInt();
        double sure = mesafe/hiz;
        System.out.println("Toplam süre: " + sure + " saattir.");



    }
}
