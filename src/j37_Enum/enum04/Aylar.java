package j37_Enum.enum04;

public enum Aylar {

   // OCAK(31,"kış","gülsüm hanım hayırlı seneler"),
    OCAK(31),
    SUBAT(28),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKİM(31),
    KASIM(30),
    ARALIK(31);


int gunler;


   // Aylar(int gunSayısı,String mevsim, String  birthDay) {//p'li cons->p'siz cons ezer
    Aylar(int gunSayısı) {//p'li cons->p'siz cons ezer
        gunler = gunSayısı;

    }

    void gunMiktarı(){//meth.

        System.out.println("gunler = " + gunler);
    }
}
