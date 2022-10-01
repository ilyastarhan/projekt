package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperators {
    public static void main(String[] args) {

        // TASK-> girilen bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        String sonuc = (sayi >= 10 || sayi <= -10) ? "Sayi 2 veya daha fazla basamakli" : "Tek basamakli";
        System.out.println(sonuc);
    }
}
