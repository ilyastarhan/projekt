package challange.Kasim28.extra;

import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues {

    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

    public static void main(String[] args) {
        HashMap<String,Integer> ulke = new HashMap<>();
        ulke.put("Almanya", 80);
        ulke.put("Turkiye", 83);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 68);
        ulke.put("Kanada ", 40);

        System.out.println("ulke = " + ulke);
        System.out.println("ulke.keySet() = " + ulke.keySet());
        System.out.println("ulke.values() = " + ulke.values());

        int count = 0;
        for(Integer value : ulke.values()) {
            if(value>=50)
                count++;
        }
        System.out.println("count = " + count);

        int sum = 0;
        for(Integer value : ulke.values()){
            sum+=value;
        }
        System.out.println("sum = " + sum);

        for(Map.Entry<String, Integer> value : ulke.entrySet()){
            System.out.println(value.getKey() + ": " + value.getValue());
        }
    }
}


