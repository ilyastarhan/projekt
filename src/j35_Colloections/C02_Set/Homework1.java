package j35_Colloections.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Homework1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("banana" , "strawberry" , "kiwi" , "pineapple"));
        String a = "banana";
        String b = "peach";

        System.out.println(changeSet(set, a, b));
    }

    private static HashSet<String> changeSet(HashSet<String> set, String a, String b) {
        if(set.contains(a)) {
            set.remove(a);
            set.add(b);
        }
    return set;
    }
}
