package CoreJava;

public class removeDuplicateAraay {
	
	public static void removeDuplicate() 
	{
		
		int ar[]= {1,2,2,3,4,4,5,6,6,7,8,9,9,10};
		int temp[]=new int[ar.length];
		int k=0;
		
		for(int i=0;i<ar.length-1;i++)
		{
				
				if(ar[i]!=ar[i+1])        //!= is must
				{
					temp[k]=ar[i];
					k++;
				}
		}
		
			temp[k]=ar[ar.length-1];    //to store last element in array
			
			for(int i=0;i<temp.length;i++) 
			{
				System.out.println(temp[i]+" ");
			}
			
	}
	
	
	public static void printFindDuplicate() {
		
		int ar[]= {1,2,2,3,4,4,5,6,6,7,8,9,9,10};
		
		for(int i=0; i<ar.length; i++) {
			
			for(int j=i+1; j<ar.length; j++) {
				
				if(ar[i]==ar[j]) 
				{
					System.out.println("Duplicate element are : "+ar[i]);
				}
			}
		}
		
		
		
	}
public static void main(String[] args) {
	removeDuplicate();
	printFindDuplicate();
}
}
