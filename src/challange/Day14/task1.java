package challange.Day14;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        /*
    Write a Java program to separate odd and even numbers of a given array of integers.
    Put all odd numbers first, and then even numbers.
     example: int sayi[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
     */

        int[] sayi = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        System.out.println(evenAndOddNumbers(sayi));
    }

    private static ArrayList<Integer> evenAndOddNumbers(int[] sayi) {
        ArrayList<Integer> yeniList = new ArrayList<>();
        for(int value : sayi) {
            if(value%2==1){
            yeniList.add(value);}
        }
        for(int value : sayi) {
            if(value%2==0)
                yeniList.add(value);
        }
        return yeniList;
    }
}
