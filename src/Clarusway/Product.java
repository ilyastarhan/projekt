package Clarusway;

import java.util.Scanner;

public abstract class Product {
    static Scanner scanner=new Scanner(System.in);
    private int id;
    private String name;
    private double urunFiyati;
    private double discountRate;
    private int amount;
    private int screenSize;
    private int Ram;
    private int memory;
    Brand brand;

    void menu(){

    }
    void addItem(){}
    void getProducts(){}
    void deleteItem(){}
}
