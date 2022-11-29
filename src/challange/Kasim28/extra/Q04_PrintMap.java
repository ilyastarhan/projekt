package challange.Kasim28.extra;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q04_PrintMap {
       /*
    10, Java
    20, PHP
    2,  Python
    57, C++
    89, C#
    40, Javascript
    Map kullanarak yazınız
     */

    public static void main(String[] args) {
        Map<Integer,String> map =new LinkedHashMap<>();
        map.put(10,"Java");
        map.put(20,"PHP");
        map.put(2,"Python");
        map.put(57,"C++");
        map.put(89,"C#");
        map.put(40,"Javascript");


        //1.yol ->
        System.out.println("map = " + map);

        //2.yol ->
        for(Integer each : map.keySet()){
            System.out.println(each + "," + map.get(each));
        }

        //3.yol ->
        for(Map.Entry<Integer, String> each : map.entrySet()){
            System.out.println(each.getKey() + "," + each.getValue());
        }
    }
}
