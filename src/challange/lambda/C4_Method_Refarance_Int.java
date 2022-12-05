package challange.lambda;

// lambda da method kullanimi :
//ilk olarak class adi yazilir
//sonra  :: noktalar konur
//son olarak method secilir
//String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
//Math classi sayesinde de sum vb methodlar kullanabiliriz

import java.util.Arrays;
import java.util.List;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,0,2,5,6,7,15,6,8);

        //-->S1 tekleri aralarinda bir bosluk birakarak yazdiralim
        System.out.print("S1 : ");
        intL.stream().filter(t-> Math.abs(t%2)==1).forEach(t-> System.out.print(t+ " "));
        System.out.println("\n \t\t\t***");

        //-->S2 ciftlerin carpimini bulalim
        System.out.print("S2 : ");
        System.out.print(intL.stream().filter(t -> t % 2 == 0).reduce(1, (t, u) -> t * u));
        System.out.println("\n \t\t\t***");

        //-->S3 negatiflerin kare toplamlarini  bulalim
        System.out.print("S3 : ");
        System.out.print(intL.stream().filter(t -> t < 0).map(t -> (int) Math.pow(t, 2)).reduce(0, Integer::sum));
        System.out.println("\n \t\t\t***");

        negatifKareToplam(intL);

        //-->S4 poziflerin kuplerinden max olani yazdiralim
        System.out.print("S4 : ");
        System.out.print(intL.stream().filter(t -> t > 0).map(t -> (int) Math.pow(t, 3)).reduce(Integer::max));
        System.out.println("\n \t\t\t***");
    }

    private static void negatifKareToplam(List<Integer> intL) {
    }


}
