package Homework.eylul14;

import java.util.Scanner;

public class _25_Scanner4 {

    public static void main(String[] args) {

    /*   kullanıcının arabansındaki kapı sayısını print eden code create ediniz.  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen arabanizin kac kapili oldugunu giriniz: ");
        byte kapi = scan.nextByte();
        System.out.println("Arabanizdaki kapi sayisi = " + kapi);


    }
}


