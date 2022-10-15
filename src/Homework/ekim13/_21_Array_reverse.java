package Homework.ekim13;

import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int num = scan.nextInt();
        String str[] = Integer.toString(num).split("");
        for(int i = str.length-1; i >= 0; i--){
            System.out.print(str[i]);

        }
    }
}


