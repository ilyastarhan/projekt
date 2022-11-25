package Projeler.TASK;

import java.util.Scanner;

public class Urun {
    Urun urun;
    private double kraker = 2.5;
    private double cips = 2.2;
    private double cocaCola = 2.2;
    private double fanta = 2.0;
    private double su = 1.0;
    private double cay = 1.5;
    private double filtreKahve = 1.99;

    int productNum;
    double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Scanner scan = new Scanner(System.in);

    public void productSelect() {


    }

    public double getKraker() {
        return kraker;
    }

    public void setKraker(double kraker) {
        this.kraker = kraker;
    }

    public double getCips() {
        return cips;
    }

    public void setCips(double cips) {
        this.cips = cips;
    }

    public double getCocaCola() {
        return cocaCola;
    }

    public void setCocaCola(double cocaCola) {
        this.cocaCola = cocaCola;
    }

    public double getFanta() {
        return fanta;
    }

    public void setFanta(double fanta) {
        this.fanta = fanta;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getCay() {
        return cay;
    }

    public void setCay(double cay) {
        this.cay = cay;
    }

    public double getFiltreKahve() {
        return filtreKahve;
    }

    public void setFiltreKahve(double filtreKahve) {
        this.filtreKahve = filtreKahve;
    }

    @Override
    public String toString() {
        return "***Urun Fiyat Listesi***" +
                "\n1-Kraker=" + kraker +
                "\n2-Cips=" + cips +
                "\n3-CocaCola=" + cocaCola +
                "\n4-Fanta=" + fanta +
                "\5-Su=" + su +
                "\n6-Cay=" + cay +
                "\n7-FiltreKahve=" + filtreKahve;
    }
}
