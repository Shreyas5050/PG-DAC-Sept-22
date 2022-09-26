import java.util.Scanner;
class Digits {
	public static void main (String args[]){
		System.out.println("Enter the three digit number");
		System.out.println("Enter 1 digit");
		Scanner sc1 = new  Scanner (System.in);
		int a = sc1.nextInt();
		System.out.println("Enter 2 digit");
		Scanner sc2 = new  Scanner (System.in);
		int  b = sc2.nextInt();
		System.out.println("Enter 3 digit");
		Scanner sc3 = new  Scanner (System.in);
		int c = sc3.nextInt();
		System.out.println("Input values Digits =====>");
		
		
		switch (a)
		{
		
		
		case 1: 
			System.out.print("ONE ");
			break;
		case 2 : 
			System.out.print("TWO ");
			break;
		
		case 3 : 
			System.out.print("THREE ");
			break;
		
		case 4 : 
			System.out.print("FOUR ");
			break;
		
		case 5 : 
			System.out.print("FIVE ");
			break;
		
		case 6 : 
			System.out.print("SIX ");
			break;
		
		case 7 : 
			System.out.print("SEVEN ");
			break;
		
		case 8 : 
			System.out.print("EIGHT ");
			break;
		
		case 9 : 
			System.out.print("NINE ");
			break;
		
		case 10 : 
			System.out.print("TEN ");
			break;
		
        default :
		    System.out.print("Invalid input ");
	}
		

	
	switch (b)
		{
			case 1: 
			System.out.print("ONE");
			break;
			case 2 : 
			System.out.print("TWO");
			break;
		
		case 3 : 
			System.out.print("THREE");
			break;
		
		case 4 : 
			System.out.print("FOUR");
			break;
		
		case 5 : 
			System.out.print("FIVE");
			break;
		
		case 6 : 
			System.out.print("SIX");
			break;
		
		case 7 : 
			System.out.print("SEVEN");
			break;
		
		case 8 : 
			System.out.print("EIGHT");
			break;
		
		case 9 : 
			System.out.print("NINE");
			break;
		
		case 10 : 
			System.out.print("TEN");
			break;
		
        default :
		    System.out.print("Invalid input");
	}
	System.out.print(" ");
		
		switch (c)
			{
			case 1 : 
			System.out.print("ONE");
			break;
			case 2 : 
			System.out.print("TWO");
			break;
		    case 3 : 
			System.out.print("THREE");
			break;
		    case 4 : 
			System.out.print("FOUR");
			break;
		
		case 5 : 
			System.out.print("FIVE");
			break;
		
		case 6 : 
			System.out.print("SIX");
			break;
		
		case 7 : 
			System.out.print("SEVEN");
			break;
		
		case 8 : 
			System.out.print("EIGHT");
			break;
		
		case 9 : 
			System.out.print("NINE");
			break;
		
		case 10 : 
			System.out.print("TEN");
			break;
	
        default :
		    System.out.println("Invalid input");
	}
	
}}
