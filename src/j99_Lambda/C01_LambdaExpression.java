package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_LambdaExpression {
    /*
	 	1) Lambda "Functional Programming"-->mathod(action) kullanan pr dili.
	 	   Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
	       Lambda  kendi başına tanımlanabilen parametre alıp gönderebilen fonksiyonlardır.
	 	   Lambda’lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
	   	   Java 8 ile gelen bu özellik, Java 8’in en önemli özelliğidir.

	 		"Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
	 	2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
	 	3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
	     	ve hatasiz code yazma acilarindan cok avantajlıdır.
	 	4) Lambda sadece collections'larda(List, Queue ve Set) ve Array'lerde kullanilabilir ancak map'lerde kullanılmaz.
           Lambda kullanmak hatasız code kullanmaktır.

                "Functional Programming"--> CINCIX Programming
                "Structured Programming"--> AMELE Programming

            Collections Nedir?
            Çoğu yazılım tek tek öğeler yerine öğelerden oluşan toplulukları depolar ve onlar üzerinde işlem
            yapar. Array’ler onlardan birisidir. Java Collections Framework, arraylerle yapılan işleri daha kolay
            yaptığı gibi, daha fazlasını da yapar.
            Java’da bir koleksiyon (collection - bazen container, ambar diye adlandırılır) nesnelerden oluşan bir
            topluluğu bir arada tutan bir yapıdır. ‘Collections Framework’ ise arayüzler ve onların kurgularından
            (implementations) oluşur.

             API:Uygulama programlama arayüzü
             (İngilizce: Application Programming Interface, kısaca API), bir yazılımın başka bir yazılımda tanımlanmış işlevlerini
             kullanabilmesi için oluşturulmuş bir tanım bütünüdür.
             API, yazılım bileşeniyle olan etkileşimlerin bir özelliğidir.
             Bu da örnek olarak şu anlama gelir. Bir arabanın bir yazılımı olduğunu hayal edin.
             Bu arabanın API'si arabanın neler yapabileceği hakkında bilgi içerir; hızlanma, frenleme, camları açma, vs.
             Ayrıca bunların nasıl yapabileceğine dair bilgiler de içerir.
             Örneğin hızlanmak için ayağınızı gaz pedalına koyup itersiniz.
             API, ayağınızı gaza bastığınızda motorun içinde neler olduğunu açıklamak zorunda değildir.
             Bu nedenle, içten yanmalı motorlu bir araba kullanmayı öğrendiyseniz, tamamen
             yeni bir dizi beceri öğrenmek zorunda kalmadan API sayesinde elektrikli bir arabayı rahatlıkla kullanabilirsiniz.

	 */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(12, 24, 36, 55, 63, 26, 35, 47, 85, 96));

        printStructural(list);
        System.out.println();
        System.out.println("*************");
        printFunctional(list);
        System.out.println();
        System.out.println("*************");
        printFunctional1(list);
        System.out.println();
        System.out.println("*************");
        printFunctional3(list);
        System.out.println();
        System.out.println("*************");
        printFunctional4(list);
        System.out.println();
        System.out.println("*************");
        printFunctional6(list);


    }

    public static void printStructural(List<Integer> list) {
        for (Integer value : list) {
            System.out.print(value + " ");
        }
    }

    public static void printFunctional(List<Integer> list) {
        list.//askyiona girecek veri
                stream().//List elemanlarini akis icerisine alir
                forEach((x) -> System.out.print(x + " "));//akistaki her bir elemani isleme alir

    }
    /*
    stream() : datalari yukaridan asagiya akis sekline getirir. Stream bir interface olduğundan dolayı doğrudan nesne almaz.
    forEach() :datanin parametresine gore her bir elemanı isler
    t-> : Lambda operatoru
     Lambda Expression-->(parameter list) -> {action body}
         Parameter list: Fonksiyonun parametreleri tanımlanır. Hiç parametre geçirmeden boşta olabilir.
         -> Arrow-token: Argüman listesi(parameter list) ile expression gövdesini(action body) birbirine bağlamak için kullanılır.
         Body: Expressionları ve statementları içerir.

        Bir kod bloğundan oluşan bir body...
        Bu tip lambda body, block body olarak bilinir. Blok gövdesi, lambda gövdesinin birden çok ifade içermesine izin verir.
        Bu ifadeler parantez içine alınır ve parantezlerden sonra noktalı virgül eklemeniz gerekir.

            () -> {
             double pi = 3.1415;
                return pi;
            };
   ahanda trick köşeşinde bugun :   Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir

    */

    public static void printFunctional1(List<Integer> list) {
        list.//askyiona girecek veri
                stream().//List elemanlarini akis icerisine alir
                forEach(System.out::print);//method reference-> System.out ypisindan print call edildi


    }

    public static void printFunctional2(int a) {//tek aksiyonlu -> seed method
        System.out.print(a + " ");
    }

    public static void printFunctional3(List<Integer> list) {
        list.//askyiona girecek veri
                stream().//List elemanlarini akis icerisine alir
                forEach(C01_LambdaExpression::printFunctional2);//method reference->
        //method kaynagi    ::   method
    }

    public static void ciftEleman(int sayi) {
        if (sayi % 2 == 0)
            System.out.print(sayi + " ");

    }
    public static void printFunctional4(List<Integer> list) {
        list.stream().forEach(C01_LambdaExpression::ciftEleman);
    }
    public static boolean ciftMi(int sayi) {
        return sayi % 2 == 0;
    }
    public static boolean ciftMiKucukMu(int sayi) {
        return sayi % 2 == 0 && sayi<35;
    }
    public static void printFunctional5(List<Integer> list) {
        list.stream().//list elemanlari akisa alindi
                filter(C01_LambdaExpression::ciftMi).//akistaki elemanlar cift olma sartina göre filtrelendi
                forEach(C01_LambdaExpression::printFunctional2);//method cagrildi
    }
    public static void printFunctional6(List<Integer> list){
        list.stream().filter(C01_LambdaExpression::ciftMiKucukMu).forEach(C01_LambdaExpression::printFunctional2);
        list.stream().filter(t-> t<35 && t%2==0).forEach(C01_LambdaExpression::printFunctional2);
    }

    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 34 den buyuk YADA  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printFunctional7(List<Integer> list){
        list.stream().filter(t-> t>34 || t%2==0).forEach(C01_LambdaExpression::printFunctional2);
    }


}

