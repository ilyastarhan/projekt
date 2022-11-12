package j32_Abstract.abstract01;

public class Accord extends Honda{

    @Override
    public void motor() {//impelement edilen abs method
        System.out.println("Agam 2.0 turbo ateşle hız felakettir:( ");
    }

    @Override
    void koltuk() {//impelement edilen abs method
        System.out.println("Agam deri koltuk ter yapar pişik olma :( ");
    }

    @Override
    void sunrooff() {//override edilen concerete method
        System.out.println("agam cuğara yakınca sunroof acmayı unutma");
    }

    @Override
    void kapı() {//impelement edilen abs method
        System.out.println("agam vakumlu kapı çarpılmayasan :) ");
    }
}
