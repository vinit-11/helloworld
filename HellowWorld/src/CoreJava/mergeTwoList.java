package CoreJava;

import java.util.ArrayList;

import java.util.List;

public class mergeTwoList {
	static int a[]= {1,3,5};
	static int b[]={2,4,6};

	public static void merge() {


		List<Integer> odd=new ArrayList<Integer>();

		for(int ele:a) {
			odd.add(ele);
		}
		System.out.println("List1 :"+odd);


		List<Integer> even=new ArrayList<Integer>();
		for(int ele1:b) {
			even.add(ele1);

		}
		System.out.println("List2 :"+even);


		List<Integer> joined=new ArrayList<Integer>();
		joined.addAll(odd);
		joined.addAll(even);
		System.out.println("Joined List : "+joined);
	}
	public static void main(String[] args) {
		merge();
	}
}
