package challange.Day15.printf;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz: ");
        multipleTable(scan.nextInt());

    }

    private static void multipleTable(int sayi) {

        for(int i = 1; i <= sayi; i++) {
            for(int j = 1; j <= sayi; j++) {
                System.out.printf("%3d", i*j);

            }
            System.out.println();
        }
    }
}
