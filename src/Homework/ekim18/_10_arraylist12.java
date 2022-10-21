package Homework.ekim18;

import java.util.ArrayList;
import java.util.Arrays;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    static ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));
    static int min = 20;
    static int max = 30;

    public static void main(String[] args) {

        System.out.println(rangeBtw(arrList, min, max));


    }

    private static int rangeBtw(ArrayList<Integer> arrList, int min, int max) {

        int count = 0;
        for (Integer each : arrList) {
            if (each <= max && each >= min) count++;
        }
        return count;
    }
}