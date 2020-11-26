package Java;

public class Overloading {
	
	public static void sumof(int a, int b) {
		 
		int c= a+b;
		System.out.println("sum of two numbers " +c);
		return;
		
	}

	public static void sumof(int a,double b) {
		
		double c = a*b;
		System.out.println("multiply of two umbers "+c);
		return;
		
	}
	public static void main(String[] args) {
			
		sumof(2,3);
		sumof(3,3.3);

	}

}
