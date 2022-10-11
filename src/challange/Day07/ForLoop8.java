package challange.Day07;

import java.util.Scanner;

public class ForLoop8 {
    public static void main(String[] args) {
        // Kullanicidan iki sayi isteyin.
// Girilen sayilar ve aralarindaki tum
// tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int min = (num1<num2)?num1:num2;
        int max = (num1>num2)?num1:num2;
        int toplam=0;
        for(int i = min; i<=max; i++) {
            if(num1==num2) {System.out.println("sayilar esittir");}
            else toplam+=i;

        }
        System.out.println("toplam = " + toplam);

    }
}
