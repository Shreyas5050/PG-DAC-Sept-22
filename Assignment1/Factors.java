import java.util.Scanner;
class Factors
{
	public static void main(String args[]){
		System.out.println("Enter the number ====>");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("Factors of number = "+a+" are====>>");

		
		for (int i=1;i<=a;i++){
			if (a % i== 0){
				System.out.print(i+" ");
			}
		}
	}
}
		

