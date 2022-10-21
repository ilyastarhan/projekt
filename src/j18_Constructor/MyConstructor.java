package j18_Constructor;

public class MyConstructor {

    int x=3;
    int y=5;

    public MyConstructor() {
        x+=1;
        System.out.println("-x"+x);
    }

    public MyConstructor(int i ){
        this();
        this.y = i;
        x+=y;
        System.out.println("-x"+x);

    }

    public MyConstructor(int i, int i2) {
        this(3);
        this.x -= 4;
        System.out.println("-x"+x);
    }

    @Override
    public String toString() {
        return "MyConstructor{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        MyConstructor mc1= new MyConstructor(4,3);


    }
}