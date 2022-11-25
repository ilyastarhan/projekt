package Homework.Ekim17;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* Projeler.TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        int arr[] = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
        List<Integer> sayiListem = new ArrayList<>(List.of(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));
        for (int i = 0; i < sayiListem.size(); i++) {
            for (int j = i + 1; j < sayiListem.size(); j++) {
                if (sayiListem.get(i) == sayiListem.get(j))
                    sayiListem.remove(j);
            }
        }
        Collections.sort(sayiListem);
        Object yeniList []=sayiListem.toArray();
        System.out.println(Arrays.toString(yeniList));

    }
}
