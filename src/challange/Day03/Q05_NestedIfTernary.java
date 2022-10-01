package challange.Day03;

import java.util.Scanner;

public class Q05_NestedIfTernary {
    public static void main(String[] args) {
        /*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int num = scan.nextInt();
        String result = num == 0 ? "Sifir" :
                num == 1 ? "Bir" :
                        num == 2 ? "Iki" :
                                num == 3 ? "Uc" :
                                        num == 4 ? "Dört" :
                                                num == 5 ? "Bes" :
                                                        num == 6 ? "Alti" :
                                                                num == 7 ? "Yedi" :
                                                                        num == 8 ? "Sekiz" :
                                                                                num == 9 ? "Dokuz" : "Gecersiz";
        System.out.println("result = " + result);
        if(num>=0 && num<10) {
            if (num == 9) {
                System.out.println("Dokuz");
            } else if (num == 8) {
                System.out.println("Sekiz");
            } else if (num == 7) {
                System.out.println("Yedi");
            } else if (num == 6) {
                System.out.println("Alti");
            } else if (num == 5) {
                System.out.println("Bes");
            } else if (num == 4) {
                System.out.println("Dört");
            } else if (num == 3) {
                System.out.println("Üc");
            } else if (num == 2) {
                System.out.println("Iki");
            } else if (num == 1) {
                System.out.println("Bir");
            } else {
                System.out.println("Sifir");
            }
        }
        else {
            System.out.println("Gecersiz");
        }}}