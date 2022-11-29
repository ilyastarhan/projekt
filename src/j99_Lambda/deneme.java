package j99_Lambda;

public class deneme {
    String myStr = "9009";
    public void doStuff(String str){
        int myNum = 0;
        try{
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }
        catch(NumberFormatException e){
            System.out.println("Error");
        }
        System.out.println("myStr: "  + myStr + " myNum: " + myNum);
    }

    public static void main(String[] args) {
        deneme deneme1 = new deneme();
        deneme1.doStuff("7007");
    }
}
