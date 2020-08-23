public class Casio {
	
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(double i, double j)
	{
		System.out.println(i+j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Casio obj = new Casio();
		obj.add(10,20);
		obj.add(10,20,30);
		obj.add(1.5,5.7);
		//Same name different paramter is method overloading
		// same way multiple constructor can be created and that would be called construtor overloading.
	}

}
