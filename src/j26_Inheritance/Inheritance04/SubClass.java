package j26_Inheritance.Inheritance04;

public class SubClass extends SuperClass {
    int num = 10;



    public void goster() {
        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");

    }
    public void myMethod(){
        goster();
        super.goster();
        System.out.println("SubClass eleman = " + num);
        System.out.println("SuperClass eleman = " + super.num);

    }
}
