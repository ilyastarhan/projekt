package j11_MethodCreation;

public class C04_MethodDepo {


    public static void gecmeNotu(int not) {
        if (not >= 85) {
            System.out.println("agam cok basarilisin");
        } else if (not >= 70) {
            System.out.println("agam basarilisin");
        } else if (not >= 60) {
            System.out.println("agam sinirdasin");
        } else if (not >= 45) {
            System.out.println("agam ucuz yirttin");
        } else System.out.println("agam üzgünüm kaldin");
    }
    public static void topla(int a, int b) {
        System.out.println(a + b);

    }

}
