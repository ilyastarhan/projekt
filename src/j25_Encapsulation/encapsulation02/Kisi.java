package j25_Encapsulation.encapsulation02;

public class Kisi {
    //Task - > kisi pojo class ta fields -> ad, soyad, yas, password(String)
    //tüm fieldlari kullanci görebilmeli ve passwprd haric update edebilmeli
    //password encapsulated update edilmeli, yas variable negatif deger girmeye
    //karsi encapsulated
    //runner class ta obj ile field lari print eden code create ediniz.
    public String name, surName;
    private String password;
    private int age;

    Kisi(String name, String surName, int age, String password) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.password = password;
    }



    public String getPassword() {
        return password;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }


    public void setAge(int age) {

            this.age = Math.abs(age);

    }
    @Override
    public String toString() {
        return "Kisi{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
