package challange.Day11;

import java.util.ArrayList;
import java.util.Arrays;

public class Q09_Arraylist {
    public static void main(String[] args) {


    /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */
        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(12, 11, 12, 15, 12, 34, 43));
        for (Integer each : listSayi) {
            if(each==12){
                listSayi.set(listSayi.indexOf(each),21);
            }
        }
        System.out.println(listSayi);

    }
}
