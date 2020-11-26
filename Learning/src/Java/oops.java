package Java;

public class oops {
	
//	int num;
//	String name;
//	String place;
//	
//	void display()
//	{
//		System.out.println(num);
//		System.out.println(name);
//		System.out.println(place);
//
//	}
//	
//	public static void main(String args[]) {
//		
//		oops op1=new oops();
//		op1.num=1;
//		op1.name="siva";
//		op1.place="hyd";
//		op1.display();
//			
//				}
	
	/////////// constructor////////
	
	int num;
	String name;
	String place;
	
	void setdata(int no, String nam, String pla){
		
		num=no;
		name=nam;
		place=pla;
	}
	void display()
	{
		System.out.println(num);
    	System.out.println(name);
	    System.out.println(place);
	}	
	public static void main(String args[]) {
		
		oops op1=new oops();
		op1.setdata(1, "siva","chand");
		op1.display();			
	}

}
