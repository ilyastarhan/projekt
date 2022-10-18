package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {

        //replaceAll();-> liste belirli bir deger ile update eder.
        ArrayList<Integer> listSayi = new ArrayList<Integer>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        System.out.println("listSayi önceki hali = " + listSayi);
        Collections.replaceAll(listSayi,1,20);
        System.out.println("listSayi sonraki hali = " + listSayi);

        //fill();-> listedeki degerlerin hepsini yeni deger ile update eder.
        Collections.fill(listSayi, 33);
        System.out.println("listSayi 'fill' sonrasi = " + listSayi);


    }
}
