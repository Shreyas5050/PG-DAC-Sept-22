import java.util.Scanner;
class Evenseries{
	public static void main (String args[]){
		System.out.println("Enter upto which you want Even series================>");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
			System.out.print("Even Series-- ");
		for(int i=1 ;i<=a;i++){
				if ( i%2==0)
				System.out.print(i+" ");
				
		}
		
		
	}
}