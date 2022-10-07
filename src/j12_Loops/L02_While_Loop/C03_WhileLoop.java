package j12_Loops.L02_While_Loop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int sayac=0;
        int say = 1;

        while(i>=say){
            if(i%say==0) {
                System.out.print(say + " ");
                sayac++;}
            say++;
        }
        System.out.println();
        System.out.println(sayac);

    }
}
