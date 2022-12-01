package j15_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class deneme {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("to", "be", "or", "not", "to", "be", "hamlet"));
        ArrayList<String> list2 = new ArrayList<>();
        for(int i = 0; i<list.size()-1; i+=2){
            list2.add(i, list.get(i+1));
            list2.add(i+1, list.get(i));
            if(i==list.size()-2){
                list2.add(i+2, list.get(i+2));
                break;
            }

        }System.out.println(list2);
    }
}
