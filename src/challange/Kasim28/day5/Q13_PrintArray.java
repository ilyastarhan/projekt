package challange.Kasim28.day5;

public class Q13_PrintArray {

    // Create a method which takes String array as a parameter
    // and prints all the element

    public static void main(String[] args) {
        String [] arabalar = {"Honda", "Toyota", "Porsche", "Tesla", "BMW"};
        printElements(arabalar);

        String [] renkler = {"Mavi", "Kirmizi", "Mor", "Kahverengi", "Sari","Turuncu", "Yesil"};
        printElements(renkler);


    }
    public static void printElements(String[] arr){
        for(String value : arr){
            System.out.print(value + " ");
        }
        System.out.println("\n");
    }
}
