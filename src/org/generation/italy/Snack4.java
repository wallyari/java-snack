package org.generation.italy;

 import java.util.Random;

 public class Snack4 {

 	public static void main(String[] args) {

 		int[] array1 = {0,1,2,3,4,5,6,7,8,9,10};
 		int[] array2 = {0,1,2,3,4};

 		int lengthDiff = 
 				array1.length > array2.length      	//condizione
 					? array1.length-array2.length 	//?valore1
 					: array2.length-array1.length;  //:valore2

 		Random rand= new Random();

 		for(int i=0; i<lengthDiff;i++)
 		{
 			System.out.println(rand.nextInt());
 		}

 	}

 }
 
// Snack4 (Bonus)
// Crea due array che hanno un numero di elementi diversi. 
// Mostra a video dei nuovi elementi random finchè il numero di elementi presenti nell'array che ne ha di meno 
// + quelli mostrati a video non è uguale al numero di elementi presenti nell'array che ne ha di più
// --
// Creare due array di dimensione diversa e stampare un numero di valori interi casuali pari alla differenza 
// di dimensione (es: arr1.length = 3; arr2.length = 10;  --> stampo 7 valori interi casuali)
