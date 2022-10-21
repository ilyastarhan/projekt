package Homework.ekim18;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        String s1 = "blue";
        String s2 = "yellow";
        System.out.println(changeInArraylist(arrList, s1, s2));


    }

    private static ArrayList<String> changeInArraylist(ArrayList<String> arrList, String s1, String s2) {
        for(String each: arrList) {
            if(each.equalsIgnoreCase(s1)){
                arrList.set(arrList.indexOf(s1),s2);
            }

        }
        return arrList;
    }
}
