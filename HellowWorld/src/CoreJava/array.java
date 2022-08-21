package CoreJava;

public class array {
	
	
	public static void stringRev() {
		
		String st="Welcome";
		String rev="";
		for(int i=st.length()-1; i>=0; i--)
		{
			rev=rev+st.charAt(i);
		}
			System.out.println(rev);
		}
	


	public static void integerRev() {

		int num = 12345; 
		int rev = 0; 
		while(num !=0)
		{
			rev =rev*10 + num % 10;
			num = num/10;
		}
		System.out.println (rev);
	}


	public void revArray() {
		int []a= {1,2,3,4,5};
	
		
		for(int i=a.length-1 ;i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}


	public static void rev() {
		int [] arr = {1, 45, 67, 98, 455, 678};
		int l = arr.length;
		int n = Math.floorDiv(1,2); 
		int temp;

		for(int i=0; i<n;i++){
			temp= arr[i];
			arr[i]= arr[l-i-1];
			arr[l-i-1]= temp;
		}
		for(int element:arr)
		{
			System.out.println( element + " ");
		}
	}

	public static void main(String[] args) {
		//	array obj=new array();
		//	obj.revArray();
		//	rev();
		integerRev();
		//stringRev();
	}
}
