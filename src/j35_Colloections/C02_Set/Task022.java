package j35_Colloections.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task022 {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Salim");
        ts.add("Ebubekir");
        ts.add("Merve");
        ts.add("Sena");
        ts.add("Fatih");
        ts.add("Cüneyt");
        System.out.println(System.currentTimeMillis() - time);

        long time2 = System.currentTimeMillis();;
        HashSet<String> hs = new HashSet<String>();
        hs.add("ahmet");
        hs.add("sekir");
        hs.add("fesmekan");
        hs.add("sermiyan");
        hs.add("hasan");
        hs.add("ilyas");
        System.out.println(System.currentTimeMillis()-time2);

    }
}
