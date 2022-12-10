package j99_Lambda;

import java.util.ArrayList;
import java.util.List;

public class deneme3 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");

        // S1: ilk harfi d ve ya c olanlari listeleyelim
        list.stream().filter(t-> t.charAt(0)=='c' || t.startsWith("d")).forEach(t-> System.out.print(t+ " "));



        //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
        System.out.println();
        list.stream().forEach(t-> System.out.print("*" + t + "*"));
        System.out.println();
        //S3: alfabetik  olarak siralayalim list olarak
        list.stream().sorted().forEach(t-> System.out.print(t+ " "));
        System.out.println();
        //S4: tum 'l' leri silelim yazdiralim
        list.stream().map(t-> t.replaceAll("l", "")).forEach(t-> System.out.print(t+ " "));
        System.out.println();

        //S5 : icinde e olanlardan yeni bir list olusturunuz

        list.stream().filter(t-> t.contains("e")).forEach(t-> System.out.print(t+ " "));
        System.out.println();

        // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
        list.stream().map(t-> (t.charAt(0)+"").repeat(2) + t).forEach(t-> System.out.print(t+ " "));
        System.out.println();



        // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz

        list.stream().filter(t-> t.length()!=4 && t.length()!=6).forEach(t-> System.out.print(t+" "));
        System.out.println();
        list.stream().filter(t-> !(t.length()==4 || t.length()==6)).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    // S1: ilk harfi d ve ya c olanlari listeleyelim


    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim

    //S3: alfabetik  olarak siralayalim list olarak ***sorted()

    //S4: tum 'l' leri silelim yazdiralim ***map(replaceAll)


    //S5 : icinde e olanlardan yeni bir list olusturunuz  *** filter(contains())  collect()

    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi



    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz



    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz


}
