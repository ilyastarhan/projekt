package challange.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C1_IntList_StreamOrnekleri {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        // S1:listi aralarinda bosluk birakarak yazdiriniz //
        System.out.print("S1 : ");
        list.stream().forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //S2: sadece negatif olanlari yazdir
        System.out.print("S2 : ");
        list.stream().filter(t-> t%2==1).forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //S3: pozitif olanlardan yeni bir liste olustur
        System.out.print("S3 : ");
        List<Integer> pozitifList = list.stream().filter(t-> t>0).collect(Collectors.toList());
        for(Integer value: pozitifList){
            System.out.print(value + " ");
        }
        System.out.println("\n \t\t\t***");

        // S4: list in elemanlarin karelerinden yeni bir list olusturalim
        System.out.print("S4 : ");

        List<Integer> kareList = list.stream().map(t-> (int)Math.pow(t,2)).collect(Collectors.toList());
        kareList.forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
        System.out.print("S5 : ");
        List<Integer> kareTekrarsiz = list.stream().map(t-> (int)Math.pow(t,2)).distinct().collect(Collectors.toList());
        kareTekrarsiz.forEach(t -> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //S6: listin elemanlarini kucukten buyuge siralayalim
        System.out.print("S6 : ");
        list.stream().sorted().forEach(t -> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //S7: listin elemanlarini buyukten kucuge siralayalim
        System.out.print("S7 : ");
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
        System.out.print("S8 : ");
        List<Integer> pozKupBirBasBes = list.stream().filter(t-> t>0).map(t-> (int) Math.pow(t,3)).filter(t-> t%10==5).collect(Collectors.toList());
        pozKupBirBasBes.forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
        System.out.print("S9 : ");
        List<Integer> pozKarBirBasBesOlmayan = list.stream().filter(t-> t>0).map(t-> (int) Math.pow(t,3)).filter(t-> t%10!=5).collect(Collectors.toList());
        pozKarBirBasBesOlmayan.forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        // S10 :list elemanlarini toplamini bulalim
        System.out.print("S10 : ");
        System.out.print(list.stream().reduce(Integer::sum));
        System.out.println(list.stream().filter(t -> t % 2 == 0).count());

        System.out.println("\n \t\t\t***");

        // S11 : peek ornegi cozelim - negatit<0flerin karelerinden list olusturalim
        System.out.print("S11 : ");
        List<Integer> negatifKare = list.stream().filter(t-> t<0).peek(t-> System.out.print("Negatif deger-> " + t + " ")).
                map(t-> (int)Math.pow(t,2)).peek(t-> System.out.print("Karesi-> " + t + " ")).
                collect(Collectors.toList());
        negatifKare.forEach(t-> System.out.print(t+" "));
        System.out.println("\n \t\t\t***");

        // S12 : listeden 5 den buyuk  sayi var mi?
        System.out.print("S12 : ");
        System.out.print(list.stream().anyMatch(t -> t > 5));
        System.out.println("\n \t\t\t***");

        // S13 : listenin tum elemanlari sifirdan kucuk mu?
        System.out.print("S13 : ");
        System.out.print(list.stream().allMatch(t -> t < 0));
        System.out.println("\n \t\t\t***");

        // S14: listenin 100 e esit elemani yok mu ?
        System.out.print("S14 : ");
        System.out.print(list.stream().noneMatch(t -> t == 100));
        System.out.println("\n \t\t\t***");

        // S15: listenin sifira esit elemani yok mu?
        System.out.print("S15 : ");
        System.out.print(list.stream().noneMatch(t -> t == 0));
        System.out.println("\n \t\t\t***");


        // S16:  listenin ilk 5 elemanini topla?
        System.out.print("S16 : ");
        System.out.print(list.stream().limit(5).reduce(Integer::sum));
        System.out.println("\n \t\t\t***");

        //S17: listenin son bes elemaninin  listele
        System.out.print("S17 : ");
        list.stream().skip(list.size()-5).forEach(t->System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");










    }





}