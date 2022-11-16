package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {

        /*
        task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz
         */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(14,25,36,47,58,69,12,45,78));

        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()) {
            it.next();
        }
        while(it.hasPrevious()) {
            int a= it.previous();
            if(a%2==1){
                it.set(a*a);
            }
            else it.remove();
        }
        System.out.println("list = " + list);
    }
}
