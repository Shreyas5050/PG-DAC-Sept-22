import java.util.Scanner;
class year{
	public static void main(String args[]){
      		System.out.println("Enter the year:");
			Scanner sc = new Scanner (System.in);
			int a=sc.nextInt();
			if (a%4==0){
			System.out.println("leap year");	
			}
			else
			{
				System.out.println("Not a leap year");
			}
	}
}