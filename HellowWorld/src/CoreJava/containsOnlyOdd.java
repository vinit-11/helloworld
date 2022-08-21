package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class containsOnlyOdd{

public static void odd() {
	List<Integer> ar=new ArrayList<Integer>(Arrays.asList(1,3,2,5,4,10,6,7,9,8));
//	ar.add(1);
//	ar.add(3);
//	ar.add(2);
//	ar.add(5);
//	ar.add(4);
	
	Collections.sort(ar);
	System.out.println(ar);
	Collections.reverse(ar);
	System.out.println(ar);
/*	for(int c:ar)
	//	System.out.println(c);
	{
		if(c%2==0)
		{
			
			System.out.println("List contain even");
		}else
		{
			System.out.println("List contain only odd");
		}
	
	}*/
	}
public static void main(String[] args) {
	odd();
}
}