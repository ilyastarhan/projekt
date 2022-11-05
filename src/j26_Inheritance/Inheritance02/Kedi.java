package j26_Inheritance.Inheritance02;

public class Kedi extends Mammal {
    int c =2;
    int d = 5;


    public Kedi() {
        super();
        System.out.println("kedi parametresiz Constructor");
    }
    public Kedi(String str){
        this();
        System.out.println(super.c);
        System.out.println("kedi parametreli cons");
    }

    @Override
    public void mC() {
        System.out.println("Mc kedi class tan cagrilde");
    }
}
