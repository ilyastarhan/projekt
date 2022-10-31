package j23_Varargs_StringBuilder.Varargs;

import java.util.Scanner;

public class Task01 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Task ->
        verilen Stringleri birlestiren concat isimli METHOD create ediniz.
        input : "m", "e", "r", "v", "e";
        output : merve
         */
        String a = "ahanade";
        System.out.println(a.substring(5, 6));
        String[] arr = {"m", "e", "r", "v", "e"};
        String[] arr2 = {"a", "l", "i"};
        isimConcat(arr);
        isimConcat(arr2);

        isimConcat("v", "e", "l", "i", " ", "a", "b", "i");
/*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.

         */
        System.out.println(toplaCarp(25, 52, 45, 63, 72));

            /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */
/*
Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
 */
        System.out.println("carpmak istediginiz sayiyi giriniz");
        sonuc1(scan.nextInt(), stringGir());


    }

    private static void sonuc1(int a, int b) {
        System.out.println(a * b);
    }
    private static int stringGir() {
        int max = 0;
        System.out.println("String uzunlugunu giriniz: ");
        String[] arr = new String[scan.nextInt()];
        for (int i =0 ; i < arr.length ; i++) {
            System.out.println("isim giriniz: ");
            arr[i] = scan.next();
        }
        for(String value : arr){
            if(value.length() > max){
                max = value.length();
            }
        }
        return max;

    }

    private static void sonuc(int a, String...b){
        String str = "";

        for(String value : b){
            if(value.length() > str.length()){
                str = value;
            }
        }
        System.out.println(str.length() * a);

    } {
    }

    private static int toplaCarp(int a, int...b) {
        int toplam =0;

        for(int value : b) {
            toplam+=value;
        }
       return a*toplam;
    }

    private static void isimConcat(String... str) {
        String result = "";
        for(String value : str) {
            result+=value;
        }
        System.out.println(result);
    }
}
