package j35_Colloections.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<String>(Arrays.asList("javaCan", "Ebubekir", "Gülsüm", "Ebubekir", "Adem", "Ilker", "javaCan", "Merve"));
        //LinkedList remove(); ilk node silinir ve silinen node return eder
        System.out.println("ll1.remove(\"javaCan\") = " + ll1.remove("javaCan"));
        System.out.println("ll1 = " + ll1);
        System.out.println("ll1.remove(1) = " + ll1.remove(1));
        System.out.println("ll1 = " + ll1);
        System.out.println("ll1.remove(\"Merve\") = " + ll1.remove("Merve"));
        System.out.println("ll1.remove(\"Ilyas\") = " + ll1.remove("Ilyas"));
        System.out.println("ll1 = " + ll1);
        System.out.println("ll1.removeFirstOccurrence(\"Ebubekir\") = " + ll1.removeFirstOccurrence("Ebubekir"));
        System.out.println("ll1 = " + ll1);
        System.out.println("ll1.element() = " + ll1.element());

        LinkedList<String> ll2 = new LinkedList<String>(Arrays.asList("javaCan", "Ebubekir", "Gülsüm", "Ebubekir", "Adem", "Ilker", "javaCan", "Merve"));
        LinkedList<String> ll3 = new LinkedList<String>(Arrays.asList("Hasan", "Harun", "Haluk", "Hasmayan"));
        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);
        System.out.println("ll2.removeAll(ll3) = " + ll2.removeAll(ll3));
        System.out.println("ll2 = " + ll2);
        // LinkedList get() getFirst() getLast() girilen index ve ilk son node return eder
        System.out.println("ll2.get(2) = " + ll2.get(2));
        System.out.println("ll2.getFirst() = " + ll2.getFirst());
        System.out.println("ll2.getLast() = " + ll2.getLast());


    }


}
