package challange.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");

        //-->S1 Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
        System.out.print("S1 : ");
        l.stream().map(String::toUpperCase).map(t->t.replace("", " ")).forEach(t-> System.out.print(t + " "));
        System.out.println("\n \t\t\t***");

        //-->S2 Stringleri uzunluklarina gore siralayip yaziniz
        System.out.print("S2 : ");
        l.stream().sorted(Comparator.comparing(String::length)).forEach(t-> System.out.print(t + " "));
        System.out.println("\n \t\t\t***");

        //-->S3 E ILE Baslayanlari yazdiralim
        System.out.print("S3 : ");
        System.out.println("\n \t\t\t***");
        l.stream().filter(t-> t.charAt(0)=='E').forEach(System.out::print);
    }





}
