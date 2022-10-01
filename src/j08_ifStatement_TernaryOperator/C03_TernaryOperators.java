package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperators {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
    System.out.println("***********if-else*********");
        if (sayi % 2 == 0) {
            System.out.println("sayi Cift");
        } else {
            System.out.println("sayi tek");
        }
        ////////////////////////////////////

        System.out.println("*********Ternary*******");
        String sonuc = (sayi % 2 == 0) ? "Sayi Cift" : "Sayi Tek";
        System.out.println("sonuc = " + sonuc);

        ///////////////////////////////////////

        String sonuc1 = (sayi < 0) ? "Sayi Negatif" : (sayi>0? "Sayi Pozitif": "Sayi nötr");
        System.out.println(sonuc1);

    }
}
