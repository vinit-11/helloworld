package CoreJava;

public class maxInArray {

	public static void max(){
		int [] arr = {1, 70, 67, 98, 678,455 };
		int max = Integer.MIN_VALUE; 

		for ( int element : arr){
			if(element>max)
			{
				max=element;
			}
		}
		System.out.println("Max element is " + max);
	}


	public static void min() {
		int [] arr = {1, 45, 67, 98, 455, 678,-6};
		int min = Integer.MAX_VALUE;

		for ( int element : arr){ 
			if(element<min)
			{
				min=element;
			}
		}
		System.out.println("Min element is " + min);
	}
	public static void main(String[] args) {
		max();
		min();
	}
}

