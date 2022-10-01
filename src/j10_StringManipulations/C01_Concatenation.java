package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {
        /*
        concat() methodu icine(parametre) aldigi String variable'i calistigi String'in sonuna ekler.
        Java'da (+) islemi eger en az bir String variable varsa tüm Java toplama degil concat yapar
         *
         *
         *
         *
         *
         */
        String name = "Nur";
        String meslek = " QA Tester";
        System.out.println(name.concat(meslek));
        System.out.println(name);
        System.out.println(name.concat(5 + " :)"));
        System.out.println(name.concat(true + "hanim"));
        //concat methodu parametre olarak string type harici tüm datalari stringe cevirip concat eder

    }
}
