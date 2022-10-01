package j01_Variables;

public class C02_VariableCreate {

    public static void main(String[] args) {

        // variable create(Değişken oluşturmak) için..
        // 1- Datatype(Değişken türü) VariableName(Değişken ismi) "=" value(değişken değeri) ";"
        //             int                  yas                    =  48  ;
        //                Declaration(Tanımlama)                   =  Assaignment(Atama)

        //1. yol-> best practice(Recommended) tavsiye eilen..
        int yas=48;
        int maas=108000;
        System.out.println(yas);//48
        System.out.println("yasınız : "+yas);//yasınız : 48
        System.out.println(maas);//108000
        System.out.println("maasınız :"+maas);//maasınız : 108000

        //2. yol->
        int boy;// variable declaration -> değişken tanımlama
        //KING of TRICK :)
        //System.out.println(boy);// değer ataması yapılmadan bir variable herhangi bir işlem(axion)a alınamaz CTE
        boy=190; // variable value assaignment -> değişkene değer ataması
        System.out.println(boy);//190

        //3 .yol->
        //  int age,yevmiye,kilo;Aynı data türünde birden fazla variable tek komutla declare edilebilir.
        //  age=33;
        //  yevmiye=500;
        //  kilo=90;
        int age=33,yevmiye=500,kilo=90;//5- Aynı data türünde birden fazla variable tek komutla declare edilip değer atanabilir.
        /*
        Bir variable declare edildikten sonra istenildiği kadar değer dğiştirilebilir
         */
        age=40;
        System.out.println("yeni age : "+age);//yeni age : 40
        /*
       CISS :(  variable declare edildikten sonra tekrar declare EDİLMEZZZ ->CTE
         */
        // int age; -> dublicate variable declaration CTE
    }

}
