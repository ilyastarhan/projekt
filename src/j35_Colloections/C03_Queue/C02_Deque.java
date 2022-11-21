package j35_Colloections.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    /*
    Deque: Double Enden Queue -> Queue'larda FIFO Deque'lerde hem FIFO hem LIFO gecerlidir
    LIFO-> Last in First out
    FIFO-> First in First out
     */
    public static void main(String[] args) {
        Deque<String> dq1 = new LinkedList<>(Arrays.asList("Küsleme", "Önkol", "Böbrek yatagi", "Ezme", "Haydari"));
        System.out.println("dq1 = " + dq1);
        dq1.add("Humus");
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.getFirst() = " + dq1.getFirst());
        System.out.println("dq1.getLast() = " + dq1.getLast());

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        System.out.println("dq1.peekLast() = " + dq1.peekLast());
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.pollFirst() = " + dq1.pollFirst());
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.pollLast() = " + dq1.pollLast());
        System.out.println("dq1 = " + dq1);
        dq1.clear();
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        System.out.println("dq1.pollFirst() = " + dq1.pollFirst());
        Deque<String> dq2 = new LinkedList<>(Arrays.asList("Havuc dilimi", "Güllac", " Kazan dibi", "Trilice", "Baklava"));
        dq2.clear();
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());
        System.out.println("dq2.pollLast() = " + dq2.pollLast());
      //  System.out.println("dq2.removeFirst() = " + dq2.removeFirst());
      //  System.out.println("dq2.removeLast() = " + dq2.removeLast());

    }
}
