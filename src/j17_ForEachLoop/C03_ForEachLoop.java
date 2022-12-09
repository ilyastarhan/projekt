package j17_ForEachLoop;

import java.util.ArrayList;

public class C03_ForEachLoop {
    public static void main(String[] args) {

     String arr[] = {"nazim", "gülsüm","dilek","erol","cüneyt", "cigdem"};
     String arr2[] = {"musty", "gülsüm","ayse","enise","cüneyt", "cigdem"};
     ArrayList<String> arr3 = new ArrayList<String>();
     for(String each : arr){
         for(String each1 : arr2){
             if(each.equalsIgnoreCase(each1)){
                 arr3.add(each1);
             }

         }
     }
     if(arr3.isEmpty()) {
         System.out.println("ortak isim yok!");
     }else{
         System.out.println(arr3);

     }








    }
}
