package challange.Day08;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int count = 0;
        for(int i = 1; i<=sayi; i+=2){
            System.out.print(i + " ");
            count++;
        }
        System.out.println();
        System.out.println("Toplam sayi adedi = " + count);


    }
}
