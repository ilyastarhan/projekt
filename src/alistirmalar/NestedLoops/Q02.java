package alistirmalar.NestedLoops;

public class Q02 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            if(i==4) {
                return; //exit current method
            }
            System.out.println(i);
        }
    }
}
