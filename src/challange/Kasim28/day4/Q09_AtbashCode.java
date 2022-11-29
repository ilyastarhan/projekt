package challange.Kasim28.day4;

import java.util.Scanner;

public class Q09_AtbashCode {

    /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sifrelemek isteginiz ifadeyi giriniz: ");
        String str = scan.nextLine().toLowerCase();
        for(int i = 0; i<str.length(); i++){
            int index= 'z'-str.charAt(i);
            System.out.print((char)('a'+index));
        }

    }
}
