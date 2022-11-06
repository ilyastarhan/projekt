package TASK;

public class Urun {
    double kraker = 2.5;
    double cips = 2.2;
    double cocaCola = 2.2;
    double fanta = 2.0;
    double su = 1.0;
    double cay = 1.5;
    double filtreKahve = 1.99;
    double accountBalance = 3.0;
    double price;

    @Override
    public String toString() {
        return "***Urun Listesi***{" +
                "1-Kraker=" + kraker +
                ",2-Cips=" + cips +
                ",3-CocaCola=" + cocaCola +
                ",4-Fanta=" + fanta +
                ",5-Su=" + su +
                ",6-Cay=" + cay +
                ",7-FiltreKahve=" + filtreKahve +
                ",8-Bakiye Görüntüle=" + accountBalance +
                ",9-Cikis=" + price +
                '}';
    }
}
