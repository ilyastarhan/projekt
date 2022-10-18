package challange.Day11;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {

        /*
Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
String s= Apex,nesne yonelimli bir programlama dilidir"       */

        String s= "Apex,nesne yonelimli bir programlama dilidir";
        String arr[] = s.replaceAll("\\W", "").split("");
        String unluler [] = {"a","e","i","u","ü","o","ö"};
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for(int i=0; i<arr.length ; i++){
            for(int j=0; j<unluler.length ; j++){
                if(arr[i].equalsIgnoreCase(unluler[j]))
                count++;
            }
    }
        System.out.println(count);
    }
}
