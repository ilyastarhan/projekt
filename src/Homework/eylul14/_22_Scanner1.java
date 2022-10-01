package Homework.eylul14;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

    /*   kullanıcının ismini print eden code create ediniz */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz:");
        String isim = scan.nextLine();
        System.out.println("Isminiz = " + isim);

    /*   kullanıcının yasını print eden code create ediniz  */
        System.out.print("Lütfen yasinizi giriniz: ");
        int yas = scan.nextInt();
        System.out.println("Yasiniz = " + yas);

    /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */
        System.out.print("lütfen sevdiginiz meyve/leri giriniz: ");
        scan.nextLine();//dummy////
        String meyveler = scan.nextLine();
        System.out.println("Sevdiginiz meyveler: " + meyveler);

    /*   kullanıcının arabansındaki kapı sayısını print eden code create ediniz.  */
        System.out.print("Lütfen arabanizin kac kapili oldugunu giriniz: ");
        byte kapi = scan.nextByte();
        System.out.println("Arabanizdaki kapi sayisi = " + kapi);

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */

        System.out.print("lütfen 10 sene önce yasadiginiz sehrin ismin giriniz: ");
        scan.nextLine();//dummy
        String sehir = scan.nextLine();
        System.out.println("10 sene önce " + sehir + " sehrinde yasiyordunuz");

    /*    kullanıcının Doğum gününü print eden code create ediniz */
        System.out.print("Lütfen doğum gününüzü giriniz: ");
        String dogumtarihi = scan.nextLine();
        System.out.println("dogum tarihiniz = " + dogumtarihi);

    /*    Bir boolean oluşturunuz. Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz. Boolean'ı yazdırınız.   */

        boolean hesap;
        System.out.print("Bir banka Hesabiniz var mi? Evet icin \"True\" Hayir icin \"False\" yaziniz:");
        hesap = scan.nextBoolean();
        System.out.println(hesap);

    /*   kullanıcının boyunu Float print eden code create ediniz   */
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz:");
        float boy = scan.nextFloat();
        System.out.println("boyunuz " + boy + "metredir");

    /*    Bir byte oluşturunuz. Konsola kg cinsinden bir ağırlık yazınız. Byte'ı yazdırınız.   */
        byte kg;
        System.out.println("Lütfen Kg cinsinden bir miktar giriniz: ");
        kg = scan.nextByte();
        System.out.println(kg + "kg");



    }
}
