package alistirmalar.j37_Enum.enum04;

public class Runner {
    public static void main(String[] args) {


        Aylar ay = Aylar.MAYIS;
        System.out.println("ay.ordinal() = " + ay.ordinal());
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.gunler = " + ay.gunler);ay.gunMiktari();

    }
}