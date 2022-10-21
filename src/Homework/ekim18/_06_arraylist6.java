package Homework.ekim18;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList<Integer> sayiListem = new ArrayList<>(Arrays.asList(5,4,6,2,1));
        System.out.println(hillNum(sayiListem));

    }

    private static int hillNum(ArrayList<Integer> sayiListem) {
        int num = 0;
        for(int i = 1; i <sayiListem.size()-1; i++) {
            if(sayiListem.get(i)> sayiListem.get(i+1) && sayiListem.get(i)<sayiListem.get(i-1))
                num = sayiListem.get(i);

        }
        return num;
    }
}
