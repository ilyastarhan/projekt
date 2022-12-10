package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
//map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 24, 36, 55, 63, 26, 35, 47, 85, 96));
        ciftKarePrint(list);
        System.out.println();
        kupleriArtiBir(list);
        System.out.println();
        ciftlerinKarekokleri(list);


    }

    public static void ciftKarePrint(List<Integer> list) {
        list.
                stream().
                filter(t -> t % 2 == 0)
                .map(t -> t * t)//akista filtrelenen cift elemanlar karesi alinarak update edildi akisa sunuldu
                .forEach(t -> System.out.print(t + " "));


    }

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir
    // fazlasini ayni satirda aralarina bosluk birakarak print ediniz
    public static void kupleriArtiBir(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 1).map(t -> (int) Math.pow(t, 3) + 1).forEach(t -> System.out.print(t + " "));

    }

    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void ciftlerinKarekokleri(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).map(Math::sqrt).forEach(t -> System.out.print(t + " "));
    }
}