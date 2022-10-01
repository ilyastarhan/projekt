package challange.Day04;

public class Q03_StringManipulation {
    public static void main(String[] args) {


  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

        String  str1 = "$13.99";
        str1 = str1.replaceAll("\\D", "");
        System.out.println(str1);

        String str2= "$10.55";
        str2 = str2.replaceAll("\\D", "");
        System.out.println(str2);

        double sayi1 = Double.parseDouble(str1);
        double sayi2 = Double.parseDouble(str2);
        System.out.println("$" +(sayi1 + sayi2)/100);


    }
}
