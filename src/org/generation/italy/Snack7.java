package org.generation.italy;

public class Snack7 {

 	public static void main(String[] args) {

 		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };

 		String phrase = "";
 		String longestWord = "";

 		for (int i = 0; i < words.length; i++) {

 			phrase += words[i] + " ";

 			if(words[i].length() >= longestWord.length()) {
 				longestWord = words[i];
 			}

 		}

 		System.out.println("Phrase: \r" + phrase);
 		System.out.println("Longest word: " + longestWord);

 		String reversedString = "";
 		String smallestWord = longestWord;

 		for (int i = words.length - 1; i >= 0; i--) {

 			reversedString += words[i] + " ";
 			if(words[i].length() < smallestWord.length()) {

 				smallestWord = words[i];

 			}

 		}

 		System.out.println("Reversed phrase: " + reversedString);
 		System.out.println("Smallest Word: " + smallestWord);

 	}
 }

//creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine
//creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine inverso
//trovare e stampare la parola piu' lunga e la sua lunghezza
//trovare e stampare la parola piu' corta e la sua lunghezza
