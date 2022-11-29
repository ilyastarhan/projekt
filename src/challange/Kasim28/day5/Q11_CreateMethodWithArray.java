package challange.Kasim28.day5;

import java.util.Arrays;
import java.util.Random;

public class Q11_CreateMethodWithArray {
    //    ||This Part Should be in Main Method||
    //
    //     -Create an array of size 5, assign some random values from 0 to 10
    //     -(use random class and for loop to assign values)
    //
    //
    //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
    //
    //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
    //     -2-Create a method that prints the sum of an array
    //     -3-Create a method that prints the max element of an array
    //
    //    P.S: Return type should be void because we are not returning anything just printing


    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i]=rand.nextInt(10);
        }


        yazdir(arr);
        yazdirMax(arr);
        yazdirSum(arr);

    }
    public static void yazdir(int[] arr){

        for(int value : arr){
            System.out.print(value + " ");
        }
    }

    public static void yazdirSum(int[] arr){


        System.out.print(Arrays.stream(arr).reduce(0, Integer::sum)+ " ");
        int sum = 0;
        for(int value : arr){
            sum+=value;
        }
        System.out.println(sum);
        int sum2 = 0;
        for(int i = 0; i < arr.length; i++){
            sum2+=arr[i];
        }
        System.out.println(sum2);
    }
    public static void yazdirMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);
        System.out.println(Arrays.stream(arr).reduce(Integer.MIN_VALUE, Integer::max));

    }
}
