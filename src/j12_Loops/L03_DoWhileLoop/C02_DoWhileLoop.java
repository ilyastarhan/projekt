package j12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        do {

            System.out.println("sayi giriniz: ");
            System.out.println("kazandiniz");
            i++;


        }while(i < 17);
        System.out.println("kaybettiniz");
    }
}