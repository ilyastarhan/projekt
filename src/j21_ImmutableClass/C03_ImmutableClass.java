package j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClass {
    public static void main(String[] args) {
        /*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
 */

        String name = "Merve";
        System.out.println("name = " + name);
        name.concat(" javacan");
        System.out.println("name = " + name);

        List<String> list = new ArrayList<String>();
        System.out.println("list = " + list);
        list.add("Fatih");
        list.add("Erkan");
        list.add("Serhat");
        list.remove(1);
        list.set(1, "Javacan");
        System.out.println("list = " + list);

    }
}
