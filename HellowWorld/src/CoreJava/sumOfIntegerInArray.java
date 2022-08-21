package CoreJava;

public class sumOfIntegerInArray {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		int sum=0;
		for (int i=0; i<=ar.length-1; i++) {
			
			sum=sum + ar[i];

		}
		System.out.println("Sum is : "+sum);
	}
}
