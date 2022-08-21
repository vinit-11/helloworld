package CoreJava;


public class uniqueInArray {

	public static void main(String args[])

	{
		int [] arr = {1,1,1,2,2,2,3,3,3,4,4,5,5,6,7,8,};

		for (int i= 0; i < arr.length; i++)
		{

			int count1 = 0; 				// to find out how many time value is appeared in the array

			for (int j = 0; j < arr.length; j++)
			{

				if(arr[i] == arr[j] )
				{    
					count1++; 
				}
			}
				if(count1 == 1 )
				{
					System.out.print(arr[i]+" ");// 6 7 8 uniqe
				}

		}
	}
}

