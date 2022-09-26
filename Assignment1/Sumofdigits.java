import java.util.Scanner;
class Sumofdigits{
	public static void main (String args[]){
		System.out.println("Sum of digits ================>");
		
		int a=12345;
		int div1=a/10;
		int D =a%10;
		
		int div2=div1/10;
		int D1=D%10;
		
		
		
		int div3=div2/10;
		int D2=D1%10;
	
		
		int sum =D+D1+D2;
		System.out.println("Sum of digits"+sum);
		
	
		
	}
}