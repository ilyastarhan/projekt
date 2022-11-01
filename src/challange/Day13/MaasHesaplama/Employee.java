package challange.Day13.MaasHesaplama;

public class Employee {/*
    Java da fabrika çalışanlarını temsil eden bir class oluşturunuz.
    Class Name: Employee
    Nitelikleri:
    name: İşçi Adı
    salary: İşçi Maaşı
    workHours: Haftalık Çalışma Saati
    year: Çalışmaya Başladığı Yıl
    Metotları:
    Parametreli Constructor create edilmelidir. Sınıfın nitelikleri aynı zamanda constructor ın parametresi olmalıdır.
    vergi() → Maaşa uygulanan vergiyi hesaplamayabilen bir metot oluşturunuz.
            salary < 10000 $
            vergi = 0
    salary >= 10000 $
            vergi = (salary *3 /100)
    bonus() → Haftalık Çalışma Saatine göre bonus verilebilen bir metot oluşturunuz.
            workHours > 40
    Her bir saate 50$
    maasArtis() → İşçinin işe başlangıç yılına göre maaş artışına etki edebilecek oranı hesaplayan bir metot oluşturunuz.
            5 yıldan az çalışıyor ise
    artis = ((salary + tax) *5)/100
            ** Maaş Artışlarına uygulanan vergiyi de dahil ediniz.
[5-15) arası
            artis = ((salary + tax)  * 10)/100
            [+15-Now]
    artis = ((salary + tax)  * 20)/100
    toString() → Çalışanın bilgilerini konsola yazdıracak bir metot oluşturunuz (İşçi Adı, Maaş , Uygulanan Vergi, Toplam Maaş (Maaş + Bonus), Maaş Artışı)


*/

    String name;
    double salary;
    int workHours;
    int year;



    public Employee(String name, double salary, int workHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }

    public double tax() {
        double tax;
        if (salary < 10000)
            tax = 0;
        else tax = salary * 0.03;
        return tax;
    }

    public int bonus() {
        int bonus = 0;
        if (workHours > 40)
            bonus = (workHours - 40) * 50;
        return bonus;
    }



    public double maasArtis() {
        double artis =0;
        if (2021 - year > 15)
            artis = (salary + tax()) * 0.20;
        else if ((2021 - year) > 5)
            artis = (salary + tax()) * 0.10;
        else artis = (salary + tax()) * 0.05;
        return artis;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", tax=" + tax() +
                ", totalsalary=" + (salary+bonus()) +
                ", maasArtis=" + maasArtis()+
                '}';
    }

}
