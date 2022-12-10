package j37_Enum.enum02;

public class Runner {
    public static void main(String[] args) {
        User kll1=new User();
        kll1.name="guzel insan ebu bekir ";
       // kll1.role=0;
       // kll1.status=2;
        kll1.yetki=Role.ADMIN;
        kll1.durum=Status.INACTIVE;

        User kll2=new User();
        kll2.name="kutsal şehir mıhtarı fatih bey ";
        // kll1.role=0;
        // kll1.status=2;
        kll2.yetki=Role.CUSTOMER;
        kll2.durum=Status.LOGIN;
        if (kll1.yetki==Role.ADMIN){

            System.out.println("agam muhur sende suleyman da sensin sil de silelim ");
        }else System.out.println("teee allam ya admin değil hava 1500 sefil customer :( ");

        if (kll2.yetki==Role.ADMIN){
            System.out.println("agam muhur sende suleyman da sensin sil de silelim ");
        }else System.out.println("teee allam ya admin değil hava 1500 sefil customer :( ");


    }
}
