package j32_Abstract;

public class C01_Abstract {
    /*
    1- bazi durumlarda child classlar parent classtaki methodlarin genellikle bodylerini degistirerek
    Override ederler.
    Bu gibi durumlarda parent classtaki methoda body tanimlamak ram ve memory acisindan gereksiz kullanim olusturur.
    buna cözüm olarak java parent class a body siz (abstract) method create edilir
    2- parent classta olusturulan bu methodlar aplication güvenligi acisindan  child class lar tarafindan override edilmek zorundadir.
    eger parent bir classta child clasin mutlaka kullanmasi gereken method var ise mutlaka abstract olarak tanimlanmalidir.
    motor() her aracta mutlaka olmalidir.
    3- Abstract method tanimlamak icin;
        a) {} body olmaz
        b) access modifier sonrasi abstract keyword kullanilmali
            abstrack class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı.
    4- Abs method sadece abs Class'da tanımlanabilir kesinlikle concrete class'da abs method tanımlanamaz.
            ama abs class'da concerete emthod tanımlanabilir


    5- Abs Class içinde hem abs method hem de concrete method ve variable tanımlanabilir.
    6- Bir concerete child class parent abs class extend ettiğnde abs method'ları implement etnek zorunda
        ama concerete methodlar isteğe göre override edilir.
    7- Parent child ilşkisi olan abstarct class'lar abs method'ları implement etmek zorunda değil
    8- Parent olan abs class birden çok concerete  veya abs child class exyends edibilir.
        ancak child class birden cok abs parent class'dan extends e-de-mezz...

    9-  Abs Class'da final ve abs method tanımlanamaz CTE -> final method override edilemyecegi için abs olamaz
    10- Abs Class'da private ve abs method tanımlanamaz CTE -> private method override edilemyecegi için abs olamaz
    11- Abs Class'da static ve abs method tanımlanamaz CTE-> static method override edilemyecegi için abs olamaz

        **** ABSTRACT CLASS ASLA KESİNLİKLE OBJE URETEMEZ !!!!
        TRİCK-> Abstract Class'lar referansı child Class'ın obj tutabilir(Polimorphism)
     */
}
