package j35_Colloections.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class HomeWork3 {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(4,2,3,1,7));

        System.out.println(totalCount(set));
    }

    private static int totalCount(HashSet<Integer> set) {

        return set.size();
    }
}
