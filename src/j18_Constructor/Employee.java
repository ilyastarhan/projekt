package j18_Constructor;

public class Employee {
    private String name;
    private double salary;
    private int workHours, hireYears;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYears=" + hireYears +
                '}';
    }

    Employee(String name, double salary, int workHours, int hireYears) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    public double Tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        }
        return 0.0;
    }

    public double Bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0.0;
    }

    public double RaiseSalary() {
        if (this.hireYears < 10) {
            return this.salary + 0.05;
        } else if (this.hireYears < 20)
            return salary * 0.1;
        else
            return salary * 0.15;
    }

    public double hireYears() {
        int year = 2022 - this.hireYears;
        if (year < 10)
            return salary * 0.05;
        else if (year < 20)
            return salary * 0.1;
        else
            return salary * 0.15;
    }
}
