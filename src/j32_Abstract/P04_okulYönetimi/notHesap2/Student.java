package j32_Abstract.P04_okulYönetimi.notHesap2;

public class Student {
    String name;
    int stuNo;
    String classes;
    Course mat;
    Course tur;
    Course bio;
    Course fiz;
    double cAverage;

    Student(){}

    public Student(String name, int stuNo, String classes, Course mat, Course tur, Course bio, Course fiz) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.tur = tur;
        this.bio = bio;
        this.fiz = fiz;
    }

    public void addBulkExamNote(Course course, int notYazili, int notSozlu){
        course.notSozlu=notSozlu;
        course.notYazili=notYazili;
    }
    public boolean isPass(){
        return !(cAverage < 50);
    }
    public double calcAverage(Course mat, Course tur, Course bio, Course fiz){
        return cAverage = (mat.notSozlu*mat.sozluNotEtkisi + mat.notYazili*(1-mat.sozluNotEtkisi) +
                tur.notSozlu*tur.sozluNotEtkisi + tur.notYazili*(1-mat.sozluNotEtkisi)+
                fiz.notSozlu*fiz.sozluNotEtkisi + fiz.notYazili*(1-fiz.sozluNotEtkisi)+
                bio.notSozlu*bio.sozluNotEtkisi + bio.notYazili*(1-bio.sozluNotEtkisi))/4;
    }
    public void printNote(){};

    @Override
    public String toString() {
        return "Student Name\t" +name
                + "\nstuNo\t" + stuNo
                + "\nclasses\t" + classes
                + "\ncAverage\t" + cAverage
                + isPass();

    }
}
