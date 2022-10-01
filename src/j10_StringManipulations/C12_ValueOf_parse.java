package j10_StringManipulations;

public class C12_ValueOf_parse {
    public static void main(String[] args) {
        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.
        String bagis1 = "1500";
        String bagis2 = "2500";
        int bagisdegeri1 = Integer.valueOf(bagis1);
        int bagisdegeri2 = Integer.valueOf(bagis2);
        System.out.println("Toplam bagis mikatri: " + (bagisdegeri2 + bagisdegeri1));
        String s1 = String.valueOf(bagisdegeri1);
        String s2 = String.valueOf(bagisdegeri2);
        System.out.println(s1 + s2);
        System.out.println(s2);
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
        int tc = 1234567896;
        String tc1 = String.valueOf(tc);
        System.out.println("tc1 = " + tc1);

        String fiyat = "$150";
        String yenifiyat = fiyat.replace("$", "");
        int fiy = Integer.valueOf(yenifiyat);
        System.out.println(fiy);

    }
}
