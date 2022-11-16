package org.generation.italy;

import java.util.Scanner;


public class Snack1 {
	
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);		
		System.out.println("Inserire un numero");
		int num = scanner.nextInt();
		scanner.close();
		
		if((num %2)==0) {
			System.out.println(num);
		}else{
			System.out.println((num +1));
		}
				
	
	}
	

}
