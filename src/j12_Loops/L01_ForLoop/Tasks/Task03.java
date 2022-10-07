package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println(faktoriyel(sayi));


    }

    private static int faktoriyel(int sayi) {
        int toplam = 1;

        for(int i = 1; i <= sayi; i++){
            toplam*=i;
        }
        return toplam;

    }
}
