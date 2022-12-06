package alistirmalar.j37_Enum.enum01;

public class Enum01 {
    public static void main(String[] args) {

        //Task -> verilen bir ay numarasına göre kaç gün çektiğini print eden code create ediniz
        //  Scanner scan = new Scanner(System.in);
        //  System.out.println("Ay girin: ");
        //  int ay = scan.nextInt();

        Aylar ay = Aylar.MART;
        //Aylar enum'indan ay field value MART olarak tanimlandi
        System.out.println("ay = " + ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());
        switch (ay) {
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:
                System.out.println("31 Gündür");
                break;
            case SUBAT:
                System.out.println("28 veya 29 gündür");
                break;
            case NISAN:
            case HAZIRAN:
            case EYLUL:
            case KASIM:
                System.out.println("30 Gündür");
                break;
        }

    }
}
