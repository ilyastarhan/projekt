package j36_Map;

import java.util.HashMap;

public class C01_HashMap {
    /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

    1) HashMap: HasMap key-value yapisini kullanir. Key ve value
                programci tarafindan yazilir. Key degeri benzersiz olmali dublicate kabul etmez

                Key ve value'da null degeri kullanilabilir. Key'de
                1'den fazla null degeri kullanilirsa Java son kullanilan
                null'i kabul eder. Value'da 1'den fazla null degeri
                kullanilabilir.
                HashMap console'a yazdirildiginda hem key degerleri hem de
                value degerleri aralarina = sembolu konularak yazdirilir
                HashMap'ler tanimlanirken rastgele siralama yapar
                HasMap map'ler arasinda en hizlisidir.
                HashMap'ler "thread safe" degildir.
     */
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        //map.put() -> girilen key, value datasi map'e eleman olarak eklenir
        hm.put("Amazon", "296 Euro");
        hm.put(null, "200 Euro");//key null deger kabul eder
        hm.put(null, "222 Euro");
        hm.put("Ebay", null);//value degeri null atanabilir
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan Computer", "111 Euro");
        hm.put("Apple Store", "333 Euro");
        hm.put("Apple Store", "500 Euro");//Apple store daki value 333 iken 500 olarak update edildi
        hm.put("MediaMarkt", "183 Euro");
        //map sout komutuna parametre olarak print edilir
        System.out.println("hm = " + hm);
    }
}
