package j29_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {

        /* ----throw ve throws farklari ----
        1- throws main method curly brackets ten önce yazilir
         - throw method body icinde kullanilir
        2- throws keyworddan sonra 1'den fazla exception yazilabilir
         - throw keywordden sonra sadece 1 tane exception tanimlanabilir
        3- throws keyworddan sonra sadece exception class name yazilir
         - throw keywordden sonra exception class tan obje tanimlanir.
        4- throws keyword method ilk satirda sadece 1 kez tanimlanir
         - throw keyword istenildigi kadar method body icinde tanimlanabilir

         */
        //Sayi formatinda olmayan bir datayi parseInt() methodu calistirilarak integer a cevrildiginde
        // olusan rte exception dur
        //java da String icindeki rakam ver karakterler parseInt() methodu ile integer degere cevrileblir.
        String str = "1453";
        int sayi = Integer.parseInt(str);
        System.out.println(sayi);
        System.out.println("sayi = " + (sayi + 5));
        String id = "57l622";
        try {
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));


        } catch (NumberFormatException e) {
            System.out.println("hata yakalandi");
        }

        System.out.println("Calsmaya devam edebilirsiniz");
    }
}