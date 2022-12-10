package j37_Enum.enum04;

public class Runner {
    public static void main(String[] args) {
        Aylar ay=Aylar.MAYIS;
        System.out.println("ay.ordinal() = " + ay.ordinal());//4
        System.out.println("ay = " + ay);//mayıs
        System.out.println("ay.name() = " + ay.name());//
        System.out.println("ay.gunler = " + ay.gunler);//31
        ay.gunMiktarı();//enum meth call edildi


    }
}
