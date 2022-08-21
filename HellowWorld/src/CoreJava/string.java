package CoreJava;

public class string {
	
	
	public void stringRev() {

		String str="welcome";
		String rev="";
		
		for (int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Revese of string is : "+rev);
	
	}
	
	
	
	public void intRev() {
		int num=102030;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("Reverse of integer is : "+rev);
	}
public static void main(String[] args) {
	string obj =new string();
	obj.stringRev();
	obj.intRev();
		
}
}
