package challange.Kasim28.day5;

import java.util.*;

public class Q07_ConvertingCollectionsTask {

    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Random rand = new Random();
        for(int i=0; i<10; i++){
            arr[i] = rand.nextInt(10);
        }
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
        System.out.println(list);


    }
}
