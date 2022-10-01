package Homework.eylul14;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sirasiyla \"Vize-1\", \"Vize-2\" ve \"Final\" notlarinizi giriniz: ");
        double vize1 = scan.nextDouble();
        double vize2 = scan.nextDouble();
        double ffinal = scan.nextDouble();
        double ortalama = ((vize1+vize2)/2*0.30) + (ffinal*0.70);
        System.out.println("Gecme notunuz: " + ortalama);




    }
}
