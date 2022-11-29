package challange.Kasim28.day5;

import java.util.ArrayList;

public class Q02_2D_CollectionsTask {

    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> arrList = new ArrayList<ArrayList<String>>();
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ahmet");
        employees.add("Ali");
        employees.add("Emrah");
        employees.add("Elif");
        employees.add("technical support");
        ArrayList<String> employers = new ArrayList<>();
        employers.add("Haluk");
        employers.add("Eylul");
        employers.add("Yusuf");
        employers.add("Can");
        employees.add("İbrahim");
        employees.add("Mehmet");
        ArrayList<String> companies = new ArrayList<>();
        companies.add("Amazon");
        companies.add("Google");
        companies.add("Testinium");
        companies.add("IBM");
        arrList.add(employees);
        arrList.add(employers);
        arrList.add(companies);
        System.out.println(arrList);
    }
}
