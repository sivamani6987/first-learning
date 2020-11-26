package Java;

public class Circumference {
	
	public static void circumference(int t, double pi, double r) {
		
		double cir = t*pi*r;
		System.out.println("are of circumference" +cir);
		return;
	}

	public static void main(String[] args) {
		
	circumference(2,3.14,10);
	}

}
