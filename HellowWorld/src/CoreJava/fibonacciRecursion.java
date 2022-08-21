package CoreJava;

public class fibonacciRecursion {

	static int a=0;
	static int b=1;
	static int c;
	public static void recursion(int i) 
	{
		if (i>=1)
		{
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
			recursion(i-1);		
		}
			
	}
	
	public static void main(String[] args) {

		System.out.print(a+ " " +b);
		recursion(10);
	}
	
	
}
