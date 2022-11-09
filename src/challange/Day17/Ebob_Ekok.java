package challange.Day17;

import java.util.ArrayList;
import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayiyi giriniz: ");
        int num1 = scan.nextInt();
        System.out.println("Lütfen 2. sayiyi giriniz: ");
        int num2 = scan.nextInt();
        System.out.println("Obeb = " + obeb(num1, num2));
        okek(num1, num2);

    }

    private static void okek(int num1, int num2) {
        int okek = Math.abs(num1*num2)/obeb(num1, num2);
        System.out.println("okek = " + okek);
    }

    private static int obeb(int num1, int num2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int ebob = 1;
        for (int i = Math.min(num1, num2); i >= 2; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
                break;
            }
        }
        return ebob;
    }
}
