package j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    /*
         HasTable->thread safe and synchronized
         HashMap'te kullanilan tüm methodlar hashTable obj ile call edilir
         1- HashMap ve TreeMap thread-safe ve synchronized olmadigi icin HashTable tanimlanmistir.
         2- HashTable HashMap'e göre daha yavastir.
         3- HashTable key ve value lerde null degere izin vermez
         4- HashTable eleman atamasi yapilirken HashMap random yapar

          */
    public static void main(String[] args) {

        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("Kebab", "Adana");
        ht.put("Döner", "Ankara");
        ht.put("Köfte", "Tekirdag");
        ht.put("Beyran", "Gaziantep");
        ht.put("Ciger", "Diyarbakir");
        ht.put("sögüs", "");

        System.out.println(ht);//{Beyran=Gaziantep, Ciger=Diyarbakir, Kebab=Adana, sögüs=, Köfte=Tekirdag, Döner=Ankara}
        ht.put("Döner", "Dönerse senindir");//update eder
        //ht.put("sogüs", null);// value null degeri almaz
        //ht.put(null, "Diyarbakir");// key null degeri almaz
        System.out.println("ht = " + ht);

        Hashtable<String ,String > ht1 = new Hashtable<>();
        ht1.put("salata","patlıcan közleme");
        ht1.put("ara sıcak","içli küfte");
        System.out.println("ht1 = " + ht1);//{salata=patlıcan közleme, ara sıcak=içli küfte}

        ht.putAll(ht1);
        System.out.println("ht = " + ht);//{köfte=tekirdağ, salata=patlıcan közleme, söğüş=, çorba=beyran, döner=dönerse senindir :) , ara sıcak=içli küfte, kebab=adana}
        System.out.println("ht1 = " + ht1);

    }
}
