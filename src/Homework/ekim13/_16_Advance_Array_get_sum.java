package Homework.ekim13;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */
        String str = "$12 $23 $10 $2 $5 $2";
        String yeni[] = str.replace("$", "").split(" ");
        System.out.println(Arrays.toString(yeni));
        int toplam = 0;
        for(int i = 0; i < yeni.length ; i++){
            toplam+=Integer.valueOf(yeni[i]);

        }
        System.out.println("toplam = " + toplam);


    }
}