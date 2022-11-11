package j29_Exceptions;

public class C07_IllegalArgumentException02 {
    public static void main(String[] args) {
        try {

            System.out.println("agam try block basından  selam :) ");
            hata();
            System.out.println("agam try block sonundan selam :) ");

        } catch (IllegalArgumentException e) {

            System.out.println("agam catch block basından  selam :) ");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("agam catch block sonundan  selam :) ");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur

    }//main sonu

    public static void hata() {
        throw new IllegalArgumentException("Agam nidding yine mi hata :( ");
    }

}
