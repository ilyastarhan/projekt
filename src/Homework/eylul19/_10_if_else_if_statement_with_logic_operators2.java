package Homework.eylul19;

public class _10_if_else_if_statement_with_logic_operators2 {

    public static void main(String[] args) {

/* 60 değerinde bir int oluşturun.
Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
*/
        int num = 60;
        if (num%9==0 && num%9==0){
            System.out.println("Able to divide by 9 and 5");}
        if (num%4==0 && num%5==0){
            System.out.println("Able to divide by 4 and 15");}

    }
}
