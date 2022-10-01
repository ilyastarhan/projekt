package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        String sonuc = (sayi>=1000 && sayi<=9999) ? "Dört basamakli" : (sayi%2==0 ? "4 Basamakli olmayan cift sayi" : "Dört basamakli olmayan tek sayi");
        System.out.println("sonuc = " + sonuc);



    }
}
