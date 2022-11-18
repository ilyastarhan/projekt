package j35_Colloections.C01_LinkedList;

import java.util.LinkedList;

public class Task {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("yakup");
        list.add("javaCAN");
        list.add("javaTAR");
        list.add("Tekinay");


        System.out.println(list);
        if(list.remove("javaTAR"))
            System.out.println("Agam eleman listeden cikartildi");

        else
            System.out.println("Aradiginiz eleman bulunamadi");
        System.out.println(list);
    }
}
