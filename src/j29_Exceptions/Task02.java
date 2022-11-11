package j29_Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        /*
        Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
        edip mainde kontrol ediniz.

        Trick->
        sicaklikKontrol(int sıcaklık){
        throw new IOException("Hava Gerçekten soğuk dışarı çıkma");
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Sicaklik gir: ");
        int sicaklik = scan.nextInt();
        sicaklikKontrolEt(sicaklik);

    }

    private static void sicaklikKontrolEt(int sicaklik) {
        try{
            if(sicaklik <10){
                throw new IOException("Hava Gercekten soguk, disari cikma");
            }
            else System.out.println("hava sicakligi fevkaledenin fevkinde");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
