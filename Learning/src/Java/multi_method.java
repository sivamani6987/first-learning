package Java;

//public class multi_method {
//	
//	public static void multi(int a, int b)
//	{
//		int c = a*b;
//		System.out.println("multiply  " +c);
//		return;
//	}
//	
//	
//	public static void main(String[] args) {
//      
//		multi(10,1);
//		multi(10,2);
//		multi(10,3);
//		multi(10,4);
//		multi(10,5);
//		
//	}
//
//}

public class multi_method{
	
	static void emp(int id, String name, int salary)
	
	{
		
		System.out.println("empdetails "+id+name+salary);
		return;
	}
	public static void main(String []args) {
		emp(001, "siva", 100);
		
		
	}
}