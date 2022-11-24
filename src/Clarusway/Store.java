package Clarusway;

import java.util.Scanner;

public class Store {
    Scanner scan = new Scanner(System.in);

    public void run(){
        System.out.println("Magazaya hosgeldiniz\n" +
                "Lütfen isleminizi seciniz: ");
        System.out.println("1- NoteBook islemleri\n" +
                "2- MobilePhone islemleri\n" +
                "3- Cikis");
        switch (scan.nextInt()){
            case 1 : Notebook notebook = new Notebook();
            notebook.menu();
            break;
            case 2 : Brand.printBrands();
            break;
            case 3 :
                System.out.println("Sikis yapiliyor");
                System.exit(0);
                break;

        }
    }
}
