package j14_Scope;

public class C03_Scope {
    public static void main(String[] args) {

C01_InstanceVariable kus = new C01_InstanceVariable();
kus.name = "hüma";
kus.developerMı = false;
C01_InstanceVariable.staticMethod();//class name ile static method call edildi
kus.non_staticMethod();//obje ile static olmayan method call edildi


    }
}
