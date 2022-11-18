package Socrative;

import java.util.ArrayList;
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,6,5,4,5};
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            arrList.add(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arrList);

    }
}
