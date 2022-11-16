package j32_Abstract.P04_okulYönetimi.notHesap2;

public class Runner {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Selim", "Türkce");
        Teacher teacher2 = new Teacher("Sema", "Matematik");
        Teacher teacher3 = new Teacher("Sinan", "Bioloji");
        Teacher teacher4 = new Teacher("Sevgi", "Fizik");

        Course course1 = new Course("Matematik", "MT", 101, 0.3);
        Course course2 = new Course("Türkce", "TR", 102, 0.5);
        Course course3 = new Course("Bioloji", "BIO", 103, 0.45);
        Course course4 = new Course("Fizik", "FIZ",104, 0.2);

        course1.addTeacher(teacher2);
        course2.addTeacher(teacher1);
        course3.addTeacher(teacher3);
        course4.addTeacher(teacher4);
    }
}
