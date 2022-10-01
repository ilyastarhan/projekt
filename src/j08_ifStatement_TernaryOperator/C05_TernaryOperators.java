package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperators {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println(sayi%2==0 ? sayi/2 : "girilen sayi tek sayidir");
        String sonuc = (sayi%2 == 0) ?  String.valueOf(sayi/2) : "Girilen sayi tek sayidir iki ile bölünmez";
        System.out.println("sonuc = " + sonuc);

        /*
        ternary iki durum (T/F) icin darkli data ciktisi veriyorsa variable atama yapmadan cikti alinmali
        ya da ternary ciktisi aynio data type a serializable yapilmali
         */


    }
}
