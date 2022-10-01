package j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        /* indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/
        String str = "Good";
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("D"));//olmayan karakter -1 sonucunu verir
        System.out.println(str.indexOf("od"));//2

        /* lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */
        String str2 = "Good of school";
        System.out.println(str2.lastIndexOf("o"));
        String name = "mustafa nizamoglu";
        System.out.println(name.lastIndexOf("a"));

        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = scan.nextLine().toLowerCase();
        if (cumle.contains("java")) {
            if (cumle.lastIndexOf("java") == cumle.indexOf("java")) {
                System.out.println("Girilen cümlede 1 tane \"java\" ifadesi vardir.");

            } else {
                System.out.println("Girilen cümlede birden fazla \"java\" ifadesi vardir.");
            }
        } else {
            System.out.println("Girilen cümlede \"java\" ifadesi yoktur");

        }

        System.out.println("bir metin giriniz");
        String s = scan.nextLine();
        if (s.contains("Java")) {
            if (s.indexOf("java") == s.lastIndexOf("java")) System.out.println(" 1 tane java içeriyor");
            else System.out.println("birden fazla java içeriyor");
        } else System.out.println("java mava içermiyor. ");
    }
}