import java.util.Scanner;
class Reverse
{
	public static void main(String args[]){
		System.out.println("Enter the numbers ====>");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		int reverse=0,rem;
		while(a!=0)
		{
			rem=a%10;
			reverse =reverse *10 +rem;
			a=a/10;
		}
		
		System.out.println("Reversed Number is =="+reverse);
	}
}