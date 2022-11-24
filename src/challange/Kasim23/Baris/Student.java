package challange.Kasim23.Baris;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    private String ad;
    private int no;
    ArrayList<Student> student = new ArrayList<>();
    Lesson lesson= new Lesson();
    public Student() {
    }

    public Student(String ad, int no) {
        this.ad = ad;
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }



    public  void ogrenciKaydet() {
        System.out.println("Lütfen Ad ve Soyadınızı giriniz:");
        String ad = sc.nextLine();
        System.out.println("Lütfen Öğrenci numaranızı giriniz:");
        int ogrNo = sc.nextInt();
        Student ogr1=new Student(ad,ogrNo);
        student.add(ogr1);
        System.out.println("Ad Soyad: " + ogr1.ad + " Öğrenci No: " + ogr1.no + ":\n\t***Ders seçme ekranına hoş geldiniz.***");

        lesson.dersEkle(ogr1);

    }











































}
