package j32_Abstract.Ornek6;

public class ChaseBank extends Bank {
    public ChaseBank(String name, String phoneNUmber, String adress, int numEmployee) {
        super(name, phoneNUmber, adress, numEmployee);
    }

    @Override
    public void openAccount() {
        System.out.println("Adınız ve adres bilgilerininz alındı.");
        System.out.println(this.getClass().getSimpleName() + " daki Hesap açılışınız yapıldı.");
    }

    @Override
    public void closeAccount() {
        System.out.println("Hesap kapatma için talebiniz alındı");
        System.out.println(this.getClass().getSimpleName() + " daki Hesabınız kapatıldı..");
    }
}