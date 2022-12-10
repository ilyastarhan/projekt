package j19_StaticKeyword.Task03;

import java.util.ArrayList;

public class Runner {
    /*
    Task 03 ->
    Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
    Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                   derslerin toplam kredi miktarını return eden  toplamKredisi method
    Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                       alamayacagı dersleri print eden code create ediniz

     */

    public static void main(String[] args) {
        Lesson mat101 = new Lesson();
        mat101.lessonName = "Matematik";
        mat101.lessonCredit =3;

        Lesson java101 = new Lesson();
        java101.lessonName = "Java";
        java101.lessonCredit =6;

        Lesson fiz101 = new Lesson();
        fiz101.lessonName = "Fizik";
        fiz101.lessonCredit =4;

        Student ogrenci1 = new Student();
        ogrenci1.name = "Necdet";
        ogrenci1.maxCredit=10;
        ogrenci1.dersListesi = new ArrayList<>();

//        ogrenci1.dersEkle(mat101);
//        ogrenci1.dersEkle(java101);
//        ogrenci1.dersEkle(fiz101);

        if (ogrenci1.toplamKredisi()+ mat101.lessonCredit <= ogrenci1.maxCredit)
        {
            ogrenci1.dersListesi.add(mat101);
        }
        else
        {
            System.out.println("Kredi miktarını aştınız"+mat101.lessonName + " dersini alamazsınız");
        }

        if (ogrenci1.toplamKredisi()+java101.lessonCredit <= ogrenci1.maxCredit)
        {
            ogrenci1.dersListesi.add(java101);
        }
        else
        {
            System.out.println("Kredi miktarını aştınız"+java101.lessonName + " dersini alamazsınız" );
        }

        // bu ders max krediyi aştı ? bunun için ne yapabiliriz.
        if (ogrenci1.toplamKredisi()+ fiz101.lessonCredit <= ogrenci1.maxCredit)
        {
            ogrenci1.dersListesi.add(fiz101);
        }
        else
        {
            System.out.println("Kredi miktarını aştınız"+fiz101.lessonName + " dersini alamazsınız");
        }


        for(Lesson les :  ogrenci1.dersListesi)
        {
            System.out.println(les.lessonName + " " + les.lessonCredit);
        }

    }
    /*
     Scanner sc = new Scanner(System.in);
        ArrayList<Lesson> dersList = new ArrayList<>();
        ArrayList<Lesson> dersAlinan = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            System.out.println(i + ". dersin adını giriniz: ");
            String ders = sc.next();
            System.out.println(i + ".dersin kredisini giriniz: ");
            int kredi = sc.nextInt();
            Lesson dersveKredi = new Lesson(ders, kredi);
            dersList.add(dersveKredi);
            System.out.println(dersList.toString());
        }
        Students student1 = new Students();
        System.out.println("Ad soyadınızı giriniz");
        String studentName = sc.next();
        sc.nextLine();
        System.out.println("Alabileceğiniz  maksimum kredi sayısını giriniz");
        int maxcredit = sc.nextInt();

        student1.name = studentName;
        student1.maxCredit = maxcredit;
        student1.dersList = new ArrayList<>();
        int toplamKredi = 0;
        for (Lesson ders : dersList) {
            if (ders.lessonCredit +toplamKredi <= student1.maxCredit) {
                student1.dersList.add(ders);
                toplamKredi += ders.lessonCredit;
            } else {
                System.out.println("Kredi sınırını aştınız.");
                break;
            }
        }
        System.out.println("Alınan dersler ve ders kredileri: ");
        for (Lesson i : student1.dersList) {
            System.out.print(i.lessonName + " Dersi  " + i.lessonCredit+" kredi\n");
        }
        System.out.println();
        System.out.println("Alınamayan dersler ve ders kredileri: ");
        dersList.removeAll((student1.dersList));
        for (Lesson i : dersList) {
            System.out.println(i.lessonName + " Dersi  " + i.lessonCredit+" kredi\n");
     */
}
