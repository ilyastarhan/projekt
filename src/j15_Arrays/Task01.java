package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class Task01 {
    public static void main(String[] args) {
        
        //Task->
        Scanner scan = new Scanner(System.in);
        System.out.println("array uzunluğu kaç olsun?");
        int length = scan.nextInt();
        int a[]=new int[length];
        for (int i = 0; i < a.length; i++) {
            System.out.println(i+". elemanı giriniz");
            a[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]+" ");
        }

    }
}
