package j07_Logical_Mantiksal_Operators;

public class C01_Mantiksal_Operator {
    public static void main(String[] args) {

        boolean b = true;
        int a = 3;
        int c = 7;

        System.out.println(b&(a<c));
        System.out.println(b&&(a>c));
        System.out.println(b&(a==c));
        String e = "Kerem bey", d = "kerem bey";

        System.out.println(e==d);


    }
}
