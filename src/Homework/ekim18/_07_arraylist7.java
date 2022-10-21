package Homework.ekim18;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {
        ArrayList<Integer> arrList1 = new ArrayList<Integer>(Arrays.asList(3, 2, 5, 6, 11, 15, 17, 19));
        ArrayList<Integer> arrList2 = new ArrayList<Integer>(Arrays.asList(5, 8, 9, 11, 16, 14, 21, 19));


        System.out.println(common_values(arrList1, arrList2));

    }

    private static ArrayList<Integer> common_values(ArrayList<Integer> arrList1, ArrayList<Integer> arrList2) {
        ArrayList<Integer> ortakSayiListe = new ArrayList<Integer>();
        for(Integer each : arrList1) {
            for(Integer each2 : arrList2) {
                if(each == each2) {
                    ortakSayiListe.add(each);
                }
            }
        }
        return ortakSayiListe;
    }
}
