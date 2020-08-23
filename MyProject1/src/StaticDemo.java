class Emp
{
	int eid;
	int sal;
	static char ceo; //static variable will be same for all the object
	
	//2:00:00 in video for static and not static variable 
	public void show()
	{
		System.out.println (eid + ":" + sal + ":" + ceo);
	}
	
}

public class StaticDemo {

	public static void main(String[] args) 
	{
		Emp naveen = new Emp();
		Emp rahul = new Emp();
		naveen.sal=4000;
		rahul.sal=5000;
		Emp.ceo='X';// because ceo static variable will be same for all objects so we can use class name
		// so you don't need object for static variable
		// in same way for static method you don't need object
		// that is the reason  we have static keyword in main method
		Emp.ceo='Y';
		naveen.eid=723984;
		rahul.eid=3477589;
		
		naveen.show();
		rahul.show();
	}
}
