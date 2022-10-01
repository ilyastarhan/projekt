package j10_StringManipulations;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.
        String s = "Alamanya";
        System.out.println(s.indexOf('a', s.indexOf('a')+1));
    }
}
