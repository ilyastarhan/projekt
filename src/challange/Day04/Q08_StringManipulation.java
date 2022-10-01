package challange.Day04;

public class Q08_StringManipulation {
    public static void main(String[] args) {
        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.
        String s = "    Java ogrenmek123 Cok guzel@     ";
        System.out.println(s);
        System.out.println(s
                .replaceAll("\\d", "")
                .replace("@", "")
                .trim().replace("C", "c")
                .trim());
    }
}
