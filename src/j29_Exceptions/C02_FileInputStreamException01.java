package j29_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_FileInputStreamException01 {
    public static void main(String[] args) throws IOException { // parent class exception
 //   public static void main(String[] args) throws FileNotFoundException {   // read() method öncesi child exception
/*

     Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
     bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
     Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


    Bir kod yazilirken olasi exception'lar ongorulup
    exception olustugunda Java'nin ne yapmasini istedigimiz
    belirtilmelidir.


         1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

   2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
Class'inin parent class Hz.Adem
 */
        FileInputStream fis = new FileInputStream("C:\\Users\\ilyas\\IdeaProjects\\javaLearn\\src\\j29_Exceptions\\ebikGabik");
// eger bir method'da checked(CTE riski olan exception) exception varsa method signature
        // hata uyarisi verir. komutun derlenmesine izin vermez ve kod uzerine gelindiginde Add... exception uyarisi verir. otomatik throws exception
        //eklenir bu sekilde methodu cagiran komutlar try catch e alinmasi garanti edilmis olur
        int k;
        while((k=fis.read())!= -1){
            System.out.print((char)k);

        }
    }
}
