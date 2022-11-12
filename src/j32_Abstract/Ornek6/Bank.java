package j32_Abstract.Ornek6;

public abstract class Bank {
    private String name;
    private String phoneNumber;
    private String adress;
    private int numEmployee;
    private double balance;

    public Bank(String name, String phoneNUmber, String adress, int numEmployee) {
        setName(name);
        setPhoneNumber(phoneNUmber);
        setAdress(adress);
        setNumEmployee(numEmployee);
    }

    // hesaptan giden para
    String withdraw(double gidenPara) {
        this.balance -= gidenPara;
        return gidenPara + " Euro Çekildi...";
    }

    // hesaba gelen para
    String deposit(double gelenPara) {
        this.balance += gelenPara;
        return gelenPara + " Euro alindi...";
    }

    String loan() {
        return "kredi cekilebilir...";
    }

    public abstract void openAccount();

    public abstract void closeAccount();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(int numEmployee) {
        this.numEmployee = numEmployee;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + adress + '\'' +
                ", numEmployee=" + numEmployee +
                ", balance=" + balance +
                '}';
    }
}
