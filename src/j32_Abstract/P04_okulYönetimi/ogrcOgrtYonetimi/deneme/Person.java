package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.deneme;

public class Person {

    private String name,surName, idNumber;
    private int age;

    public Person(String name, String surName, String idNumber, int age) {
        this.name = name;
        this.surName = surName;
        this.idNumber = idNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\t\nAdi: " + name +
                "\t\nSoyadi: " + surName +
                "\t\nKimlik no: " + idNumber +
                "\t\nYas: " + age ;
    }
}
