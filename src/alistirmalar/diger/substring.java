package alistirmalar.diger;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen E-mail adresinizi giriniz: ");
        String email = scan.nextLine();
        String user = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);
        System.out.println(email.contains("@"));
        if(email.contains("@")){
            System.out.println("Username: " + user );
            System.out.println("Domainname: " + domain );
        }
        else
            System.out.println("Hatali email adresi girdiniz...");

    }
}
