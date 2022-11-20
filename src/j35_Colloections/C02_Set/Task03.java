package j35_Colloections.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task03 {
        /*
        commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
        return tipi arraylist olmalı.
        ÖRNEĞİN:
        İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
        İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
        Ortak değerleri ArrayListe ekleyiniz.
        çıktı:  "Germany" , "Brazil" ,"USA"
        ArrayListi yazdırınız.
         */

    public static void main(String[] args) {

        HashSet<String> hs1 = new HashSet<String>(Arrays.asList("Germany" , "England" , "South Africa" , "Brazil" , "USA"));
        HashSet<String> hs2 = new HashSet<String>(Arrays.asList("Germany" , "China" , "Brazil" , "France" ,  "USA"));
        System.out.println(commonValues(hs1, hs2));

    }

    private static ArrayList<String> commonValues(HashSet<String> hs1, HashSet<String> hs2) {
        hs1.retainAll(hs2);
        ArrayList<String> list = new ArrayList<String>(hs1);
        return list;
    }
}
