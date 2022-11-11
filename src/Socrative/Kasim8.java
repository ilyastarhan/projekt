package Socrative;

public class Kasim8 {


    public static void main(String[] args) {
        String str = "Java is so Good";
        String strOutput ="";
        for (int i = 0; i < str.length(); i++) {
            int counter=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            if(!strOutput.contains(String.valueOf(str.charAt(i)))){ //char olan karakteri String e donsuturduk
                strOutput += "" + str.charAt(i)  + counter +  " ";
            }
        }
        System.out.println(strOutput);



                //   /*
        //   1)Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
//
        //    */
        //    int carpim=1;
        //    ArrayList<Integer> ciftListesi = new ArrayList<Integer>();
        //    ArrayList<Integer> sayiList1 = new ArrayList<>(Arrays.asList(3,6,5,9,45,14,25,63,78,985,65,45,12));
        //    for(Integer value : sayiList1){
        //        if(value%2==0){
        //            ciftListesi.add(value);
        //            carpim*=value;
        //        }
        //    }
        //    System.out.println("ciftListesi = " + ciftListesi);
        //    System.out.println("carpim = " + carpim);
        //    /*
        //    2)Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz. Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
        //    (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
//
        //     */
//
        //    /*
        //    3)Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
        //    Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
//
        //     */
        //    // Cozum 1->
//
        //    ArrayList<Integer> sayiList2 = new ArrayList<>(Arrays.asList(-12, 18, -5, 23, -2));
        //    int maxNegatifSayi = Integer.MIN_VALUE;
        //    int minPozitifSayi = Integer.MAX_VALUE;
        //    for (Integer integer : sayiList2) {
        //        if (integer > 0 && integer < minPozitifSayi) {
        //            minPozitifSayi = integer;
        //        }
        //        if (integer < 0 && integer > maxNegatifSayi) {
        //            maxNegatifSayi = integer;
        //        }
        //    }
        //    System.out.println("minPozitifSayi = " + minPozitifSayi);
        //    System.out.println("maxNegatifSayi = " + maxNegatifSayi);
//
        //    /*
        //    4) String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
        //    Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JJM
//
        //     */
        //    String[] arr = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        //    for(String value : arr){
        //        if(value.endsWith("n") || value.endsWith("k")){
        //            System.out.print(value.charAt(0));
        //        }
        //    }
        //    /*
        //    5)Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız. Örnek; 223878  ́ 37
//
        //     */
        //    int sayi = 223878;
        //    String sayiS = String.valueOf(sayi);
        //    String unique = "";
        //    for(int i = 0 ; i < sayiS.length(); i++){
        //        int count =0;
        //        for(int j = 0 ; j <sayiS.length(); j++){
        //            if(sayiS.charAt(i)==sayiS.charAt(j)){
        //                count++;
        //            }
        //        }
        //        if(count==1 && !unique.contains(String.valueOf(sayiS.charAt(i)))){
        //            unique+=""+sayiS.charAt(i);
        //        }
        //    }
        //    System.out.println("unique = " + unique);
        //    /*
        //    5)Nested Ternary kullanarak Apex kodunu yazınız.
        //    Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
        //    Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir. Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
//
        //     */
//
        //    Scanner scan = new Scanner(System.in);
        //    System.out.println("Enter year : ");
        //    int year = scan.nextInt();
        //    boolean leapYear = true;
        //    leapYear = (year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        //    System.out.println("leapYear = " + leapYear);
//
//
        //    /*
        //    6)Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //    a) Son basamak 5 'e eşit ve 5 den büyükse, yuvarlama işlemi: "Son basamağı bir üst ondalı-
        //    ğa yuvarla"
        //    b) Son basamak 5 den küçükse, yuvarlama işlemi: "Son basamağı bir alt ondalığa yuvarla"
//
        //     */
        //    System.out.println("Sayi giriniz: ");
        //    double sayi2 = scan.nextDouble();
        //    if(sayi2%10 >=5){
        //        sayi2 = Math.ceil(sayi2);
        //    }
        //    else sayi2 = Math.floor(sayi2);
        //    System.out.println("sayi2 = " + sayi2);
//
        //    /*
        //    7)Ali 5 Şubat 2015 saat 10:15 EST'de doğmuştur, Veli 6 Mart 2015 saat 12:25 EST'de doğmuştur.
        //    Ali ve Veli'nin doğum süreleri arasındaki fark nedir?
//
//
        //     */
        //    LocalDateTime aliDogum = LocalDateTime.of(2015,2,5,10,15);
        //    LocalDateTime veliDogum = LocalDateTime.of(2015,3,6,12,25);
        //    Duration fark = Duration.between(aliDogum, veliDogum);
        //    System.out.println("fark.toDays() = " + fark.toDays());
        //    System.out.println("fark.toHours() = " + fark.toHours());
//
        //    /*
        //     8)Ali, 29 Ekim 1923'ten 45 yıl 8 ay 5 gün sonra doğmuştur.
        //    Veli, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce doğmuştur.
        //    Ali ve Veli'nin kesin doğum tarihini hesaplamak için kodu yazınız.
        //    Ali ve Veli'nin doğum tarihinin aynı olup olmadığını kontrol etmek için kodu yazınız.
//
        //     */
        //    LocalDate aliDogum2 = LocalDate.of(1923,10,29);
        //    aliDogum2 = aliDogum2.plusMonths(5).plusMonths(8).plusYears(45);
        //    LocalDate veliDogum2 = LocalDate.of(1993,9,15);
        //    veliDogum2 = veliDogum2.minusMonths(2).minusYears(24).minusDays(11);
        //    System.out.println("aliDogum2 = " + aliDogum2);
        //    System.out.println("veliDogum2 = " + veliDogum2);
        //    System.out.println("aliDogum2.isEqual(veliDogum2) = " + aliDogum2.isEqual(veliDogum2));
//
        //    /*
        //    9)Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
        //    Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
//
        //     */
        //    String str = "1a3Bcf4!...";
        //    int rakamHarici = str.replaceAll("\\d", "").length();
        //    System.out.println("rakamHarici = " + rakamHarici);
//
        //    /*
        //    10)Üçgen sayıları dizisi, doğal sayıların eklenmesiyle oluşturulur.
//
        //      Yani 7. üçgen sayısı 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28 olur. İlk on terim şöyle olur:
//
        //                                                            1, 3, 6, 10, 15, 21, 28, 36, 45, 55, …
//
        //      İlk yedi üçgen sayısının çarpanlarını sıralayalım:
//
        //       1: 1
        //       3: 1,3
        //       6: 1,2,3,6
        //      10: 1,2,5,10
        //      15: 1,3,5,15
        //      21: 1,3,7,21
        //      28: 1,2,4,7,14,28
        //      28'in beşten fazla böleni olan ilk üçgen sayı olduğunu görebiliriz.
//
        //        Beş yüzün üzerinde böleni olan ilk üçgen sayısının değeri kaçtır?
//
        //     */
//      ArrayList<Integer> list = new ArrayList<Integer>();
//      int ucgenSayi = 0;
//      for (int i = 1; i <= Long.MAX_VALUE; i++) {
//      int toplam = 0;
//      int count = 0;
//      for (int j = 1; j <= i; j++) {
//          toplam += j;
//      }
//      list.add(toplam);
//      for (int j = 1; j <= toplam; j++) {
//          if (toplam % j == 0) {
//              count++;
//          }
//      }
//      if (count > 500) {
//          System.out.println(list.get(list.size() - 1));
//          break;
//      }
//  }

//
        /*
        11)Pozitif tamsayılar kümesi için aşağıdaki yinelemeli dizi tanımlanır:

                     n → n/2 (n çifttir)

                     n → 3n + 1 (n tektir)


Yukarıdaki kuralı kullanarak ve 13’den başlayarak aşağıdaki diziyi oluşturuyoruz:

                   13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1


""Bu dizinin (13'ten başlayıp 1'de biten) 10 terim içerdiği görülebilir.

Henüz kanıtlanmamış olmasına rağmen (Collatz Problemi), tüm başlangıç sayılarının

 1'de bittiği düşünülmektedir.""


Bir milyonun altındaki hangi başlangıç sayısı en uzun zinciri oluşturur?


NOT: Zincir başladıktan sonra terimler bir milyonun üzerine çıkabilir.*/


    //    HashMap<Integer, Integer> list5 = new HashMap<>();
    //    int count;
    //    int sayi;
    //    int enUzunSeri = 0;
    //    int sayi2 =0;
    //    for(int i = 1; i < 25000; i++) {
    //        sayi=i;
    //        count =0;
    //        do {
    //        if (sayi % 2 == 0) {
    //            sayi /= 2;
    //        } else {
    //            sayi = (sayi * 3) + 1;
    //        }
    //        count++;
    //    } while (sayi != 1);
    //        if(count>enUzunSeri){
    //            enUzunSeri = count;
    //            sayi2 = i;
    //        }
    //    }
    //    System.out.println("en uzun zincire sahip sayi : " +sayi2);
    //    System.out.println("zincir uzunlugu = " + enUzunSeri);

    }
}
