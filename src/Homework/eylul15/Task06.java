package Homework.eylul15;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üc basamakli bir sayi giriniz: ");

       int sayi = scan.nextInt();
       int a = sayi/100;
       int b = (sayi/10)%10;
       int c = sayi%10;
        System.out.println("Girdiginiz sayinin birler basamagi: " + c);
        System.out.println("Girdiginiz sayinin onlar basamagi: " + b);
        System.out.println("Girdiginiz sayinin yüzler basamagi: " + a);

    //   String sayi = scan.next();
    //   String a = sayi.charAt(0)+"";
    //   String b = sayi.charAt(1)+"";
    //   String c = sayi.charAt(2)+"";
    //   int a1 = Integer.valueOf(a);
    //   int b1 = Integer.valueOf(b);
    //   int c1 = Integer.valueOf(c);
    //   System.out.println("Girdiginiz sayinin yuzler basamagi: " + a1);
    //   System.out.println("Girdiginiz sayinin onlar basamagi: " + b1);
    //   System.out.println("Girdiginiz sayinin birler basamagi: " + c1);

    //   System.out.println(a1+b1+c1);





    }
}
