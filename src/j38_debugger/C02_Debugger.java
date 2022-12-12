package j38_debugger;

public class C02_Debugger { static int ebikGabık=7;//class level static global variable tanımlandı
    public static void main(String[] args) {
        method01();
    }//main sonu

    private static void method01() {
        System.out.println("   ***   method01 çalışıyor   ***   ");
        int a=0;//local variable tanımlandı
        ebikGabık++;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            a+=2*i;
        }
        System.out.println();
        System.out.println("   ***   method02 call ediliyor   ***   ");
        method02();
        System.out.println("   ***   method03 call ediliyor   ***   ");
        method03();

        System.out.println("   ***   method01 bitti   ***   ");
    }

    private static void method02() {
        System.out.println("   ***   method02 çalışıyor   ***   ");
        ebikGabık+=5;
        for (int x = 1; x <= 7; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("   ***   method02 bitti   ***   ");
    }

    private static void method03() {
        System.out.println("   ***   method03 çalışıyor   ***   ");
        ebikGabık-=3;
        for (int y = 1; y <= 5; y++) {
            System.out.print(y + " ");
        }
        System.out.println();

        System.out.println("   ***   method03 bitti   ***   ");
    }


}