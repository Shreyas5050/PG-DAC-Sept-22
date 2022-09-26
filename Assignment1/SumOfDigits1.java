import java.util.Scanner;
class SumOfDigits1

{
	public static void main(String args[]){
		System.out.println("Enter the numbers ====>");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int sum=0,div,m;
		
		while(a>0)
		{
			m=a%10;
			sum=sum+m;
			a=a/10;
		}
		System.out.println("Sum of Digits =="+sum);
	}
}