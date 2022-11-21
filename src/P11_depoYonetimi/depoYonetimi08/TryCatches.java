package P11_depoYonetimi.depoYonetimi08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatches {

    //Ekleme: Ürün çıkışı methodundaki miktarın depoda var olan miktardan fazla olmaması gerekliliği try catch ile sağlandı. Bu sadece spesifik bir
    // ihtiyaç olması sebebiyle var olan try-catches methoduna ekleme yapılıp yeni bir method oluşturuldu.

    /* Karşılaşılabilecek problemler sebebiyle Try-Catches ayrı bir classa alındı.
     * Daha sonra eklenebilecek yeni durumlar için dinamik olmayan sorunları try catch e eklenmedi.
     * Sorunların parent-child ilişkisine dikkat edildi.
     * Çözümler genel yönlendirmelere değil, spesifik yönlendirmelere bağlandı.


     */




    static Scanner scan = new Scanner(System.in);


    public static int tryCatchesInt() {
        int giris = 0;
        boolean flag1=false;

        do {

            try {
                if (flag1==true){
                    flag1=false;}

                giris = scan.nextInt();


                if (giris < 0) {
                    throw new IllegalArgumentException();
                }
               break;

            } catch (IllegalArgumentException e) {
                flag1=true;
                System.out.println("lütfen pozitif bir sayi giriniz");
            } catch (InputMismatchException e) {
                flag1=true;
                System.out.println("lütfen bir rakam giriniz");
            } catch (Exception e) {
                flag1=true;
                System.out.println("lütfen geçerli bir giriş yapınız");
            }


        } while (flag1);


        return giris;

    }

    public static int tryCatchesMiktar() {
        int giris = 0;
        boolean flag1=false;

        do {

            try {
                if (flag1==true){
                    flag1=false;}

                giris = scan.nextInt();

                if (giris < 0) {
                    throw new IllegalArgumentException();

                }

                if(giris > Urunler.urunListesiMap.get(DepoIslemler.urunID).getMiktar()){ throw  new IllegalAccessException();}


                break;



            } catch (IllegalArgumentException e) {
                flag1=true;
                System.out.println("lütfen pozitif bir sayi giriniz");
            } catch (InputMismatchException e) {
                flag1=true;
                System.out.println("lütfen bir rakam giriniz");
            } catch (IllegalAccessException e) { flag1=true;
                System.out.println("depoda yeterli miktarda ürün yok");

            } catch (Exception e){flag1=true;
                System.out.println("lütfen geçerli bir giriş yapınız");}


        } while (flag1);


        return giris;

    }
    public static int tryCatchesID() {
        int giris = 0;
        boolean flag1=false;

        do {

            try {
                if (flag1==true){scan.nextLine();        //Dummy1(39 ve 40. satırlar için)
                    flag1=false;}

                giris = scan.nextInt();

                if (giris < 0) {
                    throw new IllegalArgumentException();


                }

                if(! Urunler.urunListesiMap.containsKey(giris)){ throw  new IllegalAccessException();}



break;
            } catch (IllegalArgumentException e) {
                flag1=true;
                System.out.println("lütfen pozitif bir sayi giriniz");
            } catch (InputMismatchException e) {
                flag1=true;
                System.out.println("lütfen bir rakam giriniz");
            } catch (IllegalAccessException e) { flag1=true;

                System.out.println("yanlış ID girdiniz yeniden deneyin.");

            } catch (Exception e){flag1=true;
                System.out.println("lütfen geçerli bir giriş yapınız");}


        } while (flag1);


        return giris;

    }

    public static double tryCatchesDouble() {
        double giris = 0.0;
        boolean flag1=false;

        do {

            try {
                if (flag1==true){
                    flag1=false;}

                giris = scan.nextDouble();


                if (giris < 0) {
                    throw new IllegalArgumentException();
                }
                break;

            } catch (IllegalArgumentException e) {
                flag1=true;
                System.out.println("lütfen pozitif bir sayi giriniz");
            } catch (InputMismatchException e) {
                flag1=true;
                System.out.println("lütfen bir ondalıklı değer giriniz ");
            } catch (Exception e) {
                flag1=true;
                System.out.println("lütfen geçerli bir giriş yapınız");
            }


        } while (flag1);


        return giris;

    }
}