package alistirmalar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> kelimeSayisi = new HashMap<>();
        System.out.println("Metin gir:");
        String metin = scan.nextLine();
        String[] kelime = metin.replaceAll("\\W", "").split("");

        for (String key : kelime) {
            if (!kelimeSayisi.containsKey(key)) {
                kelimeSayisi.put(key, 1);
            } else kelimeSayisi.put(key, kelimeSayisi.get(key) + 1);
        }
        System.out.println(Arrays.asList(kelimeSayisi));
        for(Map.Entry<String, Integer> w : kelimeSayisi.entrySet()) {
            System.out.print(w.getKey() + "=" + w.getValue() + " ");
        }

    }


}


