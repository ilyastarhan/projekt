package j10_StringManipulations;

public class C10_isEmpty {
    public static void main(String[] args) {
        /*StringisEmpty
        String tamemen bos mu degil mi onu kontrol ediyor, sonuc true veya false return eder.

         */
        String str = "hi";
        System.out.println("str.isEmpty() = " + str.isEmpty());
        str = "";
        System.out.println(str.isEmpty());

    }
}
