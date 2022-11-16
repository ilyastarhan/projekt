package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {


        List<String> l1 = new ArrayList<String>(Arrays.asList("Nur","Gamze", "Erol","Bekir"));
        System.out.println("l1 List ilk hali : " +l1);

        //l1 elemanlari for loop ile yazdirma
        for(int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println("*******");
        System.out.println();
        //l1 elemanlari for each ile yazdirma
        for(String value : l1){
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("*******");
        System.out.println();

        //l1 herbir elemani for loop ile update edip print ediniz
        for(int i=0; i<l1.size(); i++){
            l1.set(i, l1.get(i)+" :)");
        }
        System.out.println("l1 = " + l1);
        // index desteklemeyen yapilarda tekrarlayan aksoíyon icin for each loop update yapamayabilir
        //bu duruma cözüm icin Iterator ile cözüm bulmustur.
        System.out.println("Iterator ile yazdirma");
        Iterator<String> iterator = l1.iterator();
        while(iterator.hasNext()){

            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        Iterator<String> iterator2 = l1.iterator();
        //Iterator ile elemanlari silme
        while(iterator2.hasNext()){
            iterator2.next();
            iterator2.remove();
        }
        System.out.println("l1 remove sonrasi = " + l1);

            List<String> l3 = new ArrayList<String>(Arrays.asList("Baran", "Gülsüm", "Akif", "Nazim"));
            ListIterator<String> it1 = l3.listIterator();
            while(it1.hasNext()){

                it1.set(it1.next() + " :)");
            }

            System.out.println(l3);


        List<String> l4 = new ArrayList<String>(Arrays.asList("Serhat", "Yakup", "Mustafa", "Nazli"));
        ListIterator<String> it4 = l4.listIterator();



            while(it4.hasNext()){
                it4.set(it4.next().toUpperCase().charAt(0) + "***");
                if(!it4.hasNext())
                    it4.add(l3.toString());
                }

            System.out.println(l4);
            }

}



