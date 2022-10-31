package j23_Varargs_StringBuilder.StringBuilder;

public class pratik {
    public static void main(String[] args) {
        String s1= "java";
        StringBuilder s2 = new StringBuilder("java");
        if(s1.equals(s2))
            System.out.println("esit");
        else System.out.println("Esit degil");
        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1,2).length();
        System.out.println(total);
        total += letters.substring(6,6).length();
        System.out.println(total);
        total += letters.substring(6,5).length();
        System.out.println(total);

    }
}
