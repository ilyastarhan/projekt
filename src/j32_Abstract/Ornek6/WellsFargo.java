package j32_Abstract.Ornek6;

public class WellsFargo extends Bank {
    public WellsFargo(String name, String phoneNUmber, String adress, int numEmployee) {
        super(name, phoneNUmber, adress, numEmployee);
    }

    @Override
    public void openAccount() {
        System.out.println("Adınız ve adres bilgilerininz alındı.");
        System.out.println(this.getClass().getSimpleName() + " Hesap açılışınız yapıldı.");
    }

    @Override
    public void closeAccount() {
        System.out.println("Hesap kapatma için talebiniz alındı");
        System.out.println(this.getClass().getSimpleName() + " Hesabınız kapatıldı..");
    }
}
