package j24_AccessModifier;

public class C01_AccessModifier {
     /*
     1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
     Diğer class'lardan "private" class memler'lari kullanamaz.

         2) Diğer package'lerden   olusturulan object için class'i import edilmeli

         3) Diğer package'lerden default class memberlara erişilemez.
          "default" ile "package private" es anlamlidir.

         4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

          5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
         için : a)Child class erişebilir.  b)Child class degil ise erişilemez.

          6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
          Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

 */




    private int privateYas = 24;
    int defaultYas = 24;    //Access modifier yazilmaz ise default atanir
    protected int protectedYas = 24;
    public int publicYas = 24;


    private C01_AccessModifier() {  //private parametresiz constructor
        System.out.println("agama private constructor dan selamlar...");
    }
    public C01_AccessModifier(int privateYas, int defaultYas){
        System.out.println("agama public constructor dan selamlar...");
    }
    private void privateMethod(){
        System.out.println("private methoddan selamlar...");
    }
    protected void protectedMethod(){
        System.out.println("protected methoddan selamlar...");
    }

}
