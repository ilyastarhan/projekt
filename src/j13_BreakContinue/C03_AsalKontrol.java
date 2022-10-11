package j13_BreakContinue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean asalMi = true;
        for(int i = 2; i < num; i++) {
            if(num%i==0) {
                asalMi = false;
                break;
            }
        }
        System.out.println(asalMi);


    }
}
