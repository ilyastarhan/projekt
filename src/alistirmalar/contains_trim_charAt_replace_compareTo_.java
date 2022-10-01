package alistirmalar;

public class contains_trim_charAt_replace_compareTo_ {
    public static void main(String[] args) {
        String diller = "Ingilizce, Fransizca, Ispanyolca Türkce";
        String diller2 = "almanca";

        System.out.println(diller.contains("Fransizca"));
        System.out.println(diller.charAt(20));
        System.out.println(diller.replace("Ispanyolca", "Arapca"));
        System.out.println(diller);
        System.out.println(diller.trim());
        System.out.println(diller.compareTo(diller2));
        String diller3 = diller.substring(15,20);
        System.out.println(diller3);


    }
}
