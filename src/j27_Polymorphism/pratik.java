package j27_Polymorphism;

public class pratik {
    public static void main(String[] args) {
        M m = new M();
        M o = new O();
        M n = new N();
        O oo = new O();
        m.product(3);
        n.product(3);
        oo.product(3);
    }
    static class M{
        int product(int i){
            int result = i*i;
            System.out.println(i + " " +  result);
            return result;
        }
    }
    static class N extends M{
       int product(int i){
            int result = i+i;
            System.out.println(i + " " + result);
            return result;
        }
    }
    static class O extends M{
        int product(int i){
            int result = i*2;
            System.out.println(i + " " + result);
            return result;
        }
    }
}
