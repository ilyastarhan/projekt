package j32_Abstract.kaptan;

public class Main {

    public static void main(String[] args) throws Exception {

        Audi audi = new Audi("Audi","A6",2010,500,"blue");
        Mercedes mercedes = new Mercedes("Mercedes", "C200",1991,15200,"Red");
        System.out.println(mercedes.toString());
    }
}
