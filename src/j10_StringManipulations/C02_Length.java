package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {
        //length() methodu string'in uzunlugunu  icinde bulunan karakter sayisini return eder
        //bütün karakterleri (bosluk vs) sayip adedini verir.
        String str = "madem geldin dünyaya otur calis javaya";
        System.out.println(str.length());
        String str2= null;
        System.out.println(str2.length());//Run time error
        //null case sensitivedir, yani Null veya NULL yazilamaz
        //null bir deger degildir. sadece hicligi gösteren bir pointer(giris isaretci)
        System.out.println(str2.concat(str));//Run time Error
        //null atanan stringler Sring method calismaz


    }
}
