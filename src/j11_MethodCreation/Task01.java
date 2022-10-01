package j11_MethodCreation;

import java.util.Scanner;

public class Task01 {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz: ");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        System.out.println(esitlik(i1, i2));
        esitlik2(i1,i2);
        esitlik2(23,34);
        esitlik2(23,23);

    }

    private static void esitlik2(int a, int b) {
        if(a==b){
            System.out.println("agam sayilar esit");
        }else
            System.out.println("agam sayilar esit degil");
    }

    public static boolean esitlik(int a, int b) {
        if (a == b) {
            return true;
        } else
        return false;
    }

}
