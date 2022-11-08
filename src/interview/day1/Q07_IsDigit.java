package interview.day1;

public class Q07_IsDigit {
      /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */
      public static void main(String[] args) {

          String str = "J4\\/4 1$ 34$¥";
          int sum = 0;
          for(int i = 0; i< str.length(); i++){
              if(Character.isDigit(str.charAt(i))){
                  sum+= Integer.parseInt(""+str.charAt(i));
              }
          }
          System.out.println("sum = " + sum);
      }


}
