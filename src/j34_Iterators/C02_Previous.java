package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {

    /*
    hasPrevious() methodu icin mutlaka hasNext() ve next() methodlari calistirilarak
    pointer en sona getirilmelidir.

    ITERATOR ve LISTITERATOR FARKLARI
    1- Iterator-> sadece hasNext(), next(), remove() methodlari vardir
        ListIterator-> yukardakilere ek olarak hasPrevious(), previous(), add(), set() gibi methodlar da icerir
    2- Iterator-> tüm collection icin tanimlanabilir(list, set,array,map..)
        ListIterator->sadece List yapilarda tanimlanabilir
    3- Iterator->sadece bastan sona gidebilir
        ListIterator-> bastan sona sonrasinda sondan basa cift yönlü haraket edebilir
    4- Iterator-> kapsami genis ancak methodlari azdir
        ListIterator->kapsami dar ancak methodlari fazladir
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(24,12,56,32,41,78,96,10));
        ListIterator<Integer> it1 = list.listIterator();
        while(it1.hasNext()) {
            it1.next();
            }
        while(it1.hasPrevious()){
            System.out.print(it1.previous() + " ");
        }


        List <String> list2 = new ArrayList<String>(Arrays.asList("Cagla","Ugur","Muharrem","Cebrail"));
        System.out.println(list2);
        ListIterator<String> it2 = list2.listIterator();
        while(it2.hasNext()){
            String s = it2.next();
            if(!it2.hasNext()){
                it2.set(s+ " :)");}

        }
        System.out.println(list2);

    }
}
