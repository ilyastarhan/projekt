package challange.Kasim21;


public class Q03 {

    /*
    Q03_HackerLanguage

     Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
        Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0
        Test data
        hackerDili("java ile hersey guzel")
        j4v4 1l3 h3r53y guz3l
        İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)
     */
    public static void main(String[] args) {

        String str = "java ile hersey guzel";
        hackerDili(str);
        hackerDili2(str);


    }

    private static void hackerDili2(String str) {
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < str.length(); j++) {
            if (arr[j].contains("s")) {
                arr[j] = "5";
            }
            if (arr[j].contains("a")) {
                arr[j] = "4";
            }
            if (arr[j].contains("e")) {
                arr[j] = "3";
            }
            if (arr[j].contains("i")) {
                arr[j] = "1";
            }
            if (arr[j].contains("o")) {
                arr[j] = "0";
            }
            System.out.print(arr[j]);
        }
    }
    private static void hackerDili(String str) {
        System.out.println(
                        str.replaceAll("s", "5")
                        .replaceAll("a", "4")
                        .replaceAll("e", "3")
                        .replaceAll("i", "1")
                        .replaceAll("o", "0"));
    }
}
