
public class Operator {
	/*
	 * Arithmatic + - / * %
	 * Bitwise 
	 * Relational
	 * Logical
	 */
public static void main(String[] args) {
	int m = 5; int n = 4;
	//m += 2
	//n++;//post increment, first assign the value to m and then increment m=n++
	m--;
	++n;//pre increment, first increment and then assign m=++n
	System.out.print(m+n);
}
}
