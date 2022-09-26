import java.util.Scanner;
class Palindrome
{
	public static void main(String args[]){
		System.out.println("Enter the numbers ====>");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		int r,sum=0,temp;
		temp=a;
		while(a>0)
		{
			r =a%10;
			sum =(sum*10)+r;
			a=a/10;
		}
		
		if(temp==sum)
		{
				System.out.println("Number is Palindrome");
		}
		else{
		System.out.println("Number is not a Palindrome");	
		}
	}
}