package j27_Polymorphism;

class ItCompany {


    public int getOffer() {
        System.out.println("ItCompany class");
        return 101;
    }
}
class QaTester extends ItCompany {

    public int getOffer(){
        System.out.println("QA Tester class ");
        return 99;
    }
}
public class test {
    public static void main(String[] args) {
        ItCompany tester = new ItCompany();
        QaTester tester2 = new QaTester();
        System.out.println(tester.getOffer() + ", " + tester2.getOffer());

    }
}
