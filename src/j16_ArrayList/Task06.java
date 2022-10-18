package j16_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Elemanları giriniz");
        int sayi [] = new int[6];
        for(int i = 0 ; i<sayi.length;i++) {
            sayi[i] = scan.nextInt();
        }
        System.out.println(tekEleman(sayi));



    }
    public static ArrayList<Integer> tekEleman(int [] a){
        ArrayList<Integer> sayiList = new ArrayList<>();
        for (int i = 0 ; i<=sayiList.size()-1;i++) {
            if(a[i]%2==1)sayiList.add(a[i]);
        }
        return sayiList;
    }
}

