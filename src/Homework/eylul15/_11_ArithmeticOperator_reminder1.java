package Homework.eylul15;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mod almak istediginiz sayiyi ve modunu giriniz: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sonuc = num1%num2;
        System.out.println("kalan = " + sonuc);


    }
}
