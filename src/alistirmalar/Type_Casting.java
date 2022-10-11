package alistirmalar;

import java.util.Scanner;

public class Type_Casting {

    public static void main(String[] args) {
        // Soru 8 ) Interview Question Kullanicidan bir String isteyin
        //          ve Stringi tersine ceviren bir method yazin.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
        String str = scan.nextLine();

        // Fatih

        System.out.println(tersineCevir(str));

        scan.close();
    }

    public static String tersineCevir(String str) {
        String tersStr="";

        for (int i = str.length()-1; i >=0; i--) {


            tersStr+=str.charAt(i);


        }


        return tersStr;
    }

}