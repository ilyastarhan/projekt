package Homework.ekim18;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(11, 33, 44, 42, 94, 35, 76, 41, 45));
        System.out.println(secondMax(arrList));

    }

    private static int secondMax(ArrayList<Integer> arrList) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 2; i++) {

            for (Integer each : arrList) {
                if (each > max)
                    max = each;
            }
            if (i == 0) {
                arrList.remove(arrList.indexOf(max));
                max = Integer.MIN_VALUE;
            }
        }
        return max;

    }
}

