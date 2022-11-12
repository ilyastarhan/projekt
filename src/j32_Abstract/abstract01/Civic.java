package j32_Abstract.abstract01;

public class Civic extends Lastik {//Honda parent abs Class extend child concrete class
 /*
 extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
 java CTE verdi
 çözüm:
 a) Unımplemented (uyarlanmamış) method implement edilmeli
 b)parent Hond class'dan abstarct keyword kaldırılmalı
 c)concrete olan child Civic class abstract tanımlanmalı
  */

    // concerete class'da abstract method tanımlanır mı?
   // public  abstract void absMethod();// ya class abs olmalı yada method concrete body olmalı..
    // TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli


    @Override//impelement edilen abs method
    public void motor() {
        System.out.println("Agam 1.6 eco motor az yakar çok kaçar ");
    }

    @Override//impelement edilen abs method
    void koltuk() {
        System.out.println("Agam ucuz olsun diye kumaş koltuk temiz kullanın ");
    }

    @Override//impelement edilen abs method
    void kapı() {
        System.out.println("5 kapı sedan ");
    }
    public int vites(){//concrete child class method
        return 5;
    }

    @Override
    public void lastikEbat() {
        System.out.println("21 inc lastik ");

    }
  // Honda obj = new Civic();//honda oğlu civic
  // Civic obj1 = new Civic();//civic oğlu civic
}
