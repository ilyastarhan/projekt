package j21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1 = "Murat";
        String str2 = "Murat";
        String str3 = new String("Murat");
        String str4 = new String("Murat");
        String str5 = str1+"";

        System.out.println(str1 == str2);
        System.out.println("str1==str3 = " + str1 == str3);
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str3==str4 = " + str3 == str4);
        System.out.println("str1==str5 = " + str1 == str5);
        System.out.println("str1.equals(str5) = " + str1.equals(str5));
    }
}
