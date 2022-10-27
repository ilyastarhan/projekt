package j22_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {
        /*
format->
GUN
d : basta 0 varsa 0 yazmadan gun numarasi yazılır
dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
DDD : yilin kacinci gunu oldugunu yazar
E, EE, EEE : gun isminin ilk 3 harfi
EEEE : gun isminin tamamini

AY (Ay icin M, dakika icin m kullanilir)
M : basta 0 varsa 0 yazmadan ay numarasi yazılır
MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi yazılır
MMM : Ay isminin ilk 3 harfi yazılır
MMMM : Ay isminin tamami yazılır

YY : yilin son iki rakamini
YYYY : Yilin tamamini yazılır

Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

HH : saatin tamami, tek rakamli saat olursa 02 gibi
H  : tek rakamli saat olursa sadece saati yazar

hh :  12 saat dilimine gore 2 rakam olarak yazılır
h : 12 saat dilimine gore tek rakam olanlari tek olarak yazılır

m : minute tek rakamlari tek yazlır
mm: tek rakamlari 08 gibi yazılır

a yazarsak AM veya PM degerini yazar


*/

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yy/HH:mm:ss a");
        System.out.println(localDateTime.format(formatter));
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        System.out.println(localDateTime.format(formatter1));

    }}