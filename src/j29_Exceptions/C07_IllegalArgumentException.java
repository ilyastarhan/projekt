package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {
       //kullanlmasi istenmeyen degerlerde programin hata vermesi isteniyorsa bu exception
        //firlatilir
        //Örnek -> yas datasi icin negatif deger girildiginde programin kirilmadan calismaya devam etmesi
        //ama girilen deger icin exception almak icin kullanilir
        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi giriniz:");
        int age = scan.nextInt();
        try {
            if(age<0){
                throw new IllegalArgumentException();/* throw keyword ile Exception obje
                olusturularak hata tanimlanir ve firlatilir. böylece sartimiza uymayan deger icin
                catch block 'a dusurerek daha pratik kod yazildi*/}
            else
            System.out.println("Hata yakalanmadan calismaya devam ediyorsunuz");
        }
        catch(IllegalArgumentException e){
            System.out.println("Hata yakalandi");
        }
        System.out.println("calismaya devam edebilirsiniz");

    }
}
