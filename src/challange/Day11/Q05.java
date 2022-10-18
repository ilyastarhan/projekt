package challange.Day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
/*
   Find the middle element in an integer array
   Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
             (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
*/
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean devamMi = true;
        while (devamMi) {
            System.out.println("Lütfen sayi giriniz");
            arr.add(scan.nextInt());
            System.out.println("Sayi eklemek icin 1 cikmak icin 2 giriniz");
            if (scan.nextInt() == 2)
                devamMi = false;
        }
        Collections.sort(arr);
        System.out.println(arr);
        if (arr.size() % 2 == 1) {
            System.out.println(arr.get((arr.size() - 1) / 2));
        } else {
            System.out.println((double)(arr.get((arr.size() / 2)-1) + arr.get((arr.size() / 2)))/2);
        }
    }
}