import java.util.Scanner;
class Smallestnum
{
	public static void main (String args[]){
		System.out.println("Enter the number");
		System.out.println("Enter 1 number");
		Scanner sc1 = new  Scanner (System.in);
		int a = sc1.nextInt();
		System.out.println("Enter 2 number");
		Scanner sc2 = new  Scanner (System.in);
		int  b = sc2.nextInt();
		System.out.println("Enter 3 number");
		Scanner sc3 = new  Scanner (System.in);
		int c = sc3.nextInt();
		System.out.println("Smallest Number =====>");
		
		int min = (a<b)?((a<c)?a:c):((b<c)?b:c);

		System.out.println("Smallest="+min);		
}}