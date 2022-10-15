package Homework.ekim13;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        int arr[] = {12,2,5,15,8};
        int max= Integer.MIN_VALUE;
        for (int i=0; i<arr.length ; i++){
            if (arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println("max = " + max);


    }
}

