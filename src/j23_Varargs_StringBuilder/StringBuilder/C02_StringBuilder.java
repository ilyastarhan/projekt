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


    }
}
