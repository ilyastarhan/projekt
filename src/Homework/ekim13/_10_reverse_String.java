package Homework.ekim13;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String str = "Hello World";
        String yeni = "";
        for(int i=str.length()-1; i>=0; i--) {
            yeni+= str.charAt(i);
        }
        System.out.println(yeni);


    }
}