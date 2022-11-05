package j26_Inheritance.Inheritance02;

public class Mammal extends Hayvancik {
    int m = 1;
    int c = 4;

    Mammal() {
        this('Y');
        System.out.println("Mammal parametresiz constructor");
    }

    Mammal(char c) {
        super(17);
        System.out.println("Mammal char parametreli cons.");
    }

    public void mC() {
        System.out.println("Mammal mc method calisti");
    }

    @Override
    public void mM() {
        System.out.println("mM methodu mammal classtan cagrildi");
    }
}