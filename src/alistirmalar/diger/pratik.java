package alistirmalar.diger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pratik {
    public static void main(String[] args) {



        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 8;
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,3,65,89,74));
     //   List<Integer> list2 = Arrays.asList(arr);
        List arrayAsList = Arrays.asList(7,8,9,10,36,16);
        list.forEach((p)->{
            System.out.print(p + " ");
        });

        arrayAsList.set(1,100);

        List listOf = List.of(7,8,9,11,12,13);
        list.add(12);
        list.add(23);
        list.add(11);
        list.add(14);
        list.add(16);
        list.add(17);
    }
}
