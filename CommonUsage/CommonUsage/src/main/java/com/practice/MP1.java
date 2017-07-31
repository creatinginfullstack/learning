package com.practice;

import java.util.*;
public class MP1 {

	public static void main(String[] args) {
		
		
		String name="";
		Scanner id=new Scanner(System.in);
		System.out.print("Enter your Name: ");
		name=id.nextLine();
		System.out.print("Hello: "+name);
		
		new MP1().all();		
	}
	
	    public void all(){
	    	call();
	    	choice();
	    	}
	    
	    private void choice(){
	    	
	    	Scanner ch=new Scanner(System.in);
	    	String inp;
	    	System.out.println("\nDo you want to try another? [Y/N]");
	    	inp=ch.nextLine();
	    	if(inp.equals("Y")||inp.equals("y")){
	    		call();
	    	}else if(inp.equals("N")||inp.equals("n")){
	    		System.out.println("\nThank You!");
	    		System.exit(0);
	    	}else{
	    		System.out.println("\nError, Invalid Input!");
	    		choice();	
	    	}
	    }
	    
		private void call() {

			Scanner in=new Scanner(System.in);
			System.out.print("\nTell me what you want to do. Here are your Options:"
	         		+ "\n[1] Determine if a number is ODD or EVEN (input: ANY integers)"
	         		+ "\n[2] Determine who is tallest (input: height of 3 person)"
	         		+ "\n[3] Determine if a number is PRIME or NOT (input: ANY integers)"
	         		+ "\n[4] EXIT");
			System.out.print("\nEnter your Number Choice: ");
			
			int choices=in.nextInt();
			
			switch(choices){
			
			case 1: System.out.print("[1] Determine if a number is ODD or EVEN (input: ANY integers)");
			{
				int num;
				Scanner in1=new Scanner(System.in);
				System.out.print("\nEnter Number: ");
				num=in.nextInt();
			if ( num % 2 == 0 )
		        System.out.println("The Number "+num+" is EVEN");
		     else
		        System.out.println("The Number "+num+" is ODD");
			}
			choice();
			break;
			
			case 2: System.out.println("[2] Determine who is tallest (input: height of 3 person)");
		      int x, y, z;
		      String a,b,c;
		      Scanner in2a = new Scanner(System.in);
		      Scanner in2b = new Scanner(System.in);
		      System.out.println("Enter Name1: ");
		      a = in2a.nextLine();
		      System.out.println("Enter Height: ");
		      x = in2b.nextInt();
		      System.out.println("Enter Name2: ");
		      b = in2a.nextLine();
		      System.out.println("Enter Height: ");
		      y = in2b.nextInt();
		      System.out.println("Enter Name3: ");
		      c = in2a.nextLine();
		      System.out.println("Enter Height: ");
		      z = in2b.nextInt();
		 
		      if ( x > y && x > z )
		         System.out.println(a+" is the Tallest");
		      else if ( y > x && y > z )
		         System.out.println(b+" is the Tallest");
		      else if ( z > x && z > y )
		         System.out.println(c+" is the Tallest");
		      else   
		         System.out.println("Two or Three Person have a same Height");
		   
			choice();
			break;
		
			case 3: System.out.print("[3] Determine if a number is PRIME or NOT (input: ANY integers)");
			int num, i, count=0;
			Scanner in3=new Scanner(System.in);
			System.out.print("\nEnter Number: ");
			num=in3.nextInt();
			for(i=2; i<num; i++){
				if(num%i==0){
					count++;
					break;
				}
			}
			if(count==0){
				System.out.println("The Number "+num+" is a Prime Number");
			}else{
				System.out.println("The Number "+num+" is not a Prime Number");
			}
			choice();
			break;
			
			case 4: System.out.print("Thank You!");
			System.exit(0);
			break;
			
			default: System.out.print("Error, Invalid Input!");
			call();
			break;	
	}
	}

}
