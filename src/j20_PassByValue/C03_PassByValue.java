package j20_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /* java non-primitive data türlerinde objenin kendisi degil de datalari degisirse
        obje referans ve kendisi degismedigi datalari degisikligini kalici yapar.
         */
        //
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(24, 20,87));
        System.out.println(list);
        listSet(list);
        listGet(list);
        System.out.println("list = " + list);
    }

    private static void listSet(ArrayList<Integer> list) {
        for(Integer i : list) {
            i*=2;
        }
        System.out.println(list);

    }

    private static void listGet(ArrayList<Integer> list) {
        for(int i =0; i<list.size(); i++) {
            list.set(i, list.get(i)*2);
        }
        System.out.println(list);
    }
}
