package Homework.eylul12;

public class Task04 {
    public static void main(String[] args) {
        /*
        TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan
	     input	: sayi1=20 ve sayi2=34;
		 output  :  sayi1=34 ve sayi2=20
         */
        // a)

        System.out.println("*** a çözümü ***");
        int sayi1=20, sayi2=34, temp;

        System.out.println("sayi1' in eski degeri: " + sayi1 + "\nsayi2' nin eski degeri: " + sayi2);

        /*temp = sayi1;
        sayi1 = sayi2;
        sayi2 = temp;
        */
        //cözüm a2)
        temp = sayi1 + sayi2;
        sayi1 = temp - sayi1;
        sayi2 = temp - sayi1;



        System.out.println("sayi1' in yeni degeri: " + sayi1 + "\nsayi2' nin yeni degeri: " + sayi2);

        // b)
        System.out.println("*** b çözümü ***");

        sayi1=20;
        sayi2=34;

        System.out.println("sayi1' in eski degeri: " + sayi1 + "\nsayi2' nin eski degeri: " + sayi2);

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        System.out.println("sayi1' in yeni degeri: " + sayi1 + "\nsayi2' nin yeni degeri: " + sayi2);

    }
}
