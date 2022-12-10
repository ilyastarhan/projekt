package j19_StaticKeyword.Task03;

public class Lesson {
    String lessonName;
    int lessonCredit;

    public Lesson() {
    }

    public Lesson(String lessonName, int lessonCredit) {
        this.lessonName = lessonName;
        this.lessonCredit = lessonCredit;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName='" + lessonName + '\'' +
                ", lessonCredit=" + lessonCredit +
                '}';
    }
}
