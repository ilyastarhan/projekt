package j23_Varargs_StringBuilder.StringBuilder;

import java.util.Arrays;

public class C02_StringBuilder {
    public static void main(String[] args) {

        //StringBuilder obj create etme
        //1.yol->
        StringBuilder sb1 = new StringBuilder();//default capacity 16 bit olan value olmayan bos StringBuilder
        System.out.println("sb1.length() = " + sb1.length()); // 0-> karakter sayisini return eder
        System.out.println("sb1.capacity() = " + sb1.capacity()); // 16 -> toplam uzunlugunu verir
        sb1.append("Javatar");
        System.out.println("sb1 = " + sb1); // Javatar
        sb1.append(" Selam").append(" olsun ").append(24).append(" ").append(true); //zincirleme ekleme yapilabilir
        System.out.println("sb1 = " + sb1);
        String[] arr = sb1.toString().split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("sb1.capacity() = " + sb1.capacity()); //34-> ekleme yapildikca kapasite aritmeteik olarak artar(*2+2)
        //2. yol->
        StringBuilder sb2 = new StringBuilder("Selamlar");
        System.out.println("sb2.capacity() = " + sb2.capacity());

        //trim();-> fazladan ayrilan kapasite silinir
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());// ilk deger atamasi yapildiktan sonra +16 yer daha ayrilir

        StringBuilder sb3 = new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());

        //istenen bir character index'i alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));

        //belirli bir araliktaki karakterleri alma
        System.out.println("sb1.substring(3,7) = " + sb1.substring(3, 7));
        System.out.println("sb1.subSequence(3,7) = " + sb1.subSequence(3, 7));

        // belirli bir index teki karakteri silmek
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));
        System.out.println("sb1 = " + sb1);

        // istenenen karakteri veya karakterleri eklemek
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.insert(4, \"abi\") = " + sb1.insert(4, "abi"));
        System.out.println("sb1.insert(4, \"ahmet\", 2,4) = " + sb1.insert(4, "ahmet", 2, 4));

        //istenen indexteki karakteri degistirme
        sb1.setCharAt(2,'C');
        System.out.println("sb1 = " + sb1);

        //istenen index karakter yerine birden cok karakter eklemek
        System.out.println("sb1.replace(1,5,\"selam\") = " + sb1.replace(1, 5, "kardaslik"));

        // objeyi String e cevirmek
        System.out.println("sb1.toString().toUpperCase() = " + sb1.toString().toUpperCase());

        // String ile StringBuilder karsilastirmasi

        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey return etmezken
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu print eder
        Tamamen ayni ise bize 0 return eder

        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */
        StringBuilder sb5 = new StringBuilder("javaCAN");
        StringBuilder sb6 = new StringBuilder("javaCAN");
        String str1 = "javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));
        System.out.println("sb5.compareTo(str1) = " + sb5.compareTo(new StringBuilder(str1)));
        //sb5.compareTo(str1); ---> cte verir
        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5)); // --> false
        //StringBuilder de eqauls == gibi calisir. hem value hem de referans degere bakar


    }
}
