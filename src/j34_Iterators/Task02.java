package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task02 {
    public static void main(String[] args) {
        /*  task->
   Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
   elementleri silip print eden code create ediniz
   (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]
    */
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 13, 56, 23, 45, 14, 40));
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int a = it.next();
            if (a >= 40 || a <= 20)
                it.remove();
        }
        System.out.println("list = " + list);
    }

}

