package org.generation.italy;

public class Snack3 {
	public static void main(String[] args) {
		
		int [] numInt = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i=0; i < numInt.length; i++) {
			
			if(i % 2!= 0) {
				
				sum += numInt[i];
			}
					
		}
		System.out.println(sum);
				
	}

}

//Snack3
//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari