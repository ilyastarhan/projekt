package j26_Inheritance.Inheritance01;

public class Mammal extends Hayvancik{

    Mammal(){
        System.out.println("Mammal parametresiz constructor");
    }
    public void sutBeslenme(){
        System.out.println("Bebeleri süt ile beslenir");
    }
    public void dogum(){
        System.out.println("nur topu gibi yavrisi olur");
    }
}
