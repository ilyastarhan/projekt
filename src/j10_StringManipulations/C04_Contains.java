package j10_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {
        //String icerisinde istenen stringin varligini kontrol eden boolean return eder

        String s1 = "Enise hanim basarili bir QA tester team lead";
        System.out.println(s1.contains("hanim"));//true
        System.out.println(s1.contains("E"));//true
        System.out.println(s1.contains(" "));

        String s2 = "QA";
        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false



    }
}
