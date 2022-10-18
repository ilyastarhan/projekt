package j15_Arrays;

import java.util.ArrayList;

public class Kaptan {

    public static void main(String[] args) {
        int arr[] = {1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38};

        int max = Integer.MIN_VALUE;
        int max2;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.valueOf(arr[i]));

        }
        for(int i = 0; i < list.size(); i++) {
            if(i > max)
                max = i;}
        list.remove(max);
        for(int i = 0; i < list.size(); i++) {
            if(i > max)
                max = i;}
        System.out.println("max = " + max);




    }
}
