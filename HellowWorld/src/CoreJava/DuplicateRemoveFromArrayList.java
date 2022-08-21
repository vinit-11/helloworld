package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateRemoveFromArrayList {
	public void removeDuplicate() {

	ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,4,6,7,2,3,5,4,3,8,2,8)); 
	
	LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);		//LinkedHashSet is an ordered and sorted collection of HashSet
	
	ArrayList<Integer> numbersListWithoutDuplicate = new ArrayList<Integer>(linkedHashSet);

	System.out.println(numbersListWithoutDuplicate);
}
	public static void main(String[] args) {
		DuplicateRemoveFromArrayList obj=new DuplicateRemoveFromArrayList();
		obj.removeDuplicate();
	}
}
