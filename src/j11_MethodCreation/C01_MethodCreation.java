package j11_MethodCreation;

public class C01_MethodCreation {
    public static void topla() {//parametresiz return type i olmayan void bir methoddur
        int a = 33, b = 23;
        System.out.println(a + b);
        System.out.println("Topla methodundan selamlar :)");

    }

    public static void topla2(int a, int b) {

        System.out.println(a + b);

    }

    public static int topla3() {
        int a = 72, b = 63;
        return a+b;
    }
    public static int topla4(int a, int b) {


        return 2*(a+b);

    }

    public static void main(String[] args) {    /*
 code okunabilirliği ve sadeliği için sürekli kullanılan aksiynlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi mantanance ve reusable açısından tracih edilir
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
        */
        topla();//parametresiz return type olamayan void bir method call edildi
        System.out.println("agam bu yaziyi okuduysan ahan da yukaridaki method call oldu");
        topla2(15, 23);

        System.out.println(topla3());//135
        System.out.println(topla4(35, 48));
        System.out.println(topla4(10, 20));
        System.out.println(topla4(5, 8));
        System.out.println(topla4(7, 9));



        //Bir methodu main methodun call etmek icin mutlaka static keyword kullanılmalı.
        //Method parantezinin icinde olusturulan variable'lara "parametre" denir.
        //Methodu call edilirken method parantezinin icine yazilan degerlere "Argument" denir.
        // Parametrenin data type'i ile Argumentin data type'i 1'e 1 eslesmeli

    }





    // bir method Class'in icinde ama  main method'un disinda  cereate edilir
        // Best practice-> method'lar main method'dan sonra create edilir.



}
