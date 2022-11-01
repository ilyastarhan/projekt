package challange.Day15.printf;

public class TemelBilgiler {
    public static void main(String[] args) {

            //https://www.digitalocean.com/community/tutorials/java-printf-method

                int sayi = 753;
                String str = "Bootcamp Clarusway";
                double db = 3.89563056;

        System.out.println(sayi + "-" + str + "-" + db);
        System.out.printf("sayi :%d,str :%s, db :%f\n", sayi, str, db);//sayi :753,str :Bootcamp Clarusway, db :3,895631
        System.out.printf("sayi :%d, str :%S, db :%f\n",sayi,str,db);//sayi :753, str :BOOTCAMP CLARUSWAY, db :3,895631
        System.out.printf("sayi: %10d, str :%-10.10S, db :%-5.3f\n",sayi,str,db);//sayi:        753, str :BOOTCAMP C, db :3,896
        // %10d -> 10 hanelik yer ayir, kapasite
        //%-20.10S -> sola yaslayarak 20 birimlik kapasite ver, string ifadenin büyük harf ile 10 karakterini yazdir
        //%-5.3f -> sola yaslayarak 5 birimlik kapasite ver ve virgülden sonra 3 hane yazdir
        //%x.y -> x: sayi kapasitesi ve (-, )yönü, y: katakter sayisi
        System.out.printf("sayi: %-10d, str: %-8.8s, db: %09.4f",sayi,str,db); //sayi: 753       , str: Bootcamp, db: 0003,8956



    }
        }



