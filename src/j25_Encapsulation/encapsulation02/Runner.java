package j25_Encapsulation.encapsulation02;

public class Runner {
    public static void main(String[] args) {

        Kisi obj1 = new Kisi("ahmet", "selim",23,"ahmet23");
        System.out.println("obj1.getName() = " + obj1.getName());
        obj1.name = "güzel insan ahmet";
        System.out.println("obj1.getName() = " + obj1.getName());
        System.out.println("obj1.getSurName() = " + obj1.getSurName());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());
        obj1.setAge(-34);
        System.out.println("obj1.getAge() = " + obj1.getAge());


    }
}
