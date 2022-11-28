package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C11_object {
    /*
TASK :
fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
 */
    public static void main(String[] args) {
        Universite u1 = new Universite("Bogazici", "Matematik", 571, 73);
        Universite u2 = new Universite("Istanbul", "Matematik", 622, 77);
        Universite u3 = new Universite("Marmara", "Hukuk", 1453, 52);
        Universite u4 = new Universite("Itu", "Ucak Muhendisligi", 333 , 63);
        Universite u5 = new Universite("Yildiz Teknik", "Gemi", 216, 55);

        List<Universite> unv = new ArrayList<Universite>(Arrays.asList(u1,u2,u3,u4,u5));


        //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.

        System.out.println(unv.stream().allMatch(t -> t.getNotOrt() > 74));//false
        System.out.println(unv.stream().anyMatch(t -> t.getNotOrt() > 74));//true
        System.out.println(unv.stream().noneMatch(t -> t.getNotOrt() > 74));//false
        System.out.println("\n ***********");

        //task 02-->ogrc sayilarinin   110 den az olmadigini  kontrol eden pr create ediniz.
        System.out.println(unv.stream().noneMatch(t -> t.getOgrcSayisi() <= 110));

        System.out.println("\n ***********");

        //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.

        System.out.println("unv.stream().anyMatch(t->t.getBolum() ==\"Matematik\") = " + unv.stream().anyMatch(t -> t.getBolum().equalsIgnoreCase("Matematik")));
        System.out.println("\n ***********");
        //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
        System.out.println(unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).collect(Collectors.toList()));
        System.out.println("\n ***********");

        //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
        unv.stream().sorted(Comparator.comparing(Universite::getNotOrt).reversed()).limit(3).forEach(t-> System.out.println(t.getUniversite() + " "));
        System.out.println("\n ***********");

        //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.

        unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).limit(2).skip(1).collect(Collectors.toList()).forEach(t-> System.out.println(t.getUniversite()));
        System.out.println("\n ***********");

        //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
        System.out.println(unv.stream().filter(t -> t.getNotOrt() > 63).map(t -> t.getOgrcSayisi()).reduce(0, (t, u) -> t + u));
        //2.yol
        System.out.println(unv.stream().
                filter(t -> t.getNotOrt() > 63).
                mapToInt(Universite::getOgrcSayisi).//akistaki elemanlarin data type ini parametre deki degere göre update eder
                sum());//akistaki elemanlar toplanir
        System.out.println("\n ***********");

        //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.

        System.out.println(unv.stream().filter(t -> t.getOgrcSayisi() > 333).mapToDouble(Universite::getNotOrt).average());

        //2.Yol
        System.out.println(unv.stream().filter(t -> t.getOgrcSayisi() > 333).mapToDouble(Universite::getNotOrt).average().getAsDouble());

        System.out.println("\n ***********");

        //task 09-->"matematik" bolumlerinin sayisini  print ediniz.

        System.out.println(unv.stream().filter(t -> t.getBolum().equalsIgnoreCase("Matematik")).count());

        System.out.println("\n ***********");

        //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.

        System.out.println(unv.stream().filter(t -> t.getOgrcSayisi() >= 571).mapToDouble(Universite::getNotOrt).reduce(Integer.MIN_VALUE, Math::max));

        System.out.println("\n ***********");

        //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
        System.out.println(unv.stream().filter(t -> t.getOgrcSayisi() <= 1071).sorted(Comparator.comparing(Universite::getNotOrt)).collect(Collectors.toList()).get(0).getNotOrt());

    }
    public static long matBolSayisi(List<Universite> unv){

        return unv.stream().filter(t -> t.getBolum().equalsIgnoreCase("Matematik")).count();

    }
    public static double enBuyukNotOrtalamasi(List<Universite> unv){

        return unv.stream().filter(t -> t.getOgrcSayisi() >= 571).mapToDouble(Universite::getNotOrt).reduce(Integer.MIN_VALUE, Math::max);

    }
    public static double enKucukNotOrtalamasi(List<Universite> unv){


        return unv.stream().filter(t -> t.getOgrcSayisi() <= 1071).mapToDouble(Universite::getNotOrt).min().getAsDouble();
    }


    public static boolean notOrt74BuyukMu(List<Universite> unv){

        return unv.stream().allMatch(t -> t.getNotOrt() > 74);
    }
}
