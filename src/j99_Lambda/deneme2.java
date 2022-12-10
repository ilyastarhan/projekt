package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class deneme2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 2, 0, 12, 5, 6, 9, 15, 8));
        System.out.println();
        list.forEach(t-> System.out.print(t + " "));
        System.out.println();
        list.stream().forEach(t-> System.out.print(t + " "));
        System.out.println();
        list.stream().filter(t-> t<0).forEach(t-> System.out.print(t + " "));
        System.out.println();
        list.stream().map(t-> t*t).forEach(t-> System.out.print(t + " "));
        System.out.println();
        List<Integer> list2 = list.stream().map(t-> t*t).distinct().collect(Collectors.toList());
        System.out.print(list2);
        System.out.println();
        list.stream().sorted().forEach(t-> System.out.print(t+ " "));
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+ " "));
        System.out.println();
        list.stream().filter(t-> t>0).map(t-> (int)Math.pow(t,3)).filter(t-> t%10==5).forEach(t-> System.out.print(t+ " "));
        System.out.println();
        list.stream().filter(t-> t>0).map(t-> (int)Math.pow(t,2)).filter(t-> !(t%10==5)).forEach(t-> System.out.print(t+ " "));
        System.out.println();
        list.stream().skip(list.size()-5).forEach(t-> System.out.print(t+" "));
        System.out.println();
        System.out.println(list.stream().noneMatch(t -> t == 0));
        System.out.println();
        System.out.println(list.stream().anyMatch(t -> t == 0));
        System.out.println();
        System.out.println(list.stream().allMatch(t -> t == 0));
        System.out.println();
        System.out.println(list.stream().reduce(0, Integer::sum));


        int toplam = 0;
        for(int i = 0 ; i<list.size() ; i++) {
            toplam+=list.get(i);
        }
        System.out.println(toplam);

    }



    // S10 :list elemanlarini toplamini bulalim

    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim

    /*
     peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
    ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
    yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir
     */
    // S12 : listeden 5 den buyuk  sayi var mi? -anyMatch



    // S13 : listenin tum elemanlari sifirdan kucuk mu? -allMatch



    // S14: listenin 100 e esit elemani yok mu ? -noneMatch


    // S15: listenin sifira esit elemani yok mu? - noneMatch


    // S16:  listenin ilk 5 elemanini topla? - limit(5)



    // S17: listenin son bes elemaninin  listele -skip long



    // S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim


    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim

    // S7: listin elemanlarini buyukten kucuge siralayalim

    // S6: listin elemanlarini kucukten buyuge siralayalim

    // S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim



    // S4: list in elemanlarin karelerinden yeni bir list olusturalim


    // S3: pozitif olanlardan yeni bir liste olustur


    // S2: sadece negatif olanlari yazdir


    // S1:listi aralarinda bosluk birakarak yazdiriniz

    }

