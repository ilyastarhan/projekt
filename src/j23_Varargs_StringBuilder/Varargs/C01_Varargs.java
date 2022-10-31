package j23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {

    /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        meyhod budy....
        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

        // Task -> verilen iki toplamını print eden METHOD create ediniz

        int num1 = 24;
        int num2 = 27;
        int num3 = 46;
        int num4 = 10;
        toplam( 'c', "Hi","hello");

        System.out.println(uzunluk("ahmet", "mehmet", "Selamalar", "agam"));


    }

    private static String uzunluk(String... a) {
        String str = "";
        for(String value: a) {
            if(value.length()>str.length()){
            str = value;
            }
        }
        return str;

    }

    public static void toplam( char c, String... a) {
        int toplam = 0;
        for(String i:a){
            System.out.println(i);
        }
        System.out.println(c);
        System.out.println(toplam);

    }
    public static void toplam(int a, int...b){
        System.out.println(b.length);

    }
}