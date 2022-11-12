package j32_Abstract.Ornek5;

public class TechnoKitchen extends TechnoCafe {
    public static void Pisir(IFood yemek) {
        System.out.println("******" + yemek.getClass().getSimpleName() + "****hazırlanıyor...");

        if (yemek instanceof AdanaKebap) {
            AdanaKebap kebap = (AdanaKebap) yemek;
            kebap.marinade();
            kebap.grill();
        } else if (yemek instanceof Lahmacun) {
            Lahmacun lahmacun = (Lahmacun) yemek;
            lahmacun.dough();
            lahmacun.taste();
            lahmacun.bake();
            lahmacun.topping();
        }
        if (yemek instanceof Borsh) {
            Borsh borsh = (Borsh) yemek;
            borsh.boil();
            borsh.eatTomorrow();
        }
        if (yemek instanceof Palov) {
            Palov palov = (Palov) yemek;
            palov.fry();
            palov.boil();
        }
        yemek.taste();
    }
}
