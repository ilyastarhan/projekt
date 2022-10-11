package challange.Day08;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("a degeri: ");
        long a = scan.nextLong();
        System.out.println("b degeri: ");
        long b = scan.nextLong();

        System.out.println("kombinasyon(a,b) = " + kombinasyon(a, b));
        System.out.println("permutasyon(a,b) = " + permutasyon(a, b));
        faktoriyel(a);



    }

    private static long faktoriyel(long a) {
        long result = 1;
        for(int i = 1; i <= a; i++) {
            result*=i;
        }
        return result;

    }

    private static long permutasyon(long a, long b) {
        if(a>0 && b>0 && a>=b){

        return faktoriyel(a)/faktoriyel(a-b);
    }
        else return 0;}

    private static long kombinasyon(long a, long b) {

        if (a > 0 && b > 0 && a >= b) {
            return faktoriyel(a) / (faktoriyel(a-b) * faktoriyel(b));
        }
        else return 0;}

    }

