
public class MyClass1 {
	
	public static void main(String[] args) {
		int i = 5; // 4 Bytes (32 bits) (-2147483648 to 2147483648)
		double r = 9;
		i = 9;
		char s = 'A';
		System.out.print(i+r);
		System.out.print("  ");
		int p = (int)12.7;
		System.out.print(s+i);// long 8 Bytes, int 4Bytes, short 2 bytes, byte 1Byte 
		System.out.print("  ");
		System.out.print(p);//this is the variable p
	}

}
