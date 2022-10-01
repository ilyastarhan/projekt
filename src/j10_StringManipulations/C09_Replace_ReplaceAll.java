package j10_StringManipulations;

import java.util.Scanner;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {
        /* replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
         *
         */
        String s = "javaCan'lara selam olsun java ile bolcana offer";
        System.out.println(s.replace('a', '@'));
        System.out.println(s.replace("can", "kan"));

        //ReplaceFirst
        //Replace ile ayni sadece ilk bulunani degistirir.
        System.out.println(s.replaceFirst("a", "@"));


        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler
        s = "javaCan'lara selam olsun :) java ile 1236543 offer";
        System.out.println(s.replaceAll("\\s", "*"));//javaCan'lara*selam*olsun*:)*java*ile*1236543*offer
        System.out.println(s.replaceAll("\\S", "*"));//************ ***** ***** ** **** *** ******* *****
        System.out.println(s.replaceAll("\\w", "*"));//*******'**** ***** ***** :) **** *** ******* *****
        System.out.println(s.replaceAll("\\W", "*"));//javaCan*lara*selam*olsun****java*ile*1236543*offer
        System.out.println(s.replaceAll("\\d", "*"));//javaCan'lara selam olsun :) java ile ******* offer
        System.out.println(s.replaceAll("\\D", "*"));//*************************************1236543******

        //task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz:");//cift isim
        String isim = scan.nextLine();

        System.out.println("lütfen soyisminizi giriniz:");
        String soyisim = scan.nextLine();

        System.out.println("lütfen 16 haneli kredi karti bilgilerinizi giriniz:");
        String kartno = scan.next();

        System.out.println(isim.charAt(0) + isim.substring(1, isim.indexOf(" ")).replaceAll("\\w", "*") + " " + isim.charAt(isim.indexOf(" ") + 1) + isim.substring(isim.indexOf(" ") + 1).replaceAll("\\w", "*"));
        System.out.println(soyisim.charAt(0) + soyisim.substring(1).replaceAll("\\w", "*"));
        System.out.println(kartno.substring(0, kartno.length() - 4).replaceAll("\\w", "*") + kartno.substring(kartno.length() - 4));

        System.out.println("Lütfen E-mail adresinizi giriniz: ");
        String email = scan.nextLine();
        String user = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@"));
        if(email.contains("@")){
            System.out.println("Username: " + user );
            System.out.println("Domainname: " + domain );
        }
        else
            System.out.println("Hatali email adresi girdiniz...");

    }
}
