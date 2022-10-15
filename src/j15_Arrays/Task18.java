package j15_Arrays;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {


       int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};
       int arr[] = new int[sayi.length];

       for(int i=0; i<sayi.length; i++) {
           int toplam = 0;
           for(int j=0; j<sayi[i].length; j++) {
               toplam += sayi[i][j];
           }
           arr[i] = toplam;
       }
       System.out.println(Arrays.toString(arr));


    }
}
