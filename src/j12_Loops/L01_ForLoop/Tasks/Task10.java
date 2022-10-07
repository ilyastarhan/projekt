package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        System.out.println("lütfen yazi giriniz: ");
        String str = scan.nextLine();
        System.out.println("aradiginiz harfi giriniz: ");
        char ch = scan.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.println((i+1) + ". sirada var");
                sayac++;
            }
        }
        System.out.println("Toplam harf sayisi: " + sayac);
    }
}

