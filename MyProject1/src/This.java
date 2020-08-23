
public class This {
	static int a;
	static int b;
	
	public static void setData(int a, int b)
	{
		This.a=a;
		This.b=b;
	}

	public static void main(String[] args) 
	{
		
		This t = new This();
		
		// TODO Auto-generated method stub
		setData(4,3);
		System.out.println (t.a + " and b  is" +  t.b );
	}

}
