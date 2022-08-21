package CoreJava;

public class removeWhiteSpace {
public static void main(String[] args) {
	
	//String str="My name is vinit and i an in the world.";
	
	String str="Y^%^*%&*^*(&*(Pankaj";
	
	System.out.println("Before white spaces : "+str);
	
	
	
	//String s=str.replaceAll("\\s", "");            //We've used regular expression \\s that finds all white space characters (tabs, spaces, new line character, etc.) in the string. 
													//Then, we replace it with "" (empty string literal).
	
	
	String s=str.replaceAll("[^a-z, 0-9, A-Z]", "");
	
	
	System.out.println("After white spaces : "+s);
}

}
