package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        if(sayi%2==0) {
            System.out.println("Sayi cifttir");
        }
        else {
            System.out.println("Sayi tektir");
        }

    }
}
