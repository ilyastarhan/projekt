package alistirmalar.Loop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir sayi giriniz: ");
        int num = scan.nextInt();
        for(int i = 0; i<10 ; i++){
            int multiplication = num*i;
            System.out.println(num + "*" + i + "= " + multiplication);

        }
    }
}
