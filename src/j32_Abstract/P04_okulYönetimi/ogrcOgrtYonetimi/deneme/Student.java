package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.deneme;

public class Student extends Person{

    private int studentNo = 100;
    private String className;

    public int getStudentNo() {
        return studentNo;
    }


    public void setStudentNo(int studentNo) {
        this.studentNo++;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student(String name, String surName, String className, String identificationNumber, int age) {
        super(name, surName, identificationNumber, age);
        setClassName(className);
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                super.toString() +
                "\t\nOgrenci no: " + studentNo +
                "\t\nSinifi: " + className + '\'' +
                '}';
    }
}
