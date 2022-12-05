package challange.lambda;
//multi arrayleri cevirirken flatMap kullaniriz yapilis sekli iki turludur
//1) lambda kullanarak
// Arrays.stream(arr).flatMap(t->Arrays.stream(t))
//2) method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.util.Arrays;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc","Erik"}
        };
        String arr2[][][] = {
                {{"Elma","Armut"},{"Seker", "Muz"}},
                {{"Portakal","Mandalina"}, {"Cilek", "Limon"}},
                {{"Havuc", "Kek"}, {"Mürdüm","Erik"}}};
        Arrays.stream(arr2).flatMap(t-> Arrays.stream(t)).flatMap(Arrays::stream).forEach(t-> System.out.println(t+" "));

        //-->S1 tum elemanlari list yapalim
        System.out.print("S1 : ");
        Arrays.stream(arr).flatMap(Arrays::stream).forEach(t-> System.out.print(t + " "));

        System.out.println("\n \t\t\t***");

        //-->S2 E ile baslayan elemanlari double (elmaelma) olarak yazdiralim
        System.out.print("S2 : ");
        Arrays.stream(arr).flatMap(t-> Arrays.stream(t)).filter(t-> t.startsWith("E")).map(t-> t.repeat(2)).forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //-->S3 E ile baslayan elemanlari liste olarak yazdiralim
        System.out.print("S3 : ");
        Arrays.stream(arr).flatMap(t-> Arrays.stream(t)).filter(t-> t.startsWith("E")).forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //-->S4 k ile bitenlerin sonuna '*' ekleyelim
        System.out.print("S4 : ");
        Arrays.stream(arr).flatMap(t-> Arrays.stream(t)).filter(t-> t.endsWith("k")).forEach(t-> System.out.print(t+ "* "));
        System.out.println("\n \t\t\t***");

    }


}
