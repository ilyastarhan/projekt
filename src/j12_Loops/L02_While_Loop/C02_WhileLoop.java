package j12_Loops.L02_While_Loop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int i = scan.nextInt();
        System.out.println(rakamtoplam(i));


    }

    private static int rakamtoplam(int i) {
        int toplam=0;
        while(i!=0){
            toplam+=i%10;
            i/=10;
        }
        return toplam;
    }
}
