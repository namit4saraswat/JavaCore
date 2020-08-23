class Calcula // this is super class/ Parent class/ Base class
{
	public int addition(int a, int b)
	{
	return a+b;
	}
}

class calcadv extends Calcula  // this we call inheritance, it's subclass/ child class/ Derived class
{
	public int subtraction(int a,int b)
	{
		return a-b;
	}
}


class verycalcadv extends calcadv  // this we call multilevel inheritance
{
	public int multip(int a,int b)
	{
		return a*b;
	}
}

public class Inheritance {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcula obj = new Calcula();
		verycalcadv obj3 = new verycalcadv();
		int m= obj3.addition(75,86);
		int n=obj3.subtraction(75,86);
		int o=obj3.multip(23,32);
		System.out.println (m);
		System.out.println (n);
		System.out.print (o);
		
	}

}
