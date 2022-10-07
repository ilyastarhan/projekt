package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println(i+ ". sayiyi giriniz: ");
            int num1 = scan.nextInt();
            if (!(num1 < 20 && num1 > 10)) {
                toplam += num1;
            }
        }
        System.out.println("Girdiginiz sayilarin toplami = " + toplam);

    }
}
