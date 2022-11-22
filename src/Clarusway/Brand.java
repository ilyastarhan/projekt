package Clarusway;

import java.util.ArrayList;
import java.util.List;

public class Brand {

    public static  int id;
    public String name;

    List<Brand> brandList = new ArrayList<Brand>();

    public Brand(int id, String name) {
        Brand.id = id;
        this.name = name;
    }

    public void createBrands(){

    }
    public void printBrands(){

    }
    public Brand getBrand(int id){
        Brand brand = new Brand(1,"Lenovo");
        return brand;
    }
}
