
public class Pattern {
	

	public static void main(String[] args) {
		
		for (int i=1;i<=6;i++)
		{
		for (int j=1;j<=i;j++)
		
			{
				System.out.print ("*" + " ");
				
			}
				System.out.println();
		}
		
		for (char i='A';i<='A'+2;i++)
		{
		for (char j='A';j<=i;j++)
		
			{
				System.out.print (j + " ");
				
			}
				System.out.println();
		}
		
		for (int i=1;i<=4;i++)
		{
		for (int j=1;j<=4;j++)
		
			{	if((i*j)==6 || (i*j)==9 || i==2 && j ==2)
					System.out.print (" " + " ");
				else
					System.out.print ("$" + " ");
				
			}
				System.out.println();
		}
		
	}

}
