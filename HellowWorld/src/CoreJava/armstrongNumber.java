package CoreJava;

public class armstrongNumber {

	public static void armstronNum() {
		int num=371;
		int temp=num;     //we store num in temp bec we need to compare values of final num and num at the end
		
		double result = 0;
		int remainder;
		
		
		while(temp!=0) {		//while loop is use to loop through temp until it is ==0
			
			remainder=temp%10;		//one each iteration, last digit store in remainder
			
			result=(result+Math.pow(remainder, 3));  //remaindr is power 3 using mathfunction and add in result declare result is as double
			
			temp=temp/10;			//last num is removed
		}
		if(result==num) {
			System.out.println(num+": Is an armstrong number");
		}else
		{
			System.out.println(num+": Is not an armstrong number");
		}
	}
public static void main(String[] args) {
	armstronNum();
}	
}
