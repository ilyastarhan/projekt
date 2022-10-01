package challange.Day1;

public class Q07_Converting {
    public static void main(String[] args) {
        double liter, gallon;
        gallon = 1;
        liter = 3.785*(gallon);
        String result1 = gallon + " gallon degeri" + " " + liter + " litredir.";
        System.out.println(result1);

        liter = 100;
        gallon = liter/3.785;
        String result2 = liter + " Litre degeri" + " " + gallon + " galondur";
        System.out.println(result2);
    }
}
