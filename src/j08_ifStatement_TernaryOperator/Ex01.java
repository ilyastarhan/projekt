package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
    //   Scanner scan = new Scanner(System.in);
    //   System.out.println("Lütfen bir sayi giriniz");
    //   int nummer = scan.nextInt();
    //   if (nummer>0) {
    //       System.out.println("Girdiginiz sayi pozitiftir");
    //   }
    //   else if (nummer == 0) {
    //       System.out.println("Girdiginiz sayi nötr\'dür");
    //   }
    //   else {
    //       System.out.println("girdiginiz sayi negatiftir");
    //   }
   //    Scanner scan = new Scanner(System.in);
   //    System.out.println("Lütfen notunuzu giriniz: ");
   //    int note = scan.nextInt();
   //    if(note > 100 || note < 0){
   //        System.out.println("Hatali bir deger girdiniz");
   //    }
   //    else if (note >= 80)
   //        System.out.println("Notunuz \"A\"");
   //    else if (note >= 60) {
   //        System.out.println("Notunuz \"B\"");
   //    }
   //    else if (note >= 50) {
   //        System.out.println("Notunuz \"C\"");
   //    }
   //    else
   //        System.out.println("Notunuz \"D\"");

        Scanner input = new Scanner(System.in);
        System.out.println("notu giriniz : ");
        int not = input.nextInt();
        if (not <= 100 && not>= 0) {
            char harf = not >= 80 ? 'A' : not >= 60 ? 'B' : not >= 50 ? 'C' : 'D';
            System.out.println("Notunuz : " + harf);
        } else System.out.println("yanlış not girdiniz, yeniden deneyiniz. ");


        }
    }

