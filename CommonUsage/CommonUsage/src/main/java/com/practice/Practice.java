package com.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		System.out.println("Enter a word: ");
		Scanner scanner = new Scanner(System.in);
		try {
			String word = scanner.nextLine();
			Practice practice = new Practice();
			boolean isPalindrome = practice.isPalindrome(word);
			if(isPalindrome) {
				System.out.println("The word " + word + " is a palindrome!");
			} else {
				System.out.println("The word " + word + " is NOT a palindrome!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null!= scanner) {
				scanner.close();
			}
		}
	}
	
	public boolean isPalindrome(String originalWord) {
		//System.out.println("word: " + originalWord);
		boolean isPalindrome = false;
		
		if(null != originalWord && !originalWord.isEmpty()) {
			StringBuilder reversedWord = new StringBuilder("");
			for (int i = originalWord.length() - 1; i >= 0; i--) {
				char currentChar = originalWord.charAt(i);
				//System.out.println("i: " + i + "; currentChar: " + currentChar);
				reversedWord.append(currentChar);
			}
			
			if(originalWord.equalsIgnoreCase(reversedWord.toString())) {
				isPalindrome = true;
			}
		}
		//System.out.println("isPalindrome: " + isPalindrome);
		return isPalindrome;
	}
}
