package challange.Day05;

import java.util.Scanner;

public class Q11_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
// Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("String giriniz : ");
        String str = scan.nextLine();
        if (str.length()>0) {
            if (str.contains(" ")) {
                System.out.println("içinde boşluk var");
            }else {
                System.out.println("içinde boşluk yok");
            }
        }else {
            System.out.println("string boş");
        }
    }
}
