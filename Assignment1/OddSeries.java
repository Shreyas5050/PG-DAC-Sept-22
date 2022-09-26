import java.util.Scanner;
class Oddseries{
	public static void main (String args[]){
		System.out.println("Enter upto which you want odd series================>");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
			System.out.print("Odd Series-- ");
		for(int i=1 ;i<=a;i++){
				if ( i%2==0)
					continue;
				System.out.print(i+" ");
				
		}
		
		
	}
}