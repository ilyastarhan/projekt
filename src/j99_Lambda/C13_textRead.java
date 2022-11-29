package j99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class C13_textRead {

    public static void main(String[] args) throws IOException {

        Path lys = Path.of("src/j99_Lambda/ilyas");//eroisilecek dosyanin path adresi tanimlandi
        Stream<String> akis = Files.lines(lys);
        Stream akis1 = Files.lines(Path.of("src/j99_Lambda/ilyas"));
        System.out.println("****Task01****");
        akis.//erisimi verilen dosyadaki satirlar akisa alindi
                forEach(t-> System.out.println(t+" "));//akistaki satirlar print edildi
        System.out.println("\n");
        System.out.println("****Task02****");
        //TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
        Files.
                lines(Path.of("src/j99_Lambda/ilyas")).
                map(String::toUpperCase).
                forEach(t-> System.out.println(t+ " "));
        System.out.println("\n");

        //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..
        System.out.println("****Task03****");
        Files.lines(Path.of("src/j99_Lambda/ilyas")).
                limit(1).
                map(String::toLowerCase).
                forEach(t-> System.out.println(t));
        //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println(Files.lines(Path.of("src/j99_Lambda/ilyas")).
                map(String::toLowerCase).
                filter(t -> t.contains("bas")).
                count());
    }
}
