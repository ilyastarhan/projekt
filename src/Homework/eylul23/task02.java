package Homework.eylul23;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        //Projeler.TASK->Girilen e=mail hesabinin @gmail.com icermiyorsa lutfen gmail hesabi giriniz
        //@gmail.com ile bitiyorsa hesabiniz onaylandi aksi durumda gecerli hesap giriniz print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen email adresini giriniz");
        String email = scan.nextLine();
        if (!email.contains("@gmail.com")) {
            System.out.println("Lütfen gmail hesabi giriniz...");
        } else {
            if (email.endsWith("@gmail.com")) {
                System.out.println("Hesabiniz onaylandi");
            } else {
                System.out.println("lütfen gecerli bir hesap giriniz: ");
            }
        }


    }
}
