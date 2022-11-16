package org.generation.italy;

public class Snack6 {

 	public static void main(String[] args) {

 		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
 		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
 		int[] arr3 = new int[10];

 		int totalSum = 0;
 		int minValue = 100;
 		int maxValue = 0;


 		System.out.println("Somma del valore degli array: ");

 		for (int i = 0; i < arr3.length; i++) {

 			int summedValue = arr1[i] + arr2[i];

 			if ( arr1[i] > maxValue) {
 				maxValue = arr1[i];
 			
 			} else if (arr1[i] < minValue) {
 				minValue = arr1[i];
 			}

 			if ( arr2[i] > maxValue) {
 				maxValue = arr2[i];
 			
 			} else if (arr2[i] < minValue) {
 				minValue = arr2[i];
 			}

 			arr3[i] = summedValue;

 			totalSum += summedValue;

 			System.out.println(arr3[i]);

 		};

 		double totalAverage = totalSum / (double) (arr1.length + arr2.length);
 		System.out.println("----------------");
 		System.out.println("Il valore minimo degli array: " + minValue);
 		System.out.println("Il valore massimo degli array: " + maxValue);
 		System.out.println("La media totale: " + totalAverage);
 		System.out.println("La somma totale: " + totalSum);
 	}
 }

//calcolare un array sommatoria dove ogni elemento corrisponde alla somma degli elementi dei due array alla stessa posizione

//trovare il valore minimo all'interno di entrambi gli array
//trovare il valore massimo all'interno di entrambi gli array
//calcolare la media di entrambi gli array (assieme)
//calcolare la somma di tutti gli elementi di entrambi gli array