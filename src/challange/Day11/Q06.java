package challange.Day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        Scanner scan = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("sayi giriniz");
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> maxListe = new ArrayList<Integer>(n);


        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) > max)
                    max = list.get(j);
            }
            maxListe.add(max);
            list.remove((Integer)max);

        }System.out.println(maxListe);
    }
}