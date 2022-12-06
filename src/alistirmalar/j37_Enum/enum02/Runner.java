package alistirmalar.j37_Enum.enum02;

public class Runner {

    public static void main(String[] args) {
        User kll1 = new User();
        kll1.name = "Ebubekir";
      //  kll1.role = 2;
      //  kll1.status=2;
        kll1.yetki=Role.ADMIN;
        kll1.durum=Status.LOGIN;

        User kll2 = new User();
        kll2.name = "Fatih";
        kll2.yetki=Role.CUSTOMER;
        kll2.durum=Status.ACTIVE;
        if(kll2.yetki==Role.ADMIN){
            System.out.println("sil de silelim");
        }
        else
            System.out.println("sefil customer");
    }
}
