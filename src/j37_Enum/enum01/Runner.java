package j37_Enum.enum01;

public class Runner {
    public static void main(String[] args) {
        //Task -> verilen bir ay numarasına göre kaç gün çektiğini print eden code create ediniz
       // int ay = 3;
        Aylar ay=Aylar.MART;//Aylar enum'ından ay field value MART olarak tanımlandı
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());
        switch (ay) {
            case OCAK:
                System.out.println("ocak 31 gundur..");
                break;
            case SUBAT:
                System.out.println("subat 28 gundur..");
                break;
            case MART:
                System.out.println("mart 31 gundur..");
                break;
            case NISAN:
                System.out.println("nisan 30 gundur..");
                break;
            case MAYIS:
                System.out.println("mayıs 31 gundur..");
                break;
            case HAZIRAN:
                System.out.println("haziran 30 gundur..");
                break;
            case TEMMUZ:
                System.out.println("temmuz 31 gundur..");
                break;
            case AGUSTOS:
                System.out.println("agustos 31 gundur..");
                break;


        }
        System.out.println("agam dewamkeee  ..... ");

    }
}
