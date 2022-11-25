package Homework.ekim18;


import java.util.ArrayList;
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
        int arr[] = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        ArrayList<Integer> arrList = new ArrayList<Integer>(List.of(1,2,2,3,1,4,2,5,6,8,7,5,9,1));
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    arrList.remove(j);
                }
            }
        }
        System.out.println("arrList = " + arrList);


    }

}
