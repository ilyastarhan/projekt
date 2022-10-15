package Homework.ekim13;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
        String str = "Removes white space from both ends of a string";
        String yeni[] = str.split(" ");
        System.out.println("Kelime sayisi = " + yeni.length);

    }
}