package GuessTheMovie;

import java.util.*;

public class Game {
    String selectedMovie = "";
    String movieUnderScores = "";
    static Scanner scan = new Scanner(System.in);

    ArrayList<String> movieList = new ArrayList<String>(List.of("the shawshank redemption",
            "the godfather",
            "the dark knight",
            "schindler's list",
            "pulp fiction",
            "the lord of the rings",
            "the good the bad and the ugly",
            "fight club",
            "the lord of the rings",
            "forrest gump",
            "star wars",
            "inception",
            "the lord of the rings",
            "the matrix",
            "samurai",
            "star wars",
            "city of god",
            "the silence of the lambs",
            "batman begins",
            "die hard",
            "chinatown",
            "room",
            "dunkirk",
            "fargo",
            "no country for old men"));

    public void displayMovieList() {
        for (String movieName : movieList) {
            System.out.println(movieName);
        }
    }

    public void randomlyPick() {
        Random rand = new Random();
        int num = rand.nextInt((movieList.size() - 1));
        this.selectedMovie = movieList.get(num).toLowerCase().replaceAll(" ", "");
        this.movieUnderScores = movieList.get(num).replaceAll("\\w", "_").replaceAll(" ", "");
    }

    public void run() {
        int count = 0;

        String girilenHarfler = "";
        randomlyPick();
        System.out.println(selectedMovie);
        while (true) {
            int count2 = 0;
            System.out.println("Su filmi tahmin etmeye calisiyorsun");
            System.out.println(movieUnderScores);
            System.out.println("Toplam yanlis tahmin sayisi " + count);
            System.out.println("Lütfen tahmin icin harf gir : ");
            char ch = scan.next().toLowerCase().charAt(0);
            for (int i = 0; i < selectedMovie.length(); i++) {
                if (selectedMovie.charAt(i) == ch) {
                    movieUnderScores = movieUnderScores.substring(0, i) + ch + movieUnderScores.substring(i + 1);
                    count2++;
                }
            }
            if (count2 == 0) {
                System.out.println("olmayan harf girdiniz");
                count++;
            }
            girilenHarfler += ch + " ";
            System.out.println(girilenHarfler);

            if (!movieUnderScores.contains("_")) {
                System.out.println("Tebrikler bildiniz");
                break;
            }
        }
    }
}