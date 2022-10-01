package Homework.eylul14;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen hipotenüsünü hesaplamak istediginiz ucgeninin iki dik kenarinin uzunlugunu giriniz: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println("Bilgilerini giridigiz dik ücgenin hipotenüsü: " + (Math.sqrt((a*a)+(b*b))));





    }
}
