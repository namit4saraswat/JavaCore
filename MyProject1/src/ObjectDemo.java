class Calc  ///class will have variables & methods
{
	int num1;
	int num2;
	int result;
	// as whenever the objects are created for class, constructor is called, so JAVA by default creates constructor for the class.
	
	public Calc() // constructor name should be same as class name
	{
		num1=5;
		num2=7;
		System.out.println(num1); //constructor will be automatically called.
	}
	
	public Calc(int n)
	{
		num1=n;
		num2=n;
		System.out.println(num1);
	}
	
	public Calc(float m, float q)
	{
		num1=(int) m;
		num2=(int) q;
		System.out.println(num1);
		System.out.println(num2);
	}
	
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj = new Calc(12,55); //in order to use variables & methods, you need objects
		//Calc () is a constructor, as Calc is same name as class name & it has () after it.
		
		//System.out.println(obj.num2);
		
		
		// constructor will have same name as class name
		// constructor is a member method
		// constructor will never return anything
		// These are present by default within the class
		// It'll will be used to allocate memory
		
	}

}
