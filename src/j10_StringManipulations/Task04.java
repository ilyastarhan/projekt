package j10_StringManipulations;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
 Task->
 Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
 ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
 name1= mehmet
 name2= ahmet
 Print ==> mehahmetmet
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk kelimeyi giriniz:");
        String s1 = scan.next();
        System.out.println("Lütfen ilk kelimeyi giriniz:");
        String s2 = scan.next();
        if(s1.length()%2==0){
            System.out.println(s1.substring(0, s1.length() / 2).concat(s2) + s1.substring(s1.length() / 2));
        }
        else{
            System.out.println("kelime2 kelime1 e eklenemez");
        }


    }
}
