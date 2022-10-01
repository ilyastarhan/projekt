package j02_DataTypes_WrapperClass;

public class C02_DataTypes {
    public static void main(String[] args) {

        /*
        String adi = "Ozgur bey";
        String yas = "13";
        int age = 13;
        boolean emekli = true;
        char ch = '§';
        char ch2 = 'A';
        float x = 1.24f;
        */
        //Task->
        int geburt_datum = 1999;
        int heute = 2022;
        int alt = heute - geburt_datum;
        System.out.println("Yasiniz: " + alt);
        float f1 = 12.45f;
        float f2 = 23.56f;
        double boy = 1.72;
        System.out.println(f1*f2);
        System.out.println(boy);

        //Task-> iki farkli byte tanimlayip toplam farkini bulnuz
        byte x = 55, y = 48;
        System.out.println(x-y);
        System.out.println(x+y);

        // Task-> iki farkli tam sayi türünde sayi tanimlayip toplam farkini bulnuz
        int i = 14;
        short j = 43;
        System.out.println(i+j);
        System.out.println(i-j);

        // Task->Tamsayi ve ondalikli sayi tanimlayip toplamini bulnuz
        int b = 55;
        double d = 12.42;
        System.out.println(b+d);

        // Task->Tamsayi ve char data tipinde iki variable tanimlayip print ediniz.
        int c = 24;
        char f = '$';
        System.out.println(c+f);

        // Task-> ad soyad ve yasinizi yazdiriniz
        String ad= "ilyas";
        String soyad = "Tarhan";
        int yas = 34;
        System.out.println(ad + " " + soyad + " " +yas);








            /*
		 Java'da  2 farkli data type vardir.
		 1)Primitive Data Type (8 tane)

		   a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

		   b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
		   		her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
		   		char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

		   c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
		   		byte variable -> memory'de 8 bitlik alan kaplar.

		   d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
		   		short variable -> memory'de 16 bıt alan kaplar.

		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
		 		int variable -> memory'de 32 bit alan kaplar.

		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
		   		long variable -> memory'de 64 bit alan kaplar.

		   g)float : ondalikli sayilar icin kullanilır.
		   		float variable -> memory'de 32 bit kullanir.
		   		float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.


		   h)double : ondalikli sayilar icin kullanılır.
		   		double variable -> memory'de 64 bit kullanir.
		 		double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456

		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
		 */

    }
}
