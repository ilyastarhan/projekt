package Homework.ekim8;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		int num = 999;
		int sayac= 0;
		System.out.println("3 basamakli 4 ve 6 ya tam bolunebilen tam sayilar");
		while (num >99){
			if (num%4==0 && num%6==0){
				System.out.print(num + " ");
				sayac++;
			}

			num--;
		}
		System.out.println();
		System.out.println("toplam " + sayac + " sayi 4 ve 6 ile bölünebilir");

		
		

		
		
			
	}

}
