package j29_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        //     System.out.println(str.charAt(1)); StringIndexOutOfBoundsException
        System.out.println("1. sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("2. sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println("3. sayiyi giriniz: ");
        int sayi3 = scan.nextInt();
        System.out.println("4. sayiyi giriniz: ");
        int sayi4 = scan.nextInt();
        int oran;// ArithmeticException / by zero
        int oran2;
        try {/* try-catch kullanildiginda try block hatasiz calisirsa
        catch block asla calismaz hata yakalarsa calisir
        2- try block catch veya finally olmadan cte verir try blockta birden fazla catch block tanimlanabilir
        ayni anda sadece bir catch bloch calisabilir hiv bir catch block calismayadabilir
        3- parent child ilsikisi olan catch lerde child önce yazilmali
        */
            oran = sayi1 / sayi2;
            System.out.println(oran);
            System.out.println("hi");
            oran2 = sayi3 / sayi4;
            System.out.println(oran2);
        } catch (ArithmeticException c) {
            System.out.println("cirak catch den selamlar" + c);
            //exception oldugunda sadece hata mesaji print etmek icin .getMessage() kullanilir
            System.out.println(c.getMessage());
            c.printStackTrace();// olusan hatayi tüm detaylari ile yazdirir
        } catch (ArrayIndexOutOfBoundsException d) {
            System.out.println("Array de eleman istiyorsunuz" + d);
        } catch (Exception e) {
            System.out.println("parent catch den selamlar");
            System.out.println("Hata yakalandi -> " + e);
        }
     /*   catch(ArithmeticException c){
            // parent child isiskisi olan catchlerde child önce yazilmali ak halde CTE verir
        }*/ // catch blocklardan sonra finally block kullanilabilir
            /* try catch icinde yapilan islemlerden sonra mutlaka calismasi gereken
             * bir block varsa finally tanimlanir.
             * hata durumunda catch calismasa pr sonlanir. finally tanimlanirsa catch calismasa bile
             * pr akisi devam eder
             * finally block hata olsa da olmasa da calisir
             * cloud database oratamlarinda baglanti kesmek icin kullanilir
             * cloud ile connection yazdiginizda code basarili bir sekilde calisirsa islem bittiginde finally block ile
             * connection kapanmazsa islem pahaliya patlayabilir*/
        finally {
            System.out.println("Agam finally block tan selamlar");
        }
        System.out.println("Calismaya devam edebilirsiniz....");
    }
}