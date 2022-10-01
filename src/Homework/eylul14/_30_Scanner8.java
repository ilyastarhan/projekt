package Homework.eylul14;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */
        Scanner scan = new Scanner(System.in);
        byte kg;
        System.out.println("Lütfen Kg cinsinden bir miktar giriniz: ");
        kg = scan.nextByte();
        System.out.println(kg + "kg");




    }
}
