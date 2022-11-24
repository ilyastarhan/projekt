package j35_Colloections.Tekrar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet_LinkedHashSet_TreeSet {

    public static void main(String[] args) {

        HashSet h = new HashSet();
        h.add("Ahmet");
        h.add(123);
        h.add(true);
        h.add(true);
        System.out.println(h);
        Iterator itr = h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedHashSet gunler = new LinkedHashSet();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        gunler.add("Sali");
        gunler.forEach(x-> System.out.println(x));
        gunler.remove("Sali");
        System.out.println(gunler);

        TreeSet tree = new TreeSet();


    }
}
