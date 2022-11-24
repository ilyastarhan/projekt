package j36_Map;

import java.util.HashMap;
import java.util.Scanner;

public class Task07 {
    /*
    ismi update() olan bir method oluşturun.
    Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
    return tipi  Integer - String HashMap
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyin.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"

    int = 3
    String = Miami
    cevap aşağıdaki gibi olmalı:
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "New Jersey");
        map.put(2, "New York");
        map.put(3, "London");
        map.put(4, "Paris");
        Scanner scan = new Scanner(System.in);
        System.out.println("key girin: ");
        int key = scan.nextInt();
        System.out.println("Value girin: ");
        scan.nextLine();
        String value = scan.nextLine();
        System.out.println(update(map, key, value));


    }

    public static HashMap<Integer, String> update(HashMap<Integer, String> map, int sayi, String str) {

        if (map.containsKey(sayi)) {
            map.put(sayi, str);
        }
        return map;


    }
}
