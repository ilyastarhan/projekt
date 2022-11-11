package j29_Exceptions;

public class C01_ArithmeticException {
    public static void main(String[] args) {

        try {

            m(-12);

        }catch(IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

    }

    public static void m(int x) {

        if(x<0 || x>9) {

            throw new IllegalArgumentException("Good");

        }else {

            System.out.println(x);

        }

    }
    }
