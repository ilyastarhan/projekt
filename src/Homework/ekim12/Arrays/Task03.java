package Homework.ekim12.Arrays;

import java.util.Arrays;

public class Task03 {
	
	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

		int arr[] = {1,2,3,4,5,6,7,8};
		int yeniarr[] = new int[arr.length];
			for(int i = 0 ; i < arr.length ; i++) {
				if (i == arr.length - 1) {
					yeniarr [arr.length-1] = arr[0];
				}
				else{
				yeniarr[i] = arr[i + 1];}
		}
		System.out.println(Arrays.toString(yeniarr));


	}

}
