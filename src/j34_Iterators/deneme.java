package j34_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class deneme {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println(list);
        ListIterator<Integer> it = list.listIterator();
        int idx = 0;
        while (it.hasNext()) {
            Integer el = it.next();
            if(idx>2){
                break;
            }
            it.set(el = el*2);
            System.out.print(el + " ");
            idx++;
        }
    }
}
