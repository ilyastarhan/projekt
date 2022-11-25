package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class alistirma {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ali","Veli","Selami");

        Optional<List<String>> opt = Optional.ofNullable(names);

        names = opt.orElseGet(()-> new ArrayList());

        names = opt.orElseGet(ArrayList::new);
        System.out.println(names);

    }
}
