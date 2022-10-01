package j10_StringManipulations;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String s = scan.nextLine();
        System.out.println("Kacinci karakter: ");
        int karakter = scan.nextInt();
        if (s.length() > karakter) {

            System.out.println(s.charAt(karakter));

        } else {
            System.out.println("istenen karakter sirasi kelimenin sinirlari disindadir");
        }
    }}