package Homework.eylul20;

import java.util.Scanner;

public class Q16 {
/* Projeler.TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üc sayi giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("En büyük sayi " + num1 + " En kucuk sayi " + num3);
            } else {
                System.out.println("En büyük sayi " + num1 + " En kucuk sayi " + num2);
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println("En büyük sayi " + num2 + " En kucuk sayi " + num3);
            } else {
                System.out.println("En büyük sayi " + num2 + " En kucuk sayi " + num1);
            }
        } else {

            if (num1 > num2) {
                System.out.println("En büyük sayi " + num3 + " En kucuk sayi " + num2);
            } else {
                System.out.println("En büyük sayi " + num3 + " En kucuk sayi " + num1);
            }

        }
    }
}
