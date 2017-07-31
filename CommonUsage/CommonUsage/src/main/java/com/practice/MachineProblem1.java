package com.practice;

import java.util.Scanner;

public class MachineProblem1 {

	private static final String userOptions = "Tell me what you want to do. Here are your options: \n"
			+ "[1] Determine if a number is ODD or EVEN(input: Any integer) \n"
			+ "[2] Determine who is the tallest (input: height of 3 person) \n"
			+ "[3] Determine if a number is PRIME or NOT (Input: any integer) \n"
			+ "[4] EXIT \n";
	
	public static void main(String[] args) {
		
		System.out.print("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		try {
			String name = scanner.nextLine();
			System.out.println("Hello " + name + "\n");
			
			System.out.println(userOptions);
			
			System.out.print("Enter your answer here: ");
			int optionSelected = scanner.nextInt();
			
			switch (optionSelected) {
			case 1:
				System.out.println("Selected option: [1] Determine if a number is ODD or EVEN(input: Any integer).");
				break;

			case 2:
				System.out.println("Selected option: [2] Determine who is the tallest (input: height of 3 person).");
				break;

			case 3:
				System.out.println("Selected option: [3] Determine if a number is PRIME or NOT (Input: any integer).");
				break;
				
			case 4:
				System.out.println("[4] EXIT");
				break;
				
			default:
				System.out.println("Invalid option.");
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null!= scanner) {
				scanner.close();
			}
		}
	}
	
	public boolean isEven(int number) {
		boolean isEven = false;
		
		int remainder = number % 2;
		
		if(remainder == 0) {
			isEven = true;
		}
		
		return isEven;
	}
}
