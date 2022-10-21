package j18_Constructor;

public class mainEmployee {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Ahmet", 1200, 50, 1985);
        System.out.println(employee1);
        System.out.println("employee1.Tax() = " + employee1.Tax() + "Bonus = " + employee1.Bonus() + "RaiseBonus = " + employee1.RaiseSalary());
    }
}