package j23_Varargs_StringBuilder.StringBuilder;

import java.time.LocalDateTime;

public class C01_StringBuilder {
    public static void main(String[] args) {
         /*
String = > daha yavas ,Immutable==> degisemez,
String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

1) Java pass-by-value kullanir
2) String Class'i immutable Class'dir.

 StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
 StringBuffer synchronized,thread safe.

StringBuilders = mutable==>degisebilir ,
not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
StringBuilder isimli bir class uretmistir.
2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer classi vardir.
"StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
"StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
"StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

    */

        String str = "Javacan";
        System.out.println("method öncesi str = " + str);
        strBirlestir(str);
        System.out.println("method sonrasi str = " + str);

        //task->>
        toplamSure();
        String str1 = "";

        LocalDateTime str1Time = LocalDateTime.now();
        for(int i = 0; i<50000 ; i++) {
            str1+=i;
        }
        LocalDateTime str2Time = LocalDateTime.now();
        System.out.println(str2Time.getNano() - str1Time.getNano());

        LocalDateTime sb1Time = LocalDateTime.now();
        StringBuilder sb1 = new StringBuilder("");
        for(int i = 0; i<50000 ; i++) {
            sb1.append(i);
        }
        LocalDateTime sb2Time = LocalDateTime.now();
        System.out.println(sb2Time.getNano() - sb1Time.getNano());


    }

    private static void toplamSure() {
    }

    public static void strBirlestir(String str){
        System.out.println(str+" agama selam olsun");
    }

}
