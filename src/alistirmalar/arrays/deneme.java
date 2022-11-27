package alistirmalar.arrays;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {



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