package challange.Day03;

public class Q03_NestedTernary {
    public static void main(String[] args) {
        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */

        char final_Note = 'D';
        String result = final_Note == 'A' ? "Gayet basarili" :
                final_Note == 'B' ? "Basarili" :
                final_Note == 'C' ? "Ha gayret" : "Digerleri";
        System.out.println("result = " + result);
    }
}
