package challange.Day08;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bi sayi giriniz: ");
        int sayi = scan.nextInt();
        for (int i = 0; i < sayi; i++) {//satir kontrolü
            for (int j = sayi - i; j > 0; j--) {//bosluk kontrolü
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {//sutün kontrolü
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
