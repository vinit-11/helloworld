package CoreJava;

public class secondLargest {

	public static void  findSecondLargest() {
		int []a= {1,2,3,4,5,6};
		int temp;
		
		for(int i=0; i<a.length; i++) {
			
				for(int j=i+1; j<a.length; j++) {
					
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
				}
			}
		
		System.out.println("Second largest : "+a[a.length-2]);
	}
	public static void main(String[] args) {
		findSecondLargest();
	}
}
