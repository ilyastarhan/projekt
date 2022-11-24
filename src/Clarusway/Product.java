package Clarusway;

import java.util.Scanner;

public abstract class Product {
    static Scanner scanner=new Scanner(System.in);
    private int id;
    private String name;
    private double urunFiyati;
    private double discountRate;
    private int amount;
    private double screenSize;
    private int Ram;
    private int memory;
    private Brand brand;

    public Product() {
    }

    public Product(int id, String name, double urunFiyati, double discountRate, int amount, double screenSize, int ram, int memory, Brand brand) {
        this.id = id;
        this.name = name;
        this.urunFiyati = urunFiyati;
        this.discountRate = discountRate;
        this.amount = amount;
        this.screenSize = screenSize;
        Ram = ram;
        this.memory = memory;
        this.brand = brand;
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

    public double getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(double urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public abstract void menu();
    public abstract void addItem();
    public  abstract void getProducts();
    public abstract void deleteItem();
}
