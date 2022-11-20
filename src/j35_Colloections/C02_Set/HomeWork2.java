package j35_Colloections.C02_Set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class HomeWork2 {
    public static void main(String[] args) {
        String str1 = "Germany";
        String str2 = "USA";
        LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList("Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));

        System.out.println(removing(set, str1, str2));
    }

    private static LinkedHashSet<String> removing(LinkedHashSet<String> set,String str1,String str2) {
        set.remove(str1);
        set.remove(str2);

        return set;
    }
}
