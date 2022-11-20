package j32_Abstract.P04_okulYönetimi.ogrcOgrtYonetimi.deneme;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
    ArrayList<Student> studentList = new ArrayList<Student>();
    static String kisiTuru;

    public void girisPaneli() {

        System.out.println("===============================");
        System.out.println("Ögrenci Ögretmen Yönetim Paneli");
        System.out.println("===============================");
        System.out.println("\n1-Ögrenci Islemleri" + "\n2-Ögretmen Islemleri" + "\n3-Cikis");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                kisiTuru = "ÖGRENCI";
                islemMenusu();
                break;
            case 2:
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case 3:
                cikis();
                break;
            default:
                System.out.println("Hatali secim yaptiniz tekrar deneyiniz...");
                girisPaneli();
                break;
        }
    }

    public void islemMenusu() {
        System.out.println("====================ISLEMLER====================");
        System.out.println(
                "        \t\n1-Kayit Ekleme" +
                        "\t\n2-Kayit Arama" +
                        "\t\n3-Kayit Listeleme" +
                        "\t\n4-Kayit Silme" +
                        "\t\n5-Ana Menu" +
                        "\t\n6-Cikis");
        int secim = scan.nextInt();
        if (secim == 1) {
            ekleme();
            girisPaneli();
        } else if (secim == 2) {
            arama();
            girisPaneli();
        } else if (secim == 3) {
            listeleme();
            girisPaneli();
        } else if (secim == 4) {
            silme();
            girisPaneli();
        } else if (secim == 5) {
            girisPaneli();
        } else if (secim == 6) {
            cikis();
        } else {
            System.out.println("Hatali secim yaptiniz...");
            islemMenusu();
        }
    }

    public void cikis() {
        System.out.println("Iyi gunler dileriz");
    }

    public void ekleme() {
        scan.nextLine();
        System.out.println("Lütfen isim giriniz: ");
        String name = scan.nextLine();
        System.out.println("Lütfen soyisim giriniz: ");
        String surName = scan.next();
        String kimlikNo = "";
        while (true) {
            System.out.println("Lütfen kimlik no giriniz: ");
            kimlikNo = scan.next();
            if (kimlikNo.length() == 11 && kimlikNo.matches("[0-9]+"))
                break;
            else System.out.println(" Hatali kimlik numarasi girdiniz...");
        }
        int yas = 0;
        while (true) {

            System.out.println("Lütfen yas giriniz: ");
            scan.nextLine();
            yas = scan.nextInt();
            if (yas > 5 && yas < 70)
                break;
            else System.out.println("Hatali yas girdiniz...");
        }
        if (kisiTuru.equals("ÖGRENCI")) {
            System.out.println("Lütfen sinifi giriniz:");
            scan.nextLine();
            String sinif = scan.next();
            Student ogrenci = new Student(name, surName, sinif, kimlikNo, yas);
            studentList.add(ogrenci);
        } else {
            int id = 0;
            while (true) {
                System.out.println("Lütfen sicil no giriniz: ");
                id = scan.nextInt();
                if (id > 100 && id < 200)
                    break;
                else System.out.println("Sicil numarasi 100 ile 200 arasinda girilmelidir!");
            }
                System.out.println("Lütfen brans giriniz:");
                String brans = scan.next();
                Teacher ogrtmn = new Teacher(name, surName, id, brans, kimlikNo, yas);
                teacherList.add(ogrtmn);
            islemMenusu();
        }
    }

    public void arama() {
        if (kisiTuru.equalsIgnoreCase("ÖGRENCI")) {
            System.out.println("Lütfen arama yapmak istediginiz ogrencinin okul numarasini giriniz: ");
            int ogrNo = scan.nextInt();
            for (Student kisi : studentList) {
                if (kisi.getStudentNo() == ogrNo) {
                    System.out.println("aradiginiz ogrenci bilgileri " + "\n" + kisi);
                } else System.out.println("Aradiginiz ogrenci bulunamadi");
            }
        } else {
            System.out.println("Lütfen Ögretmen kimlik numarasini giriniz: ");
            int ogrtNo = scan.nextInt();
            for (Teacher teacher : teacherList) {
                if (ogrtNo == teacher.getId()) {
                    System.out.println("Aradiginiz Ögretmenin bilgileri : " + teacher);
                } else System.out.println("Aradiginiz ögretmen bulunamadi");
            }
        }
        islemMenusu();
    }

    public void listeleme() {
        if (kisiTuru.equals("ÖGRENCI"))
            System.out.println(studentList);
        else System.out.println(teacherList);
        islemMenusu();
    }

    public void silme() {
        if (kisiTuru.equals("ÖGRENCI")) {
            System.out.println("Lütfen kaydini silmek istediginiz ögrencinin numarasini giriniz");
            int no = scan.nextInt();
            for (Student student : studentList) {
                if (student.getStudentNo() == no) {
                    studentList.remove(student);
                    System.out.println("Kayit basarili bir sekilde silindi");
                    break;
                } else System.out.println("Ogrenci bulunamadi");
            }
        } else {
            System.out.println("Lütfen kaydini silmek istediginiz ögretmen numarasini giriniz");
            int no = scan.nextInt();
            for (Teacher teacher : teacherList) {
                if (teacher.getId() == no) {
                    teacherList.remove(teacher);
                    System.out.println("Kayit basari ile silindi");
                    break;
                } else System.out.println("Ögretmen kaydi bulunamadi");
            }
        }
        islemMenusu();
    }
}