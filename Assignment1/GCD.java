import java.util.Scanner;
class GCD
{
	public static void main(String args[]){
		System.out.println("Enter the two numbers ====>");
		System.out.println("1 number ==");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("2 number ==");
		Scanner sc1 =new Scanner (System.in);
		int b =sc1.nextInt();
		int gcd=1;
		for (int i =1; i<=a && i<=b;++i)
		{
			if(a%i==0  && b%i==0)
			{
			   gcd =i;	
			}
		}
		System.out.println("GCD of  "+a+" and "+b+" is "+gcd);
}
}
		
		
		