package j35_Colloections.C02_Set;

import java.util.*;

;

public class C02_Task {
    public static void main(String[] args) {

        /*
        Deger atamasi yapilan arrayi arrayliste ceviren method create ediniz

         */
        int[] arr = {1,3,5,7,9,11,13,15,17};
        HashSet<Integer> hs = new HashSet<>(arrayToArrayList(arr));
        LinkedList<Integer> ls = new LinkedList<>(arrayToArrayList(arr));
        TreeSet<Integer> ts = new TreeSet<>(arrayToArrayList(arr));

        System.out.println("hs = " + hs);
        System.out.println("ls = " + ls);
        System.out.println("ts = " + ts);
    }

    private static ArrayList<Integer> arrayToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int value : arr) {
            list.add(value);
        }
        return list;
    }
}
