package j23_Varargs_StringBuilder.Varargs;

public class Deneme {

        static void fun2(String str, int... a){
            System.out.println("String: " + str);
            System.out.println("Number of argument is: " + a.length);
            for(int i : a)
                System.out.println(i+ " ");
            System.out.println();
        }

    public static void main(String[] args){

        fun2("GeeksforGeeks", 100,200);
        fun2("CSPortal", 1, 2, 3, 4, 5);
        fun2("forGeeks");
    }
}
