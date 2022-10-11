package j13_BreakContinue;

import java.util.Scanner;

public interface C02_Continue {
    static void main(String[] args) {
        /*
        Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
        atlar ve loop'un bir sonraki değerinden devam eder.

                */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("mail adresi giriniz: ");
        String mail = scan.nextLine();
        for(int i= 0; i<mail.length()-1; i++){
            if(mail.charAt(i)==' ')
                continue;
            System.out.print(mail.charAt(i));

        }


    }
}