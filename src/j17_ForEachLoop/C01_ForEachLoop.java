package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        /* for each loop for loop'un gelismis halidir.
        -clean code
        -okuma kolayligi
        -hata olasiligini azaltir

         */
        System.out.println("Task01");
        ArrayList<Integer> sayiList = new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        //task list elemanlarini ayri satirlara print ediniz
        for(Integer each : sayiList) {
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("Task02");
        for(Integer each : sayiList.subList(3,sayiList.size())) {
            if(each%2==1)
                System.out.print(each + " ");
        }
        System.out.println();
        System.out.println("Task03");
        int toplam=0;
        for(Integer each : sayiList.subList(2,6)){
            toplam+=each;
        }
        System.out.println(toplam);



    }
}
