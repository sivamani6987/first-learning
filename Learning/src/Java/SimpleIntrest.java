package Java;

public class SimpleIntrest {

	public static void intrest(int p, int t,int r, int b) {
		
		int si = p*t*r/b;
		
		System.out.println("simple intrest " +si );
		
	}
	public static void main(String[] args) {

		intrest(12,1243,1,100);
	}

}
