package CoreJava;

public class vowelPresent {
	public static void main(String[] args) {
		int countV=0;
		int countC=0;
		String str="vinit bhalkar";
		str.toLowerCase();

		for(int i=0; i<=str.length()-1; i++)

		{
			//if(str.contains("a")||str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u"))
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{

				countV++;
				System.out.println("Vowel is present :"+str.charAt(i));

			}else if(str.charAt(i)>'a' && str.charAt(i)<'z')
			{
				System.out.println("Consonant is present :"+str.charAt(i));
				countC++;
			}


		}
		System.out.println("Total vowel is : "+countV);
		System.out.println("Total consonant is : "+countC);
	}
}


