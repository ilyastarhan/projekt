package Homework.Ekim17;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11_Fibonacci {
    public static void main(String[] args) {


     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen hangi sayiya kadar FIBONACCI dizisi olusturmak istediginizi belirtiniz: ");
        int sayi = scan.nextInt();
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        int a = 1;
        int b = 1;
        int temp;
        fibonacci.add(a);

        while(b <= sayi) {
            fibonacci.add(b);
            temp = b;
            b=a+b;
            a=temp;
        }
        System.out.println(fibonacci);

    }

}
