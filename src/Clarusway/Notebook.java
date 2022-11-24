package Clarusway;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook extends Product {
    Scanner scan = new Scanner(System.in);

    static int nId = 1;
    static List<Notebook> noteBooks = new ArrayList<Notebook>();
    public Notebook(){

    }

    public Notebook(String name, double urunFiyati, double discountRate, int amount, double screenSize, int ram, int memory, Brand brand) {
        super(nId++, name, urunFiyati, discountRate, amount, screenSize, ram, memory, brand);

    }


    @Override
    public void menu() {

        System.out.println("... Ana Menü ...");
        System.out.println("1) Yeni Notebook Ekleme\n" +
                "2) NoteBook Listesini Görüntüleme\n" +
                "3) Notebook Silme\n" +
                "4) Markaya Göre Filtreleme");
        System.out.println("Lütfen yapmak istediginiz islemi seciniz...");
        int option = scan.nextInt();
        if (option == 1) addItem();
        if (option == 2) getProducts();
        if (option == 3) deleteItem();

    }

    @Override
    public void addItem() {
        System.out.println("Ürün Fiyati");
        double price = scan.nextDouble();
        System.out.println("Ürünün adi");
        String name = scan.nextLine();
        System.out.println("Ürün indirim orani");
        double discountRate = scan.nextDouble();
        System.out.println("Ürünün stogu");
        int amount = scan.nextInt();
        System.out.println("Ürünün Ram i");
        int ram = scan.nextInt();
        System.out.println("Ürünün Ekrani");
        double screenSize = scan.nextDouble();
        System.out.println("Ürünün hafizasi");
        int memory = scan.nextInt();
        System.out.println("Lütfen ürünün markasini Listeden Seciniz");
        Brand.printBrands();
        Brand brand = Brand.getBrand(scan.nextInt());
        Notebook notebook = new Notebook(name, price, discountRate, amount, screenSize, ram, memory, brand);
        noteBooks.add(notebook);
        System.out.println("Eklenen ürün id'si: " + notebook.getId());


    }

    @Override
    public void getProducts() {


    }

    @Override
    public void deleteItem() {
        getProducts();
        System.out.println("silmek isteginiz ürünün id sini giriniz: ");
        int id = scan.nextInt();
        if (noteBooks.size() > id) {
            noteBooks.remove(id - 1);
        }
    }

    public void print(List<Notebook> noteBooks) {
        for (Notebook notebook : noteBooks) {
            System.out.println(notebook.toString());
        }

    }
}
