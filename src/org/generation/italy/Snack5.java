package org.generation.italy;

public class Snack5 {
	
	public static void main(String[] args) {
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		//valore min
		int minValue = arr[0];
		
		//valore min
		int maxValue = arr[0];
		
		//avg 
		int average = 0;
		
		//somma
		int sum = 0;
		
		for (int i=0; i < arr.length; i++){
			
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
			else if (arr[i] < minValue) {
				minValue = arr[i];
				
			}
			sum += arr[i];
			average = sum /arr.length;			
			
		}
		System.out.println("Valore minimo : " + minValue);
 		System.out.println("Valore massimo : " + maxValue);
 		System.out.println("Sommatoria : " + sum);
 		System.out.println("Media : " + average);
		
		
		
		
		
	}
}



//trovare il valore minimo
//trovare il valore massimo
//calcolare la media
//calcolare la sommatoria
