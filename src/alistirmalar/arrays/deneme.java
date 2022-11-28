package alistirmalar.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class deneme {
    public static void main(String[] args) {

        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));


        int[][] jagged = new int[5][];
        jagged[0] = new int[1];
        jagged[1] = new int[2];
        jagged[2] = new int[3];
        jagged[3] = new int[4];
        jagged[4] = new int[5];
        int num=1;
        for(int i = 0 ; i<5 ; i++){
            for(int j=0; j<i+1; j++){
                jagged[i][j]=num;
                num++;
            }
        }
        System.out.println(Arrays.deepToString(jagged));



    }

    public static int kthLargest(int k, int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < a.length ; i++) {
            list.add(a[i]);        }
        Collections.sort(list);
        return list.get(list.size()-k-1);


    }
    public static int mode(int[] a) {
        int num = Integer.MAX_VALUE;
        int count1=1;
        for(int i = 0; i<a.length;i++){
            int count = 0;
            for(int j = 0; j<a.length; j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>=count1){
                if(count>count1)
                {
                    count1=count;
                    num=a[i];
                }
                else{
                    count1=count;
                    if(a[i]<num)
                        num=a[i];
                }}
        }
        return num;
    }
    public static void swapPairs(String[] a) {
        String[] arr = new String[a.length];
        for(int i = 0; i<a.length;){
            if (a.length==1){
                System.out.println(Arrays.toString(a));
                break;}
            arr[i]=a[i+1];
            arr[i+1]=a[i];
            i+=2;
            if(a.length%2==1 && i>=a.length-1){
                arr[i]=a[i];
                break;
            }


        }
        if(a.length!=1)
            System.out.println(Arrays.toString(arr));

    }
}