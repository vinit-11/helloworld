package CoreJava;


import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		//switchcase() ;
		case1();
	}
	public static void case1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Letter :");
		char str=sc.next().charAt(0);
		
		if(str== 'a'||str=='e'||str=='i'||str=='o'||str=='u') 
		{
			
			System.out.println("The letter you have enter is vowel :"+str);
		}
		else
		{
			System.out.println("The letter you have enter is consonant :" +str);
		}
	}
public static void switchcase() {
	char ch='a';
	
	switch(ch) {
	case'a':
	case'e':
	case'i':
	case'o':
	case'u':
		System.out.println(ch+ " : is vowel");
		break;
	default:
		System.out.println(ch+" : is consonant");
		
	}
}
	
}
