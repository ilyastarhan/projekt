package challange.Kasim21;

import java.util.ArrayList;
import java.util.Random;

public class Q02 {

    /*
    Q02_CreateRandomList_SetList
     int array list oluşturun 10 elemandan oluşmalı
     random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
     bu metod array list içinde 0' dan 20 ye kadar değer atasın.
     eğer çift sayı atarsa o elemanının yerine 111 yazsın
     eğer çift sayı yoksa çift sayı yoktur mesajını versin.
     */
    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        randomEkle(arrList);


    }

    private static void randomEkle(ArrayList<Integer> arrList) {
        Random rand = new Random();
        for(int i = 0; i<10 ; i++){

            arrList.add(rand.nextInt(20));
        }
        int counter= 0;
        for(int i = 0; i< arrList.size() ; i++){
            if(arrList.get(i)%2==0){
                arrList.set(i, 111);
                counter++;
            }
        }
        if(counter==0){
            System.out.println("Cift sayi yoktur");
        }

        System.out.println(arrList);

    }
}
