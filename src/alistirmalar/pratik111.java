package alistirmalar;

import java.util.ArrayList;
import java.util.List;

public class pratik111 {
    public static void main(String[] args) {
        String a = "";
        a+=2;
        System.out.println(a);
        a+='c';
        System.out.println(a);
        a = a + false;
        System.out.println(a);
        if(a=="2cfalse") System.out.println("==");
        if(a.equals("2cfalse")) System.out.println("eqauls");
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.set(1,6);
        list.remove(0);
        for(Integer v : list);


    }
}
