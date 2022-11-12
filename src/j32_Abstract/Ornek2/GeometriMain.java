package j32_Abstract.Ornek2;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen(3, 5);
        dd.setName(" yeni dikdörtgen");
        System.out.println(dd);

        Cember cmbr = new Cember(4);
        cmbr.setName(" yeni çember");
        System.out.println(cmbr);

    }
}
