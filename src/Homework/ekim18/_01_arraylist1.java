package Homework.ekim18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */
    static ArrayList<String> strArr = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Peach", "Banana", "Orange"));

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Listede aramak istediginiz degeri giriniz: ");
        String str = scan.next();
        System.out.println("Girdiniz kelime listenizde " + getCount(str) + " adet var.");

    }

    private static int getCount(String str) {
        int count = 0;
        for (String each : strArr) {
            if (each.equalsIgnoreCase(str))
                count++;
        }
        return count;
    }
}
