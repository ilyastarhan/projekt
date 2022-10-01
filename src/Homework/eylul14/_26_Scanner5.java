package Homework.eylul14;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen 10 sene önce yasadiginiz sehrin ismin giriniz");
        String sehir = scan.nextLine();
        System.out.println("10 sene önce " + sehir + " sehrinde yasiyordunuz");



    }
}
