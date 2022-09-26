class P2{
	public static void main(String args[]){
		int c=0;
		for (char i=65;i<=69;i++)
		{
			for(char j=65;j<=i;j++)
			{
				c=c+j;
				System.out.print(j+" ");
				
			}
			
			c=0;
			System.out.println();
		}
	}
}