package j32_Abstract.P04_okulYönetimi.notHesap2;

public class Course {
    String name, prefix;
    Teacher teacher;
    public int notYazili, notSozlu, code;
    double sozluNotEtkisi;




    public Course(String name, String prefix, int code, double sozluNotEtkisi){
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.sozluNotEtkisi = sozluNotEtkisi;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;

    }
    public void printTeacher() {


    }

}
