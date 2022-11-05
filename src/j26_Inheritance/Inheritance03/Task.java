package j26_Inheritance.Inheritance03;

public class Task {
     /*
  1)  A ve B isminde iki class creat ediniz.
  2) A parent B child ilişkisi kurunuz.
  3) A'da static initialize  edilmiş String bir  veriable creat ediniz.
  4) B de p'siz bir cons creat ediniz ve cons icinde A daki static veriable call ederek assingment yapınız
  5) Bir runner class creat edip her iki class dan obj üreterek veriable print ediniz.


     */


    public static void main(String[] args) {

        A a = new A();
        System.out.println("a.mesaj = " + a.mesaj);
        B b = new B();

        System.out.println("b.mesaj = " + b.mesaj);
        System.out.println("a.mesaj = " + a.mesaj);


    }
}