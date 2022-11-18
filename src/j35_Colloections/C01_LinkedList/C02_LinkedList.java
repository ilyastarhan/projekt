package j35_Colloections.C01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {

    // Linkedlist de Object datatype tavsiye edilmez, yavaslatir
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<Object>();
        list.add("Nazim");
        list.add('$');
        list.add(1453);
        System.out.println("list = " + list);
    }
}
