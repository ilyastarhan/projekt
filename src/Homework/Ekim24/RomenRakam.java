package Homework.Ekim24;

public class RomenRakam {
    public static void main(String[] args) {


     /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805

		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900
		   		 M 1000  D 500 C 100 L 50 X10 V 5 I 1
		*/
        System.out.println(romenToInt("MCMXLV"));
        System.out.println(intToRomen(149));
    }
        public static String intToRomen ( int a){
            String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
            int[] bolenler = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
            String romen = "";
            for (int i = roman.length - 1; i >= 0; i--) {
                while (a >= bolenler[i]) {
                    a -= bolenler[i];
                    romen += roman[i];
                }
            }

            return romen;
        }
    public static int romenToInt(String str) {
        int sayi = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'M':
                    sayi += 1000;
                    break;
                case 'D':
                    sayi += 500;
                    break;
                case 'C':
                    if (str.charAt(str.length() - 1) == 'C') {
                        sayi += 100;
                    } else if (str.charAt(i + 1) == 'M') {
                        sayi += 900;
                        i++;
                    } else if (str.charAt(i + 1) == 'D') {
                        sayi += 400;
                        i++;
                    } else
                        sayi += 100;
                    break;
                case 'L':
                    sayi += 50;
                    break;
                case 'X':
                    if (str.charAt(str.length() - 1) == 'X') {
                        sayi += 10;
                    } else if (str.charAt(i + 1) == 'C') {
                        sayi += 90;
                        i++;
                    } else if (str.charAt(i + 1) == 'L') {
                        sayi += 40;
                        i++;
                    } else
                        sayi += 10;
                    break;
                case 'V':
                    sayi += 5;
                    break;
                case 'I':
                    if (str.charAt(str.length() - 1) == 'I') {
                        sayi += 1;
                    } else if (str.charAt(i + 1) == 'X') {
                        sayi += 9;
                        i++;

                    } else if (str.charAt(i + 1) == 'V') {
                        sayi += 4;
                        i++;
                    } else
                        sayi += 1;
                    break;
            }
        }
        return sayi;
    }
    }
