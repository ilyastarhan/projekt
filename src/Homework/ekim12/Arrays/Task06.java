package Homework.ekim12.Arrays;

import java.util.Arrays;

public class Task06 {
    static int arr[];
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        System.out.println(Arrays.toString(siralama(arr)));

    }
    private static int[] siralama(int arr[]) {

        Arrays.sort(arr);
        int yeniarr[] = new int[arr.length];
        for(int i=0; i < arr.length; i++) {
            yeniarr[i] = arr[arr.length-1-i];
        }
        return  yeniarr;

    }
}
