package j26_Inheritance.Inheritance02;

public class Hayvancik {    //parent

    int a;
    int m = 3;

    Hayvancik() {
        System.out.println("HAYVANCIK parametresiz constructor");
    }

    Hayvancik(int i) {
        System.out.println("HAYVANCIK parametreli constructor");
    }


    public void mA() {
        System.out.println("mA-> hayvancik method calisti");
    }

    public void mM() {
        System.out.println("mM-> hayvancik method calisti");
    }


}
