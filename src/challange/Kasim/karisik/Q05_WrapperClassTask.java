package challange.Kasim.karisik;

public class Q05_WrapperClassTask {

    // create a method that accepts an int
    // and returns twice of that int
    // overload this method with wrapper class: Integer

    // int kabul eden bir metot yarat
    // ve bu int'nin iki katını döndürür
    // bu yöntemi wrapper sınıfıyla overload et : Integer
    public static void main(String[] args) {
        System.out.println(twiceOfInt(5));
        Integer a = 5;
        System.out.println("twiceOfInt(a) = " + twiceOfInt(a));


    }

    public static int twiceOfInt(int num){
        return num*2;
    }
    public static Integer twiceOfInt(Integer num){

        return num*2;
    }
}
