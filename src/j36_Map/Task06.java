package j36_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task06 {
    /*
map1() isminde bir method oluşturun.
Parametresi   bir Integer -String map  ve bir int
return tipi String
Tamsayı değerlerini (int) döndürün.
ÖRNEK:
Map:
                1 ,  "Lion"
                2 ,  "Tiger"
                3 ,  "Elephant"
                4 ,  "Cat"
                5  , "Dog"
Integer 3
Cevap Elephant olmalı.
 */
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "lion");
        hm.put(2, "Tiger");
        hm.put(3, "Elephant");
        hm.put(4, "Cat");
        hm.put(5, "Dog");
        Scanner scan = new Scanner(System.in);
        System.out.println("\"sayi giriniz\" = " + "sayi giriniz");
        int a = scan.nextInt();
        System.out.println("map1(hm,a) = " + map1(hm, a));

    }

    private static String map1(HashMap<Integer, String> hm, int a) {


        return hm.get(a);

    }
}
