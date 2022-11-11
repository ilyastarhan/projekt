package j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {

        try {
            LocalDate date = LocalDate.of(2022, 2, 33);//DateTimeException
        }

   catch(DateTimeException e) {
       System.out.println("Hata yakalandi");
       System.out.println("e = " + e.getMessage());
   }
        System.out.println("Program calismaya devam ediyor");
    }
}