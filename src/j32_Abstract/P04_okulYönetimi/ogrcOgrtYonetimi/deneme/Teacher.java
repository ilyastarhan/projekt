package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.deneme;

public class Teacher extends Person {

    String branch;
    private int id;


    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teacher(String name, String surName, int id, String branch, String identificationNumber, int age) {
        super(name, surName, identificationNumber, age);
        this.id = id;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "\t\nOgretmen{" + super.toString() +
                "\t\nbransi : " + branch +
                "\t\nÖgretmen kimlik numarasi" + id +
                '}';
    }
}
