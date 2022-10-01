package Homework.eylul20;

import java.util.Scanner;

public class max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("arka arkaya adet sayi girin");
        System.out.println("girdiginiz bu 3 sayinin en buyuk olanini ve en kucuk olanini bulup cikti alacağız");
        int maks=0;
        int min=0;
        for (int i=1; i<=3; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int sayi = input.nextInt();
            if (i==1)
            {
                maks=sayi;
                min=sayi;
            }
            if (sayi>maks)
                maks=sayi;
            if (sayi<min)
                min=sayi;
        }
        System.out.println("girdiginiz 3 sayi icinden en buyuk olani: "+maks);
        System.out.println("girdiginiz 3 sayi icinden en kucuk olani: "+min);
    }
}
