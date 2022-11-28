package alistirmalar.arrays;

public class Janitors extends Employee{


    private int baseHours = super.getHours()*2;
    private double baseSalary = super.getSalary()-10000.0;
    private int baseVacationDays = super.getVacationDays()/2;

    Employee employee = new Employee();

    public void clean(){
        System.out.println("Workin' for the man.");
    }

    public int getBaseHours() {
        return baseHours;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getBaseVacationDays() {
        return baseVacationDays;
    }

    public void setBaseHours() {
        this.baseHours = super.getHours()*2;
    }
    public void setBaseSalary() {
        this.baseSalary = super.getSalary()-10000.0;
    }
    public void setBaseVacationDays() {
        this.baseVacationDays = super.getVacationDays()/2;
    }

}
