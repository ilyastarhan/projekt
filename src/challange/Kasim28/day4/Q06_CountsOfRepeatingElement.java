package challange.Kasim28.day4;

import java.util.Scanner;

public class Q06_CountsOfRepeatingElement {

    /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arr [] = {1,1,1,22,23,85,58,77,66,22,23,77};
        System.out.print("aranilan sayiyi giriniz :");
        int sayi = scan.nextInt();
        int count = 0;
        for(int value : arr){
            if(value==sayi)
                count++;
        }
        int count1 = 0;
        System.out.println("count = " + count);
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==sayi)
                count1++;
        }
        System.out.println("count1 = " + count1);

    }
}
