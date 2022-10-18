package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Ömer"));
        ArrayList<String> yeniList = new ArrayList<>();
        for(int i = 0 ; i < list.size() ; i++) {
            if(!list.get(i).toLowerCase().contains("a")){
                yeniList.add(list.get(i));
            }
        }
        System.out.println("yeniList = " + yeniList);

        list.clear();
        list.addAll(yeniList);
        System.out.println("list = " + list);
    }
}
