package j16_ArrayList;

public class yeni {

        protected void finalize() {
            System.out.println("Removed");
        }

        public static void main(String[] args) {
            yeni c = new yeni();
        }
    }
