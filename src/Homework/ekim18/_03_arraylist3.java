package Homework.ekim18;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<String>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        System.out.println("girdinginiz listedeki elemanlarin uzunluklari : " + getLength(strList));


    }

    private static ArrayList<Integer> getLength(ArrayList<String> strList) {
        ArrayList<Integer> elemanUzunluk = new ArrayList<Integer>();
        for(String each : strList){
            elemanUzunluk.add(each.length());
        }
        return elemanUzunluk;
    }
}