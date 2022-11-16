package j33_Interface.j33_Interface.Task04;

public interface IMuhendis {
    int x = 15;
    default int myMethod() {

        return 12;

    }

    void askerlik_durumu_sorgula();

    String mezuniyet_ortalamasi(double derece);

    void adli_sicil_sorgula();

    void is_tecrubesi(String[] array);
}

