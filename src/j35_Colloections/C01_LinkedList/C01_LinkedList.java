package j35_Colloections.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
        /*
        LinkedList
        1- LinkedList de elemanlar "data" ve"adress" olmak üzere 2 kisimdan olusur ve eleman yerine "node" olarak tanimlanir
        2- LinkedList de ilk "node" data barindirmayan sadece adres bulunduran "head node" tanimlanmistir
        3- LinkedList de son "node" adres barindirmayan sadece data bulunduran "tail node" tanimlanmistir.
        4- ArrayList searching LinkedList node ekleme ve cikarmada daha avantajlidir.
            LInkedList eleman bulmada index list olmadigi icin daha yavastir
        5- LinkedList ->> tren-vagon iliskisi gibi dusunulebilir
        6- Collection obj tanimlanirken constructor Class(LinkedList,ArrayList,...) olmali interface (List, Set, Queue) olmamasinda dikkat edilir
            ancak obj datatype olarak parent Interface tanimlanabilir
        7- LinkedList class iki tane parent Interface implement etmistir. -> List -> Queue

         */
    public static void  main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<String>(Arrays.asList("Ebubekir", "Gülsüm", "Adem", "Ilker", "Merve"));
        // LinkedList print etme
        System.out.println("ll1 = " + ll1);
        // LinkedList add();
        ll1.add("Selim");
        System.out.println("ll1 = " + ll1);
        ll1.add(3, "Ugur");
        System.out.println("ll1 = " + ll1);
        ll1.addFirst("Abdülaziz");
        ll1.addLast("JavaCAN");
        System.out.println("ll1 = " + ll1);

        List<String> ll2 = new LinkedList<>(Arrays.asList("Fatih", "Erol", "Nur"));
        ll1.addAll(ll2);
        System.out.println("ll1 = " + ll1);
        ll1.addAll(3,ll2);
        System.out.println("ll1 = " + ll1);

    }
}
