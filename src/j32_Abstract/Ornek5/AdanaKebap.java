package j32_Abstract.Ornek5;

public class AdanaKebap implements IFood {
    @Override
    public void taste() {
        System.out.println("Adanaya gidek mi kebabından yiyek mi? ");
    }

    @Override
    public double ucret() {
        return 5.0;
    }

    public void marinade() {
        System.out.println("Et sirke  ve baharatla  marine edildi... ");
    }

    public void grill() {
        System.out.println(" hafif ateşte pişiriliyor");
    }
}
