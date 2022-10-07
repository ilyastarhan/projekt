package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi");
        int sayi = scan.nextInt();

        for(int i=0; i<sayi; i++){

            for(int j=0; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
