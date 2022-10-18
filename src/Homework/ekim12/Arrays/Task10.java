package Homework.ekim12.Arrays;

import java.util.Arrays;

public class Task10 {
    static int arr[];

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int arr[] = {1, 2, -3, 4, -5, -6};
        isaretdegistirme(arr);

    }
    private static void isaretdegistirme(int arr[]) {
        for (int each : arr) {
           each*=-1;
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}