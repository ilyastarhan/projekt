package Clarusway;

import java.util.ArrayList;
import java.util.List;

public class Brand {

    private int id;
    private String name;

    private static List<Brand> brandList = new ArrayList<Brand>();

    static {
        createBrands();
    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void createBrands() {
        brandList.add(new Brand(1, "Samsung"));
        brandList.add(new Brand(2, "Lenovo"));
        brandList.add(new Brand(3, "Apple"));
        brandList.add(new Brand(4, "Huawei"));
        brandList.add(new Brand(5, "HP"));
        brandList.add(new Brand(6, "Asus"));
        brandList.add(new Brand(7, "LG"));
        brandList.add(new Brand(8, "Monster"));
        brandList.add(new Brand(9, "Casper"));

    }

    public static void printBrands() {
        System.out.println("....Marka Listesi....");
        for (Brand value : brandList) {
            System.out.println(value.getId() + " " + value.getName());
        }


    }

    public static Brand getBrand(int id) {
        for (Brand value : brandList) {
            if (value.getId() == id) {
                return value;
            }
        }

        return null;
    }
}
