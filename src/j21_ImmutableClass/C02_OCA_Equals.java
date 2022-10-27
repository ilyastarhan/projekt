package j21_ImmutableClass;

public class C02_OCA_Equals {
    public static void main(String[] args) {

        String a = "";
        a += 2;
        a += 'c';
        a += false;
        System.out.println(a);
        String b = "2cfalse";
        System.out.println(b);
        if (a == "2cfalse") {
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
        if (a==b) {
            System.out.println("==");
        }
    }
}