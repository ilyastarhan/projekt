package Homework.Ekim17;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    /* Projeler.TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        ArrayList<Integer> sayiList = new ArrayList<>(List.of(3, 5, 1, 2, 7, 9, 2, 3, 5, 7 ));
        ArrayList<Integer> yeniList = new ArrayList<>();

        for(int i=0; i<yeniList.size();){
            int toplam=0;
            for(int j=i; j<i+2; j++){
                toplam+=sayiList.get(j);


            }
            i++;
            yeniList.add(toplam);
        }
        System.out.println(yeniList);


    }
}

