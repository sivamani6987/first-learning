package Java;

public class atm {

	public static void main(String[] args) {
		
		double bal = 5000;
		double amt = 2000;
		
	if(amt<bal) {
		
		System.out.println("withdraw money" +amt);
		
		bal = bal-amt;
		System.out.println("Currentbal " +bal);
	}
	else {
		System.out.println("Insufficient FUnds");
	}
	
	}

}
