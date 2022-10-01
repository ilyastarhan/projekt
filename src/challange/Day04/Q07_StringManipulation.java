package challange.Day04;

import java.util.Scanner;

public class Q07_StringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String s1 = scan.next().toLowerCase();
        boolean sonuc ;
        if(s1.contains("xyz")){
            sonuc = true;
            System.out.println(sonuc);
        }
        else sonuc = false;
        System.out.println(sonuc);
    }
}
