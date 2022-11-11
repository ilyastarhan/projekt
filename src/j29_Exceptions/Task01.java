package j29_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yeni sifrenizi giriniz: ");
        String password = scan.next();
        try {
            if(password.length() <6 || password.length() >10){
                System.out.println("sifreniz istenen karakter sayisini karsilamiyor");
                throw new IllegalArgumentException();
            }
            else System.out.println("Sifreniz kabul edildi" + password);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e);

        }

    }
}
