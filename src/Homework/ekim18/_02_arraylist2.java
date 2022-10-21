package Homework.ekim18;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        ArrayList<Integer> sayiList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,9,15,17,18,16,15,14,21,20));
        System.out.println(getSum(sayiList));


    }

    private static int getSum(ArrayList<Integer> list) {
        int toplam = 0;
        for(Integer each : list){
            toplam+=each;
        }
        return toplam;
    }
}
