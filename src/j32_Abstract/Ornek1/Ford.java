package j32_Abstract.Ornek1;

public class Ford extends BinekOto {

    //abstract metod olduğundan zorunlu olarak
    // yazılmak zorunda (imlemente edildi.)

    @Override
    public String getMarka() {
        return "Ford Focus";
    }

    //abstract class daki yazılmış somut metodları
    // ister olduğu gibi kullanabiliriz.
    // istenirse override yapabiliriz.

    @Override
    public int getUretimYili() {

        return super.getUretimYili();
    }
}