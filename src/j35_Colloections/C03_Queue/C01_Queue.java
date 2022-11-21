package j35_Colloections.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    /*
        Queue collection interface oldugu icin child class olan linkedlist ve PriorityQueue
        ile obje üretilir
        Eczane yemakhane ve belirli sart ile aksiyon alan elemanlar icin kullanilir
        Cons secimine göre queue obje özellikleri belirlenir.
        FIFO-> first in first out -> COllectiona ilk giren ilk cikar
        Eleman en sona eklenir en bastan silinir

         */
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>(Arrays.asList("Cebrail", "Abdülaziz", "Sümeyra", "Yakup", "Muharrem"));
        System.out.println("q1 = " + q1);//[Cebrail, Abdülaziz, Sümeyra, Yakup, Muharrem]
        q1.add("Erol");
        System.out.println("q1 = " + q1);//[Cebrail, Abdülaziz, Sümeyra, Yakup, Muharrem, Erol]

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("Cebrail", "Abdülaziz", "Sümeyra", "Yakup", "Muharrem"));
        System.out.println("q2 = " + q2);//[Abdülaziz, Cebrail, Sümeyra, Yakup, Muharrem]
        q2.add("Erol");
        System.out.println("q2 = " + q2);//[Abdülaziz, Cebrail, Erol, Yakup, Muharrem, Sümeyra]

        System.out.println("q1.peek = " + q1.peek());
        System.out.println("q2.peek = " + q2.peek());
        System.out.println("q1.poll = " + q1.poll());
        System.out.println("q2.poll= " + q2.poll());
        System.out.println("q1.remove() = " + q1.remove());
        System.out.println("q1 = " + q1);
        System.out.println("q2 = " + q2);
        //peek()-> copy-paste gibi ilk elemani return eder ama silmez
        //poll()->cut-paste gibi ilk elemani siler ver return eder
        //element()-> ilk elemani silmeden return eder
        //remove()-> ilk elemani siler ve return eder
        //poll() ve remove() farki-> eger queue coll bos ise remove NoSuchElementException verir
        //poll ise null return eder
        q1.clear();
        System.out.println("q1 = " + q1);
        System.out.println("q1.size() = " + q1.size());
        System.out.println("q1.poll() = " + q1.poll());
        System.out.println("q1.peek() = " + q1.peek());
        //System.out.println("q1.remove() = " + q1.remove());

        //offer()-> bu method collectiona eleman eklemek icin kullanilir
        q1.offer("Küsleme");
        System.out.println("q1 = " + q1);
        /*
        offer() ve add() farki-> eger queue collection da eleman kisitlamasi yapilmis ise
        add() Exception firlatir.
        offer() ise true-false döner
         */
    }
}
