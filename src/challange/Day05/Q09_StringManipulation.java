package challange.Day05;

import java.util.Scanner;

public class Q09_StringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz: ");
        String s = scan.nextLine();
        if(s.length()%2 != 0 && s.length()>=3){
            System.out.println(s.charAt((s.length()-1) / 2));
        }
        else {
            System.out.println("Kelime cift sayida karakter iceriyor veya 3 den az karakter girdiniz...");



/*
  Kullanicidan bir kelime girmesini isteyin.
  * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
  * kelimenin ortasindaki karakteri yazdirin.
  */
    }
}}