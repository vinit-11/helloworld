package CoreJava;

public class swapingOf2 {
	
	public static void swap()
	{	
		
		int a=10;
		int b=20;
		
		System.out.println("Before swapping a " +a);
		System.out.println("Before swapping b " +b);
		
		b=b-a;
		a=a+b;
		
		
		System.out.println("After swapping a " +a);
		System.out.println("After swapping b " +b);
	}
	
	public static void swap2()
	{	
		int c;
		int a=10;
		int b=20;
		
		System.out.println("Before swapping a " +a);
		System.out.println("Before swapping b " +b);
		
		c=a;
		a=b;
		b=c;
		
		
		System.out.println("After swapping a " +a);
		System.out.println("After swapping b " +b);
	}
	

	
	
	public static void main(String[] args) {
		swap();
		swap2();
	}

}
