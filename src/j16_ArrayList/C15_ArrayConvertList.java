package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        // Array'dan cevrilen List array kaynakli oldugu icin array davranisi gösterir
        //boyut sabittir dolayisiyla remove add methodu calismaz.
        String arrJavaCan[] = {"Akif", "Gamze", "Musty", "Sevde Nur"};
        int arr[] = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<String> listJavatar = Arrays.asList(arrJavaCan);
        System.out.println("listJavatar = " + listJavatar);
        System.out.println("listJavatar.size() = " + listJavatar.size());

        //list data type ArrayList tanimlanirsa RTE vermez kaynagi array de olsa list davranir boyut esnekligi yapar
        ArrayList<String> listJavatar1 = new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavatar1.add("haluk");
        System.out.println("listJavatar1 = " + listJavatar1);


    }
}
