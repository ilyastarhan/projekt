package challange.Kasim.karisik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q01_SetTask {
    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        arrList.add(20);
        arrList.add(50);
        Set<Integer> setList = new HashSet<Integer>();

        addSetFromArrayList(arrList, setList);
        Set<Character> charSet = new HashSet<Character>();
        addCharacterToSet(charSet, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i');




    }

    private static void addCharacterToSet(Set<Character> charSet, char ...a) {
        for(char value : a){
            charSet.add(value);
        }
        System.out.println(charSet);
    }

    private static void addSetFromArrayList(ArrayList<Integer> arrList, Set<Integer> setList) {

        for(Integer value : arrList){
            setList.add(value);
        }
        System.out.println(setList);
    }
}
