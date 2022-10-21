package Homework.ekim18;

import java.util.ArrayList;
import java.util.Arrays;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println(rotateList(strList));

    }

    private static ArrayList<String> rotateList(ArrayList<String> strList) {
        ArrayList<String> rotateList = new ArrayList<String>();
        for(int i = 0; i < strList.size(); i++) {
            rotateList.add(strList.get(strList.size()-1-i));
        }

        return rotateList;
    }
}

