package challange.Day13.email;

public class email {
    public static void main(String[] args) {


    /*
    İşe yeni başlayan arkadaşlarımızın kullanımı için arkadaşlara şirket maili ve şifresi create edilip verilmelidir.
            --> ** Bir sonraki sprintte create edilen bu mail otomatik olarak IT Manager, HR Manager, Team Lead e mail atılacaktır. Bunu göz önünde bulundurarak proglama yapınız.
    Nitelikler:
    firtsName: Çalışan İsmi
    lastName: Çalışan soyadı
    passWord: Çalışan şifresi
    department: Çalışılacak Departman
    email: Çalışan Email
    emailSuffix: Şirket Domaini (clarusway.com)
    mailBoxCapasity : 1000
    defaultpassWordLenght : 12
    Metotlar:
    Çalışanın adı ve soyadı alacak şekilde parametreli bir construcor create ediniz (firtsName,lastName)
    setDepartment fonks. creat ediniz. Bu fonk çalışanın departmanını setlemek için kullanılmalıdır. Şirket departmanları aşağıdaki tabloda belirtilmiştir. Çalışanın istihdam edileceği departman emailine eklenecektir.
            testautomation.
                    fullstackdeveloper.
                    salesforce.
                    hiçbiri (Eğer çalışan yukarıda ki departmanlardan birinde istihdam edilmiyorsa mailine departman setlenmemelidir.)
    setRandomPassWord() password ün uzunluğunu alarak random bir şekilde password create edebilen bir fonk. olmalıdır. Kullanıcının passwordun de aşağıda belirtilmiş numeric, alphabetic ve speacil karakterler bulunabilir. ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi
    showInfo() çalışanın adı, soyadı, email, password unu konsolda gösterecek bir metot oluşturunuz.

     */

    String password = "";
    String karakterler = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        for(int i =0 ; i <12 ; i++){
            password += "" + karakterler.charAt((int) (Math.random() *( karakterler.length() - 1)));
    }
        System.out.println("password = " + password);
    }}