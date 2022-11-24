package j99_Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class C02_filter {
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n)-> System.out.print(n*n + " ");
        numbers.forEach(method);
    }
}
