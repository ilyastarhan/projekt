package j33_Interface.j33_Interface;

public class C implements A {
    int x = 5;
    public int myMethod(){
return x;
    }

    public static void main(String[] args) {
        A obj = new C();
        System.out.println(obj.myMethod());
        System.out.println(A.x);
        C c = new C();
        System.out.println(c.y);
        System.out.println(c.myMethod());
        System.out.println(y);

    }
}
