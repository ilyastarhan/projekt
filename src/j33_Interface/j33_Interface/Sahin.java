package j33_Interface.j33_Interface;

public class Sahin extends Tofas implements dısDonanım, icDonanım, Lastik {//conc child class extens-> Tofas , impelemts->dısDonamım,icDonanım,Lastik

    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastik ebat :)");
        System.out.println("Dr bu ne insan yiyecek bunu :)");
    }

    @Override
    public void jant() {
        System.out.println("agam snin gibi janti adama çelik 5 kollu jant  yakısır :)");
    }

    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor ");
    }

    @Override
    public void yakıt() {
        System.out.println("agam TÜPitak yoka ocagın incir ağacı :( ");
    }

    @Override
    public void kapi() {
        System.out.println("agam 4 kapı sedan ");
    }

    @Override
    public void kaporta() {
        System.out.println("agam akordion kaporta gamzesiz olmazzz :) ");
    }

    @Override
    public void koltuk() {
        System.out.println("agam deri koltuk yazın pişik yapar içi saman olmasın kafi :) ");
    }

    @Override
    public void klima() {
        System.out.println("agam aç camı serinle klima senin neyine : )");
    }
}
