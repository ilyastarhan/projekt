package j25_Encapsulation.Task01;

import java.util.Scanner;

public class Main {
    /*
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

    Main classın içinde;
    girilen değerleri aşagıdaki gibi print eden code create ediniz
    Örnek:
    age 12'dir.
    name Steven'dır.

    name(isim) olarak;
    "Student name is Steven"
    ve
    age(yaş) olarak da;
    "He is 12 years old"


 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim giriniz: ");
        String name = scan.nextLine();
        System.out.println("Lütfen yasinizi giriniz: ");
        int age = scan.nextInt();
        Student student1 = new Student(name,age);

    }
}
