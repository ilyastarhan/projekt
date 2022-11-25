package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task05 {
    public static void main(String[] args) {
        /*Projeler.TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

        */
        String input[][] = {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        ArrayList<String> isimList = new ArrayList<String>();

        for (String[] strings : input) {
            for (int j = 0; j < strings.length; j++) {
                isimList.add(strings[j]);
            }
        }
        Collections.sort(isimList);
        System.out.println("isimList = " + isimList);

    }
}
