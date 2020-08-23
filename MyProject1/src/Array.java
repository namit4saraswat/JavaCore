
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r[] = {40,22,44};
		
		int d[][] = {
				{1,2,3},
				{4,5,6,0},
				{7,8,9}
					};
		
		for (int k : r)
		{
		System.out.println (k);
		}
		
		for (int k[] : d)
			{
			for (int l : k)
			{
				System.out.println (l);
			}
			}
		
		System.out.print("length of array r" + r.length + "lenght of array d" + d.length + "lenght of 2nd row" + d[1].length);
	}

}
