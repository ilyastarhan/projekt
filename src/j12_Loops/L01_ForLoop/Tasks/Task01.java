package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 1; i < sayi; i++) {
            if (i%5==0 && i%3==0){
                System.out.println("javaCAN");

            }
            else if(i%5==0){
                System.out.println("CAN'dir");
            }
            else if (i%3==0){
                System.out.println("Java");
            }
            else System.out.println(i);

        }

    }
}
