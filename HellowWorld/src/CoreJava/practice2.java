package CoreJava;

public class practice2 {

public static void method1() {
	
	for (int i =0; i<=4;i++) {
		for(int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void method2() {

	for (int i =0; i<=4;i++) {
	System.out.println("Hellow");
	continue;
	}
}
public static void main(String[] args) {
	method1();
}
}