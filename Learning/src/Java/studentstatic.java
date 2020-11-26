package Java;

public class studentstatic {
	
	int num;
	String name;
	static String college = "qis";
	
	studentstatic(int x, String y){
		
		num = x;
		name = y;
		System.out.println(num+" "+name+" "+college);
	}

	public static void main(String[] args) {
	
		studentstatic st = new studentstatic(1,"siv");
		studentstatic st1 = new studentstatic(2,"div");
		studentstatic st2= new studentstatic(3,"man");

		
	
	}
}
