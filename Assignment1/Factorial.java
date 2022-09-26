import java.util.Scanner;
class Factorial
{
	public static void main(String args[]){
		System.out.println("Enter the number for Factorial====>");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		int fact=1;
		for(int x=1;x<=a;x++){
			fact =fact *x ;
		}
		System.out.println("Facorial of"+a+" is =====> "+fact );
		
		
	}
}