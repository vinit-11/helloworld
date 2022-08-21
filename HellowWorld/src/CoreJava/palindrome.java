package CoreJava;

public class palindrome {
	public static void palindromeNumber() 
	{
		int num =121;
		int temp=num;   //catch is here we store in temp bec we have to compare it
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			
			num=num/10;
		
		}
		if(temp==rev)
		{
			System.out.println(rev+ " Number is palindrome");
		}	
		else
		{
			System.out.println(rev+ " Number is not palindrome");
		}
	}
	
public static void main(String[] args) {
	palindromeNumber();
}
}
